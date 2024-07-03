package com.bfi.credit.services;

import com.bfi.credit.entities.DocAttache;
import com.bfi.credit.repositories.DocAttacheRepository;
import com.bfi.credit.services.interfaces.IDocAttacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocAttacheService implements IDocAttacheService {

    @Autowired
    private DocAttacheRepository docAttacheRepository;

    @Override
    public DocAttache saveDocAttache(DocAttache docAttache) {
        return docAttacheRepository.save(docAttache);
    }

    @Override
    public DocAttache updateDocAttache(DocAttache docAttache) {
        return docAttacheRepository.save(docAttache);
    }

    @Override
    public void deleteDocAttache(Long id) {
        docAttacheRepository.deleteById(id);
    }

    @Override
    public DocAttache getDocAttacheById(Long id) {
        return docAttacheRepository.findById(id).orElse(null);
    }

    @Override
    public List<DocAttache> getAllDocAttaches() {
        return docAttacheRepository.findAll();
    }
}
