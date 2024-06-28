package com.bfi.credit.services;

import com.bfi.credit.entities.ContratCredit;
import com.bfi.credit.repositories.ContratCreditRepository;
import com.bfi.credit.services.interfaces.IContratCreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContratCreditService implements IContratCreditService {

    @Autowired
    private ContratCreditRepository contratCreditRepository;

    @Override
    public ContratCredit saveContratCredit(ContratCredit contratCredit) {
        return contratCreditRepository.save(contratCredit);
    }

    @Override
    public ContratCredit updateContratCredit(ContratCredit contratCredit) {
        return contratCreditRepository.save(contratCredit);
    }

    @Override
    public void deleteContratCredit(Long id) {
        contratCreditRepository.deleteById(id);
    }

    @Override
    public ContratCredit getContratCreditById(Long id) {
        return contratCreditRepository.findById(id).orElse(null);
    }

    @Override
    public List<ContratCredit> getAllContratCredits() {
        return contratCreditRepository.findAll();
    }
}
