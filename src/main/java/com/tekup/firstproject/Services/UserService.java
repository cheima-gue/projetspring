package com.tekup.firstproject.Services;

import com.tekup.firstproject.Entities.Cours;
import com.tekup.firstproject.Entities.User;
import com.tekup.firstproject.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    //injection de depedendences par @Autowired pour injecter le repository au niveau du service
    @Autowired
    UserRepository userRepository;

    //Fonction READ : get all users in database
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    //Fonction ADD : ajout user
    public User addUser(User user) {
        return userRepository.save(user);

    }

}
