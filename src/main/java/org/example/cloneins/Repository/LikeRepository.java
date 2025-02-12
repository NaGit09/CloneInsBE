package org.example.cloneins.Repository;

import org.example.cloneins.Entity.Likes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository <Likes, Long> {
}
