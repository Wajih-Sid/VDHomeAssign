package com.springapp.mvc;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Wajih Sid on 10/28/2015.
 */
@Repository
@Transactional
@EnableTransactionManagement
public class UserDAOImpl implements UserDAO
{

    @Autowired
    private SessionFactory sessionFactory;



    @Override
    @Transactional
    public void save(User user)
    {
        sessionFactory.getCurrentSession().saveOrUpdate(user);
    }

    @Override
    @Transactional
    public UserDTO getUserById(int id) {
        User user = (User) sessionFactory.getCurrentSession().get(User.class,id);
        return new UserDTO(user.getNAME(),user.getROLE());

    }

    @Override
    public User findUserById(int id)
    {
        return (User) sessionFactory.getCurrentSession().get(User.class,id);
    }


    @Override
    @Transactional
    public List getAllUsers() {
        return sessionFactory.getCurrentSession().createCriteria(User.class).list();

    }


    @Override
    @Transactional
    public void delUser(int id) {
        sessionFactory.getCurrentSession().delete(findUserById(id));
    }

    @Override
    @Transactional
    public void updateUser(int id,User user)
    {
        User newUser = (User) sessionFactory.getCurrentSession().get(User.class,id);
        newUser.setNAME(user.getNAME());
        newUser.setEMAIL(user.getEMAIL());
        newUser.setROLE(user.getROLE());
        sessionFactory.getCurrentSession().update(newUser);
    }

//    @Transactional
//    public List getAllUsers()
//    {
//        List users =  sessionFactory.getCurrentSession().createCriteria(User.class).list();
//        System.out.println(users);
//        return users;
//    }
//
//    @Transactional
//    public void save(User user)
//    {
//        sessionFactory.getCurrentSession().saveOrUpdate(user);
//    }
//
//    @Transactional
//    public void updateUser(User user)
//    {
//        sessionFactory.getCurrentSession().update(user);
//    }
//
//    @Transactional
//    public User getUserById(int id)
//    {
//        System.out.println(id);
//        User user = (User) sessionFactory.getCurrentSession().get(User.class,id);
//        System.out.println(user);
//        return user;
//    }
//
//    @Transactional
//    public void delUser(int id)
//    {
//        sessionFactory.getCurrentSession().delete(getUserById(id));
//    }
}
