package com.example.demo1.repository;

import com.example.demo1.model.Student;

import java.util.LinkedList;
import java.util.List;

public class Repository implements IReposiroty{

    private List<Student> studentList = new LinkedList<>();


    @Override
    public Student read(int id) {
        return null;
    }

    public List<Student> getAll(){
        Student student1 = new Student("Buster","Schmidt");
        Student student2 = new Student("Anna","Schmidt");
        Student student3 = new Student("Poul","Østergaard");
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        return studentList;
    }

    @Override
    public void create(Student student) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void delete(int id) {

    }

}
