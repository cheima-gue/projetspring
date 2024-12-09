package com.tekup.firstproject.Controllers;

import com.tekup.firstproject.Entities.Session;
import com.tekup.firstproject.Services.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/session")
public class SessionController {

    // Injection de dépendances : on injecte le service au niveau du contrôleur
    @Autowired
    private SessionService sessionService;

    // Fonction pour la récupération de toutes les sessions
    @GetMapping("/getAll")
    public List<Session> getAllSessions() {
        return sessionService.getAllSessions();
    }

    // Fonction pour l'ajout d'une session
    @PostMapping("/addSession")
    public Session addSession(@RequestBody Session session) {
        return sessionService.addSession(session);
    }
}

