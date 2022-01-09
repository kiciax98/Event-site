package com.praca.inzynierka.repository;

import com.praca.inzynierka.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
public interface UserRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByEmail(String email);

    @Transactional
    @Modifying
    @Query("UPDATE Student a " +
            "SET a.enabled = TRUE WHERE a.email = ?1")
    int enableStudent(String email);
}
