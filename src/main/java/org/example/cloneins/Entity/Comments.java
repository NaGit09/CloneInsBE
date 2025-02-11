package org.example.cloneins.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "comments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CommentId")
    private Integer commentId;

    @Column(name = "PostId")
    private Integer postId;

    @Column(name = "UserId")
    private Integer userId;

    @Column(name = "Content")
    private String content;

    @Column(name = "CreatedAt")
    private Date createAt;}
