package com.example.studentlogindetails.rowmapper;

import com.example.studentlogindetails.model.StudentLogin;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<StudentLogin> {

    public StudentLogin mapRow(ResultSet res, int rowNum) throws SQLException {

        StudentLogin newStudent = new StudentLogin();

        newStudent.setPassword(res.getString("password"));
        newStudent.setUserName(res.getString("userName"));
        newStudent.setEmail(res.getString("email"));

        return newStudent;
    }


}
