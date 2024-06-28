package com.bfi.credit.services.interfaces;

import com.bfi.credit.entities.Credit;

import java.util.List;

public interface ICreditService {
    Credit saveCredit(Credit credit);
    Credit updateCredit(Credit credit);
    void deleteCredit(Long id);
    Credit getCreditById(Long id);
    List<Credit> getAllCredits();
}
