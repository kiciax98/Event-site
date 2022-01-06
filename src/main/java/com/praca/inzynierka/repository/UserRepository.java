package com.praca.inzynierka.repository;

import com.praca.inzynierka.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
public interface UserRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByEmail(String email);
}
