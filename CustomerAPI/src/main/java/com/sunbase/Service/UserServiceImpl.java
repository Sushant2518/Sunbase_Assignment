package com.sunbase.Service;

import com.sunbase.Exception.UserException;
import com.sunbase.Entity.User;
import com.sunbase.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public User registerUser(User user) throws UserException {
      Optional<User> exstingUser = userRepository.findByUserName(user.getUserName());
      if(exstingUser.isPresent()) throw new UserException("User name all ready present");
      return userRepository.save(user);


    }
}
