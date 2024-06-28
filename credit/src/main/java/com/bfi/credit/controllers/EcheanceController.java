package com.bfi.credit.controllers;

import com.bfi.credit.entities.Echeance;
import com.bfi.credit.services.interfaces.IEcheanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/echeances")
public class EcheanceController {

    @Autowired
    private IEcheanceService echeanceService;

    @PostMapping
    public Echeance createEcheance(@RequestBody Echeance echeance) {
        return echeanceService.saveEcheance(echeance);
    }

    @PutMapping("/{id}")
    public Echeance updateEcheance(@PathVariable Long id, @RequestBody Echeance echeance) {
        echeance.setIdE(id);
        return echeanceService.updateEcheance(echeance);
    }

    @DeleteMapping("/{id}")
    public void deleteEcheance(@PathVariable Long id) {
        echeanceService.deleteEcheance(id);
    }

    @GetMapping("/{id}")
    public Echeance getEcheanceById(@PathVariable Long id) {
        return echeanceService.getEcheanceById(id);
    }

    @GetMapping
    public List<Echeance> getAllEcheances() {
        return echeanceService.getAllEcheances();
    }
}
