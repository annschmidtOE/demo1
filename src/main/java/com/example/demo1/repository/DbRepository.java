package com.example.demo1.repository;

import com.example.demo1.model.Student;
import com.example.demo1.util.DatabaseManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class DbRepository implements IReposiroty{

    private List<Student> studentList = new LinkedList<>();

    @Override
    public Student read(int id) {
        return null;
    }

    @Override
    public List<Student> getAll() {

        Connection connection = DatabaseManager.getConnection("jdbc:mysql://localhost:3306/kea","root","Gdk94xjs#");
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM student");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                studentList.add(new Student(
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name")
                        )
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return studentList;
    }

    @Override
    public void create(Student student) {

    }

    @Override
    public void update(Student student) {

        Connection connection = DatabaseManager.getConnection("jdbc:mysql://localhost:3306/kea","root","Gdk94xjs#");
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE student SET first_name = ?, last_name= ? WHERE id = ?;");
            preparedStatement.setString(1,student.getfName());
            preparedStatement.setString(2,student.getfName());

            ResultSet resultSet = preparedStatement.executeQuery();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(int id) {

    }
}
