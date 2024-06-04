package com.jyoticodes.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jyoticodes.springboot.model.User;
public interface UserRepo extends JpaRepository<User, String>{
    

}
