package com.example.blog.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class EmployeeRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Map<String, Object> findById(String id)
    {
        String query = "select *" +
                " from employee" +
                " where id=" + id;

        return jdbcTemplate.queryForMap(query);
    }
}
