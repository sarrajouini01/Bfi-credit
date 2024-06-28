package com.bfi.credit.controllers;

import com.bfi.credit.entities.DocAttache;
import com.bfi.credit.services.interfaces.IDocAttacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/docs")
public class DocAttacheController {

    @Autowired
    private IDocAttacheService docAttacheService;

    @PostMapping
    public DocAttache createDocAttache(@RequestBody DocAttache docAttache) {
        return docAttacheService.saveDocAttache(docAttache);
    }

    @PutMapping("/{id}")
    public DocAttache updateDocAttache(@PathVariable Long id, @RequestBody DocAttache docAttache) {
        docAttache.setIdD(id);
        return docAttacheService.updateDocAttache(docAttache);
    }

    @DeleteMapping("/{id}")
    public void deleteDocAttache(@PathVariable Long id) {
        docAttacheService.deleteDocAttache(id);
    }

    @GetMapping("/{id}")
    public DocAttache getDocAttacheById(@PathVariable Long id) {
        return docAttacheService.getDocAttacheById(id);
    }

    @GetMapping
    public List<DocAttache> getAllDocAttaches() {
        return docAttacheService.getAllDocAttaches();
    }
}
