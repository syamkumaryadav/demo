package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Student;
import com.util.Dbutil;

public class StudentDao {

    public void insertStudent(Student student) {
        String query = "INSERT INTO STUDENT VALUES(?,?,?,?)";
        Connection connection=Dbutil.getConnection();
        
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, student.getSno());
            ps.setString(2, student.getSname());
            ps.setString(3, student.getSage());
            ps.setString(4, student.getScourse());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

