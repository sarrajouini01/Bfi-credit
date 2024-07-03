package com.bfi.credit.controllers;

import com.bfi.credit.entities.Credit;
import com.bfi.credit.services.interfaces.ICreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/credit")
public class CreditController {

    @Autowired
    private ICreditService creditService;

    @PostMapping("/add")
    public Credit createCredit(@RequestBody Credit credit) {
        return creditService.saveCredit(credit);
    }

    @PutMapping("/{id}")
    public Credit updateCredit(@PathVariable Long id, @RequestBody Credit credit) {
        credit.setIdCredit(id);
        return creditService.updateCredit(credit);
    }

    @DeleteMapping("/{id}")
    public void deleteCredit(@PathVariable Long id) {
        creditService.deleteCredit(id);
    }

    @GetMapping("/{id}")
    public Credit getCreditById(@PathVariable Long id) {
        return creditService.getCreditById(id);
    }

    @GetMapping
    public List<Credit> getAllCredits() {
        return creditService.getAllCredits();
    }

    @GetMapping("/user/{idUser}")
    public ResponseEntity<List<Credit>> findAllCredits(
            @PathVariable("idUser") Long idUser
    ) {
        return ResponseEntity.ok(creditService.findAllCreditsByUser(idUser));
    }
}
