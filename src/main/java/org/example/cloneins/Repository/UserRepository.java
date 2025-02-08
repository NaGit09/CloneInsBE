package org.example.cloneins.Repository;

import org.example.cloneins.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
