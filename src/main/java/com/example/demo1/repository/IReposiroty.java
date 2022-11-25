package com.example.demo1.repository;

import com.example.demo1.model.Student;

import java.util.List;

public interface IReposiroty {

    Student read(int id);

    List<Student> getAll();

    void create(Student student);

    void update(Student student);

    void delete(int id);

}
