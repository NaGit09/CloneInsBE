package org.example.cloneins.Entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
@Data
public class Comments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer comment_id;
    private Integer post_id;
    private Integer user_id;
    private String content;
    private LocalDateTime create_at;

}
