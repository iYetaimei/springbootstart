package com.it.repository.impl;

import com.it.emprty.User;
import com.it.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> findAll() {

        return jdbcTemplate.query("select * from user",new BeanPropertyRowMapper<User>(User.class));
    }

    @Override
    public User findById(Integer id) {
        return jdbcTemplate.queryForObject("select * from user where id=?",new Object[]{id},
                new BeanPropertyRowMapper<User>(User.class));
    }

    @Override
    public int save(User user) {

        return jdbcTemplate.update("insert into user(username,password,birthday) values (?,?,?)",
                user.getUsername(),
                user.getPassword(),
                user.getBirthday());
    }

    @Override
    public int update(User user) {
        return jdbcTemplate.update("update user set username=?,password=?,birthday=? where id=?",
                user.getUsername(),user.getPassword(),user.getBirthday(),user.getId());
    }

    @Override
    public int deleteById(Integer id) {


        return jdbcTemplate.update("delete from user where id =?",id);
    }
}
