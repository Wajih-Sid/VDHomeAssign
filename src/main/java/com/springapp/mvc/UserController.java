package com.springapp.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;

@Controller
@EnableWebMvc

@RequestMapping("/")
public class UserController
{
    @Autowired
    private UserManager userManager;



    @RequestMapping(method = RequestMethod.GET)
	public String userPanel()
    {
		return "userForm";
	}


    @RequestMapping(value = "createUser",method = RequestMethod.POST)
    public @ResponseBody String createUser(User user)
    {
        userManager.saveUser(user);
        return user.getNAME();
    }
    @RequestMapping(value = "fetchUser",method = RequestMethod.GET)
    public @ResponseBody
    UserDTO fetchUser(@RequestParam(value = "ID") int ID)
    {
        return userManager.getUser(ID);
    }


    @RequestMapping(value = "fetchAllUsers",method = RequestMethod.GET)
    public @ResponseBody
    List<UserDTO> fetchAllUser()
    {
        return userManager.getAll();
    }


    @RequestMapping(value = "delUser/{id}",method = RequestMethod.DELETE)
    public @ResponseBody
    String delUser(@PathVariable("id") int id)
    {
        userManager.deleteUser(id);
        return "Deleted user";
    }

    @RequestMapping(value = "updateUser/{id}",method = RequestMethod.PATCH)
    public @ResponseBody String updateUser(@PathVariable("id") int id,User user)
    {
        System.out.println(id);
        userManager.updateUser(id,user);//.updateUser(user);
        return user.getNAME();
    }


}