package com.itcast.ittest001.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class StudentDao {
    private final JdbcTemplate jdbcTemplate;

    public StudentDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void select(){
        this.jdbcTemplate.queryForList("select * from tb_student");
    }

    public Integer count() {
        return this.jdbcTemplate.queryForObject("select count(*) from tb_student", Integer.class);
    }

    public Integer countByName(String name) {
        return this.jdbcTemplate.queryForObject("select count(*) from tb_student where name=?", Integer.class, name);
    }

    public String selectName(Integer id) {
        return this.jdbcTemplate.queryForObject("select name from tb_student where id=?", String.class, id);
    }

}
