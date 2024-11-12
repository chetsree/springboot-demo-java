package com.logindemo.demologinpage.service;

import com.logindemo.demologinpage.entity.User;
import com.logindemo.demologinpage.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

   private UserRepository userRepository;
   public User save(User user) {
       return userRepository.save(user);
   }
   public User findByUsername(String username)
   {
       return userRepository.findByUsername(username);
   }


}