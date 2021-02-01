package com.rudnev.finalproject.controllers;

import com.rudnev.finalproject.domains.User;
import com.rudnev.finalproject.domains.UserData;
import com.rudnev.finalproject.repositories.UserDataRepository;
import com.rudnev.finalproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.NoResultException;
import java.sql.Timestamp;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserDataRepository userDataRepository;

    @PostMapping("/registration")
    public User regUser(@RequestBody User user){
        User isUserExist = userRepository.findByUsername(user.getUsername());
        UserData userData;
        if(isUserExist != null) return null;
        user.setAccountActive(true);
        user.setLastOnlineDate((new Timestamp(System.currentTimeMillis())).toString());
        userData = new UserData();
        user.setAvatarLink("assets/img/profile_avatar.svg");
        userDataRepository.save(userData);
        user.setUserData(userData);
        userRepository.save(user);
        return user;
    }

    @PostMapping("/authorization")
    public User authUser(@RequestBody User user){
        try {
            User userFromDB = userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
            return userFromDB;
        }catch (NoResultException | NoSuchElementException e){
            return null;
        }
    }
    @PostMapping("/saveNewUserValues")
    public User saveNewUserValues(@RequestBody User user) {
        Optional<User> userOptional = userRepository.findById(user.getUserID());
        Optional<UserData> userDataOptional = userDataRepository.findById(user.getUserData().getUserDataID());
        if (!(userOptional.isPresent())) return null;
        userDataOptional.get().setFullname(user.getUserData().getFullname());
        userDataOptional.get().setDob(user.getUserData().getDob());
        userDataOptional.get().setSex(user.getUserData().getSex());
        userDataOptional.get().setCountryOfResidence(user.getUserData().getCountryOfResidence());
        userDataRepository.save(userDataOptional.get());
        userOptional.get().setUsername(user.getUsername());
        userOptional.get().setPassword(user.getPassword());
        userOptional.get().setEmail(user.getEmail());
        userOptional.get().setAvatarLink(user.getAvatarLink());
        userOptional.get().setRole(user.getRole());
        userOptional.get().setLastOnlineDate((new Timestamp(System.currentTimeMillis())).toString());
        userOptional.get().setAccountActive(user.isAccountActive());
        userRepository.save(userOptional.get());
        return userOptional.get();
    }

    @GetMapping("/getUsersList")
    public List<User> getUsersList(){
        try {
            List<User> users = userRepository.findAll();
            return users;
        }catch (NoResultException e){
            return null;
        }
    }

    @PostMapping("/deleteUser")
    public boolean deleteUser(@RequestBody User user){
        try {
            userRepository.delete(user);
            return true;
        }catch (NoResultException e){
            return false;
        }
    }
}
