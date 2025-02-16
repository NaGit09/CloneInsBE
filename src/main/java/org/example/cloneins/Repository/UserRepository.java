package org.example.cloneins.Repository;


import org.example.cloneins.DTO.UserResponse;
import org.example.cloneins.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<Users, Long> {
    @Query("SELECT new  org.example.cloneins.DTO.UserResponse(u.user_id , u.full_name , u.profile_picture , u.bio) FROM Users u ")
    List<UserResponse> ResponseUser();
}
