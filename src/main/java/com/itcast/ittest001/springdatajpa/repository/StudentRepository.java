package com.itcast.ittest001.springdatajpa.repository;

import com.itcast.ittest001.model.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends CrudRepository<Student,Integer> {
    List<Student> findByGrade(String grade);

    Optional<Student> findById(Integer id);
}
