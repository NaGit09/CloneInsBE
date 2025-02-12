package org.example.cloneins.Repository;

import org.example.cloneins.Entity.Follows;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowRepository  extends JpaRepository <Follows, Long > {
}
