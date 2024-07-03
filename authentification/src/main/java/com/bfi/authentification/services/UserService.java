package com.bfi.authentification.services;

import com.bfi.authentification.Client.CreditClient;
import com.bfi.authentification.Client.RdvClient;
import com.bfi.authentification.Client.ReclamationClient;
import com.bfi.authentification.FullUserResponseForCredit;
import com.bfi.authentification.FullUserResponseForRdv;
import com.bfi.authentification.FullUserResponseForReclamation;
import com.bfi.authentification.entities.User;
import com.bfi.authentification.repositories.UserRepository;
import com.bfi.authentification.services.interfaces.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserService implements IUserService {

    private final UserRepository userRepository;
    private final CreditClient creditClient;
    private  final ReclamationClient reclamationClient;
    private  final RdvClient rdvClient;


    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long idUser) {
        userRepository.deleteById(idUser);
    }

    @Override
    public User getUserById(Long idUser) {
        return userRepository.findById(idUser).orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public FullUserResponseForRdv findUserWithRdvs(Long idUser) {
        var user = userRepository.findById(idUser)
                .orElse(
                        User.builder()
                                .nom("NOT_FOUND")
                                .prenom("NOT_FOUND")
                                .build()
                );
        var rendezVous = rdvClient.findAllRdvByUser(idUser);
        return FullUserResponseForRdv.builder()
                .nom(user.getNom())
                .prenom(user.getPrenom())
                .rendezVous(rendezVous)
                .build();
    }


    public FullUserResponseForReclamation findUserWithReclamations(Long idUser) {
        var user = userRepository.findById(idUser)
                .orElse(
                        User.builder()
                                .nom("NOT_FOUND")
                                .prenom("NOT_FOUND")
                                .build()
                );
        var reclamations = reclamationClient.findAllReclamationByUser(idUser);
        return FullUserResponseForReclamation.builder()
                .nom(user.getNom())
                .prenom(user.getPrenom())
                .reclamations(reclamations)
                .build();
    }


    public FullUserResponseForCredit findUserWithCredits(Long idUser) {
        var user = userRepository.findById(idUser)
                .orElse(
                        User.builder()
                                .nom("NOT_FOUND")
                                .prenom("NOT_FOUND")
                                .build()
                );
        var credits = creditClient.findAllCreditsByUser(idUser);
        return FullUserResponseForCredit.builder()
                .nom(user.getNom())
                .prenom(user.getPrenom())
                .credits(credits)
                .build();
    }
}
