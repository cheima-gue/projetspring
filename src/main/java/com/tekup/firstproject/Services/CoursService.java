package com.tekup.firstproject.Services;

import com.tekup.firstproject.Entities.Cours;
import com.tekup.firstproject.Entities.User;
import com.tekup.firstproject.Entities.UserRole;
import com.tekup.firstproject.Repositories.CoursRepository;
import com.tekup.firstproject.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CoursService {
    @Autowired
     CoursRepository coursRepository;
    @Autowired
     UserRepository userRepository;

    public Cours ajoutCoursCoach(Cours cours, int idUser){
         Optional<User> user = userRepository.findById(idUser);

         if(user.isPresent()){
             User u = user.get();
             if (u.getRole() == UserRole.COACH) {
                 cours.setUser(u);
                 coursRepository.save(cours);
             }
         }

        return cours;
    }

}


