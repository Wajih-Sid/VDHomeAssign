package com.springapp.mvc;

import java.util.List;

/**
 * Created by Wajih Sid on 10/29/2015.
 */
public interface UserDAO
{
    public void save(User user);
    public UserDTO getUserById(int id);
    public User findUserById(int id);
    public List getAllUsers();
    public void delUser(int id);
    public void updateUser(int id,User user);
}
