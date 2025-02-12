package org.example.cloneins.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "likes")
public class Likes {
    @Id
    private Integer like_id;
    private Integer post_id;
    private Integer user_id;
    private LocalDateTime create_at;
}
