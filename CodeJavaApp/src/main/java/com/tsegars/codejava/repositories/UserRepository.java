package com.tsegars.codejava.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.tsegars.codejava.users.User;
 
public interface UserRepository extends JpaRepository<User, Long> {
 
}