package com.example.miniprojecthospitalkelompok2.repository;

import com.example.miniprojecthospitalkelompok2.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    // Users findOneByUserNameIgnoreCaseAndPassword(String userName, String password);

    Optional<Users> findByUserName(String userName);

    Boolean existsByUserName(String userName);

    Boolean existsByEmail(String email);

}
