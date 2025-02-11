package org.example.cloneins.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(name = "Email", columnNames = "email"),
        @UniqueConstraint(name = "Username", columnNames = "username")
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

    // Constructor không tham số (bắt buộc với JPA)
    public Users() {}

    // Constructor đầy đủ tham số
    public Users(String username, String fullName, String email, String passwordHash, String profilePicture, String bio) {
        this.user_name = username;
        this.full_name = fullName;
        this.email = email;
        this.password_hash = passwordHash;
        this.profile_picture = profilePicture;
        this.bio = bio;
        this.created_at = LocalDateTime.now();
    }
}

