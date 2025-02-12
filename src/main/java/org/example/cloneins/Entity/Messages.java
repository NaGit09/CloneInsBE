package org.example.cloneins.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "messages")
@Data
public class Messages {
    @Id
    private Integer message_id;
    private Integer sender_id;
    private Integer receiver_id;
    private String content;
    private LocalDateTime create_at;
}
