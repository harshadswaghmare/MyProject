package com.example.studentlogindetails.Repository;

import com.example.studentlogindetails.model.StudentLogin;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public interface IStudentRepo {

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate);
    public int delete(int id);

    public int insertData(StudentLogin studentLogin);

    public int update(StudentLogin studentLogin, int LoginID);

    public List<StudentLogin> findAllStudent();

    public List<StudentLogin> findAllByBoth();

}
