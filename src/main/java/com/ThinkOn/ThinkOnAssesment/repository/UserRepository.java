package com.ThinkOn.ThinkOnAssesment.repository;

import com.ThinkOn.ThinkOnAssesment.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
