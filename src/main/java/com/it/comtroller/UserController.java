package com.it.comtroller;

import com.it.emprty.User;
import com.it.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
//    @Qualifier("")
    private UserRepository userRepository;

    @GetMapping("/findAll")
    public List<User> findAll(){

        return userRepository.findAll();
    }
    @GetMapping("/findById/{id}")
    public User findAll(@PathVariable Integer id){

        return userRepository.findById(id);
    }

    @PostMapping("/save")
    public int save(@RequestBody User user){

        System.out.println(user);
        return userRepository.save(user);

    }

    @PutMapping("/update")
    public int update(@RequestBody User user){
        return userRepository.update(user);

    }

    @DeleteMapping("/deleteById/{id}")
    public int deleteById(@PathVariable Integer id){
        return userRepository.deleteById(id);

    }


}
