package com.bfi.credit.services;

import com.bfi.credit.entities.Echeance;
import com.bfi.credit.repositories.EcheanceRepository;
import com.bfi.credit.services.interfaces.IEcheanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EcheanceService implements IEcheanceService {

    @Autowired
    private EcheanceRepository echeanceRepository;

    @Override
    public Echeance saveEcheance(Echeance echeance) {
        return echeanceRepository.save(echeance);
    }

    @Override
    public Echeance updateEcheance(Echeance echeance) {
        return echeanceRepository.save(echeance);
    }

    @Override
    public void deleteEcheance(Long id) {
        echeanceRepository.deleteById(id);
    }

    @Override
    public Echeance getEcheanceById(Long id) {
        return echeanceRepository.findById(id).orElse(null);
    }

    @Override
    public List<Echeance> getAllEcheances() {
        return echeanceRepository.findAll();
    }
}
