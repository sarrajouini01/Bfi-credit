package com.bfi.authentification.services.interfaces;
import com.bfi.authentification.FullUserResponseForCredit;
import com.bfi.authentification.FullUserResponseForRdv;
import com.bfi.authentification.FullUserResponseForReclamation;
import com.bfi.authentification.entities.User;

import java.util.List;

public interface IUserService {
    User saveUser(User user);
    User updateUser(User user);
    void deleteUser(Long idUser);
    User getUserById(Long idUser);
    List<User> getAllUsers();
    User getUserByEmail(String email);

    FullUserResponseForCredit findUserWithCredits(Long idUser);
    FullUserResponseForReclamation findUserWithReclamations(Long idUser);
    FullUserResponseForRdv findUserWithRdvs(Long idUser);
}

