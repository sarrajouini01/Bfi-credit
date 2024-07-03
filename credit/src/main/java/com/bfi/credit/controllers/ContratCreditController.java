package com.bfi.credit.controllers;

import com.bfi.credit.entities.ContratCredit;
import com.bfi.credit.services.interfaces.IContratCreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contrat")
public class ContratCreditController {

    @Autowired
    private IContratCreditService contratCreditService;

    @PostMapping("/add")
    public ContratCredit createContratCredit(@RequestBody ContratCredit contratCredit) {
        return contratCreditService.saveContratCredit(contratCredit);
    }

    @PutMapping("/update/{id}")
    public ContratCredit updateContratCredit(@PathVariable Long id, @RequestBody ContratCredit contratCredit) {
        contratCredit.setIdC(id);
        return contratCreditService.updateContratCredit(contratCredit);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteContratCredit(@PathVariable Long id) {
        contratCreditService.deleteContratCredit(id);
    }

    @GetMapping("/getByID/{id}")
    public ContratCredit getContratCreditById(@PathVariable Long id) {
        return contratCreditService.getContratCreditById(id);
    }

    @GetMapping("/getAll)")
    public List<ContratCredit> getAllContratCredits() {
        return contratCreditService.getAllContratCredits();
    }
}
