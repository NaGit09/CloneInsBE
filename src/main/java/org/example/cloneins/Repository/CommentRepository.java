package org.example.cloneins.Repository;

import org.example.cloneins.Entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comments, Long> {
}
