package com.myousuf.eventbooking.repository;

import com.myousuf.eventbooking.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
