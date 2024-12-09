package com.tekup.firstproject.Services;

import com.tekup.firstproject.Entities.Session;
import com.tekup.firstproject.Repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionService {


    @Autowired
    private SessionRepository sessionRepository;

    // Fonction READ : Récupérer toutes les sessions de la base de données.
    public List<Session> getAllSessions() {
        return sessionRepository.findAll();
    }

    // Fonction ADD : Ajouter une nouvelle session.
    public Session addSession(Session session) {
        return sessionRepository.save(session);
    }
}
