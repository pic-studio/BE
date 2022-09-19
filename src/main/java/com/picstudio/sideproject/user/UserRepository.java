package com.picstudio.sideproject.user;

import com.picstudio.sideproject.user.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User>findByUsername(String username);

}
