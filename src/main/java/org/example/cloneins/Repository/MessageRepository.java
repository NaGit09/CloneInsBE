package org.example.cloneins.Repository;

import org.example.cloneins.Entity.Messages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository  extends JpaRepository<Messages, Long> {

}
