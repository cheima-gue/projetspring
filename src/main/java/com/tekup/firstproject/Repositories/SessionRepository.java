package com.tekup.firstproject.Repositories;

import com.tekup.firstproject.Entities.Session;
import com.tekup.firstproject.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //pour indiquer que cest une interface repo
public interface SessionRepository extends JpaRepository<Session, Integer> {

}