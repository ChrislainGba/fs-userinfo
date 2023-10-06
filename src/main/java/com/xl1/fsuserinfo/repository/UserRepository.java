package com.xl1.fsuserinfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xl1.fsuserinfo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
