package com.sunbase.Service;

import com.sunbase.Exception.UserException;
import com.sunbase.Entity.User;

public interface UserService {
    public User registerUser(User user) throws UserException;
}
