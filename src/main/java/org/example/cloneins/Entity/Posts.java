package org.example.cloneins.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "posts")
@Data
public class Posts {
    @Id
    private Integer post_id;
    private Integer user_id;
    private String caption;
    private String image_url;
    private LocalDateTime create_at;
}

