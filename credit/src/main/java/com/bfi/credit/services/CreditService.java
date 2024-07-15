package com.bfi.credit.services;

import com.bfi.credit.entities.Credit;
import com.bfi.credit.repositories.CreditRepository;
import com.bfi.credit.services.interfaces.ICreditService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
@RequestMapping("/credit")
@RequiredArgsConstructor
public class CreditService implements ICreditService {

    @Autowired
    private CreditRepository creditRepository;

    @Override
    public Credit saveCredit(Credit credit) {
        return creditRepository.save(credit);
    }

    @Override
    public Credit updateCredit(Credit credit) {
        return creditRepository.save(credit);
    }

    @Override
    public void deleteCredit(Long id) {
        creditRepository.deleteById(id);
    }

    @Override
    public Credit getCreditById(Long id) {
        return creditRepository.findById(id).orElse(null);
    }

    @Override
    public List<Credit> getAllCredits() {
        return creditRepository.findAll();
    }

    @Override
    public List<Credit> findAllCreditsByUser(Long idUser) {
        return creditRepository.findAllByIdUser(idUser);
    }
}