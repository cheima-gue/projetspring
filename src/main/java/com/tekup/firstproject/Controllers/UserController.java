package com.tekup.firstproject.Controllers;

import com.tekup.firstproject.Entities.User;
import com.tekup.firstproject.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    //injection de dependence : on va injecter le service au niveau du controller
    @Autowired
    private UserService userService;

    //fonction pour la recuperation des utilisateurs
    @GetMapping("/getAll")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    //fonction pour l'ajout d'utilisateur
    @PostMapping("/addUser")
    public User ajoutUser(@RequestBody User user) {
        User u = userService.addUser(user);
        return u;
    }

}


