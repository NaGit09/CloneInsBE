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
    @Column(name = "UserId")
    private Long userId;

    @Column(name = "username", length = 255, nullable = false, unique = true)
    private String username;

    @Column(name = "FullName", length = 100)
    private String fullName;

    @Column(name = "email", length = 255, nullable = false, unique = true)
    private String email;

    @Column(name = "PasswordHash", length = 255, nullable = false)
    private String passwordHash;

    @Column(name = "ProfilePicture", length = 255)
    private String profilePicture;

    @Column(name = "Bio", length = 255)
    private String bio;

    @Column(name = "CreatedAt", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt;

    // Constructor không tham số (bắt buộc với JPA)
    public Users() {}

    // Constructor đầy đủ tham số
    public Users(String username, String fullName, String email, String passwordHash, String profilePicture, String bio) {
        this.username = username;
        this.fullName = fullName;
        this.email = email;
        this.passwordHash = passwordHash;
        this.profilePicture = profilePicture;
        this.bio = bio;
        this.createdAt = LocalDateTime.now();
    }
}

