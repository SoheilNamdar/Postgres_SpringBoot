package com.springBoot.soheil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProductDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void persist() {
        jdbcTemplate.update("INSERT INTO products (name, lastname) VALUES (?,?)","ram", "NAMDAR");
    }
}
