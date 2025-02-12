package org.example.cloneins.Repository;

import org.example.cloneins.Entity.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Posts, Long> {
}
