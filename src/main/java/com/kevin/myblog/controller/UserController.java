package com.kevin.myblog.controller;


import com.kevin.myblog.entity.Users;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    private static Map<Long,Users> usersMap=new ConcurrentHashMap<>();

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<Users> getUserList(){
        List<Users> r=new ArrayList<>(usersMap.values());
        return r;
    }

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String postUser(@ModelAttribute Users user){
        usersMap.put(user.getId(),user );
        return "success";
    }






}
