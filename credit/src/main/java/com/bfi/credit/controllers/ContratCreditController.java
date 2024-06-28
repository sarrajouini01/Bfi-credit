package com.bfi.credit.controllers;

import com.bfi.credit.entities.ContratCredit;
import com.bfi.credit.services.interfaces.IContratCreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contrats")
public class ContratCreditController {

    @Autowired
    private IContratCreditService contratCreditService;

    @PostMapping
    public ContratCredit createContratCredit(@RequestBody ContratCredit contratCredit) {
        return contratCreditService.saveContratCredit(contratCredit);
    }

    @PutMapping("/{id}")
    public ContratCredit updateContratCredit(@PathVariable Long id, @RequestBody ContratCredit contratCredit) {
        contratCredit.setIdC(id);
        return contratCreditService.updateContratCredit(contratCredit);
    }

    @DeleteMapping("/{id}")
    public void deleteContratCredit(@PathVariable Long id) {
        contratCreditService.deleteContratCredit(id);
    }

    @GetMapping("/{id}")
    public ContratCredit getContratCreditById(@PathVariable Long id) {
        return contratCreditService.getContratCreditById(id);
    }

    @GetMapping
    public List<ContratCredit> getAllContratCredits() {
        return contratCreditService.getAllContratCredits();
    }
}
