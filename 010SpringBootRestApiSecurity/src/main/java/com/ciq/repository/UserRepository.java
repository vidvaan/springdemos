package com.ciq.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciq.enitity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
