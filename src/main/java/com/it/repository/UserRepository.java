package com.it.repository;

import com.it.emprty.User;

import java.util.List;

public interface UserRepository {
    public List<User> findAll();
    public User findById(Integer id);
    public int save(User student);
    public int update(User student);
    public int deleteById(Integer id);
}
