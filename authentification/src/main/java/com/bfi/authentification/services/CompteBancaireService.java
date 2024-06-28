package com.bfi.authentification.services;

import com.bfi.authentification.entities.CompteBancaire;
import com.bfi.authentification.repositories.CompteBancaireRepository;
import com.bfi.authentification.services.interfaces.ICompteBancaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompteBancaireService implements ICompteBancaireService {

    @Autowired
    private CompteBancaireRepository compteBancaireRepository;

    @Override
    public CompteBancaire saveCompteBancaire(CompteBancaire compteBancaire) {
        return compteBancaireRepository.save(compteBancaire);
    }

    @Override
    public CompteBancaire updateCompteBancaire(CompteBancaire compteBancaire) {
        return compteBancaireRepository.save(compteBancaire);
    }

    @Override
    public void deleteCompteBancaire(Long id) {
        compteBancaireRepository.deleteById(id);
    }

    @Override
    public CompteBancaire getCompteBancaireById(Long id) {
        return compteBancaireRepository.findById(id).orElse(null);
    }

    @Override
    public List<CompteBancaire> getAllCompteBancaires() {
        return compteBancaireRepository.findAll();
    }
}
