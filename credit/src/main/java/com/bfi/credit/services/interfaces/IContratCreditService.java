package com.bfi.credit.services.interfaces;

import com.bfi.credit.entities.ContratCredit;

import java.util.List;

public interface IContratCreditService {
    ContratCredit saveContratCredit(ContratCredit contratCredit);
    ContratCredit updateContratCredit(ContratCredit contratCredit);
    void deleteContratCredit(Long id);
    ContratCredit getContratCreditById(Long id);
    List<ContratCredit> getAllContratCredits();
}
