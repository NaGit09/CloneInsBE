package org.example.cloneins.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(name = "Email", columnNames = "email"),
        @UniqueConstraint(name = "Username", columnNames = "user_name")
})
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;
    private String user_name;
    private String full_name;
    private String email;
    private String password_hash;
    private String profile_picture;
    private String bio;
    private LocalDateTime created_at;

}

