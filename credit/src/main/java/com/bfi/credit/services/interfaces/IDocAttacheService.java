package com.bfi.credit.services.interfaces;

import com.bfi.credit.entities.DocAttache;

import java.util.List;

public interface IDocAttacheService {
    DocAttache saveDocAttache(DocAttache docAttache);
    DocAttache updateDocAttache(DocAttache docAttache);
    void deleteDocAttache(Long id);
    DocAttache getDocAttacheById(Long id);
    Boolean deletePieceJointe(Long idP);
    List<DocAttache> getAllPieceJointe();
    DocAttache getPieceJointeById(Long idP);
    List<DocAttache> getAllDocAttaches();
}
