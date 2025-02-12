package org.example.cloneins.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "follows")
@Data
public class Follows {
    @Id
    private Integer follow_id;
    private Integer follower_id;
    private Integer following_id;
    private LocalDateTime create_at;
}
