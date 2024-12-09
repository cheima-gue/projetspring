package com.tekup.firstproject.Controllers;

import com.tekup.firstproject.Entities.Cours;
import com.tekup.firstproject.Services.CoursService;
import com.tekup.firstproject.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cours")
public class CoursController {

    @Autowired
    CoursService coursService;

    @PostMapping("/ajoutCours/{idUser}")
    public Cours ajoutCours(@RequestBody Cours cours, @PathVariable("idUser") int userId) {
      return  coursService.ajoutCoursCoach(cours, userId);
    }
}
