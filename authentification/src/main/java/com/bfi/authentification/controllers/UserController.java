package com.bfi.authentification.controllers;

import com.bfi.authentification.FullUserResponseForCredit;
import com.bfi.authentification.FullUserResponseForRdv;
import com.bfi.authentification.FullUserResponseForReclamation;
import com.bfi.authentification.entities.User;
import com.bfi.authentification.services.interfaces.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final IUserService userService;

    @PostMapping("/add")
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PutMapping("/{idUser}")
    public User updateUser(@PathVariable Long idUser, @RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/{idUser}")
    public void deleteUser(@PathVariable Long idUser) {
        userService.deleteUser(idUser);
    }

    @GetMapping("/{idUser}")
    public User getUserById(@PathVariable Long idUser) {
        return userService.getUserById(idUser);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/email")
    public User getUserByEmail(@RequestParam String email) {
        return userService.getUserByEmail(email);
    }

    ////////////////////////////////////////////////////////////////////////

    @GetMapping("/user&reclamation/{idUser}")
    public ResponseEntity<FullUserResponseForReclamation> findAllUsersReclamation(@PathVariable("idUser") Long idUser) {
        return ResponseEntity.ok(userService.findUserWithReclamations(idUser));
    }

    @GetMapping("/user&credit/{idUser}")
    public ResponseEntity<FullUserResponseForCredit> findAllUsersCredit(@PathVariable("idUser") Long idUser) {
        return ResponseEntity.ok(userService.findUserWithCredits(idUser));
    }

    @GetMapping("/user&rdv/{idUser}")
    public ResponseEntity<FullUserResponseForRdv> findAllUsersRdv(@PathVariable("idUser") Long idUser) {
        return ResponseEntity.ok(userService.findUserWithRdvs(idUser));
    }






}

