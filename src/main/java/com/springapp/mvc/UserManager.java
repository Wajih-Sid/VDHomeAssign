package com.springapp.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Wajih Sid on 10/28/2015.
 */

@Service
public class UserManager
{
    @Autowired
    private UserDAO userDAO;


    public void saveUser(User user)
    {
        userDAO.save(user);
    }

    public UserDTO getUser(int id) {
        return userDAO.getUserById(id);
    }

    public List<UserDTO> getAll() {
        return userDAO.getAllUsers();
    }

    public void deleteUser(int id) {
        userDAO.delUser(id);
    }

    public void updateUser(int id, User user) {
        userDAO.updateUser(id,user);
    }

}
