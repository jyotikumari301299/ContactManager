package com.jyoticodes.springboot.servicesImpl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jyoticodes.springboot.model.User;
import com.jyoticodes.springboot.repositories.UserRepo;
import com.jyoticodes.springboot.services.UserServices;

@Service
public class UserServicesImpl implements UserServices{
    @Autowired
    private UserRepo userRepo;
    

    @Override
    public User saveUser(User user) {
       String userId = UUID.randomUUID().toString();
       user.setUserId(userId);
       User user2 = userRepo.save(user);
       return user2;
        
    }

    @Override
    public Optional<User> getUserById(String id) {
        throw new UnsupportedOperationException("Unimplemented method 'getUserById'");

    }

    @Override
    public Optional<User> updateUser(User user) {
        
        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
    }

    @Override
    public void deleteUser(String id) {
       
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }

    @Override
    public boolean isUserExist(String userId) {
       
        throw new UnsupportedOperationException("Unimplemented method 'isUserExist'");
    }

    @Override
    public boolean isUserExistByEmail(String email) {
       
        throw new UnsupportedOperationException("Unimplemented method 'isUserExistByEmail'");
    }

    @Override
    public List<User> getAllUsers() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getAllUsers'");
    }

    @Override
    public User getUserByEmail(String email) {
        
        throw new UnsupportedOperationException("Unimplemented method 'getUserByEmail'");
    }


}
