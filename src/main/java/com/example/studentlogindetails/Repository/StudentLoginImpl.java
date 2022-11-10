package com.example.studentlogindetails.Repository;

import com.example.studentlogindetails.model.StudentLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Repository
public class StudentLoginImpl implements IStudentRepo {
    @Autowired
     private JdbcTemplate jdbcTemplate;
    @Override
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update("DELETE FROM StudentLogin WHERE loginID=?", id);
    }

    @Override
    public int insertData(StudentLogin studentLogin) {

        String SqlQuery = "insert into StudentLogin(password,username,email)values(?,?,?)";
        Object[] args = {studentLogin.getPassword(), studentLogin.getUserName(), studentLogin.getEmail()};
        return jdbcTemplate.update(SqlQuery, args);
    }

    @Override
    @PutMapping("/put/{LoginID}")
    public int update(StudentLogin studentLogin, int LoginID) {
        String SqlQuery = "Update StudentLogin set password= ? ,username = ? , email = ? where LoginID = ?";
        Object[] args = {studentLogin.getPassword(), studentLogin.getUserName(), studentLogin.getEmail(), LoginID};
        return jdbcTemplate.update(SqlQuery, args);
        // public int update(StudentLogin studentLogin, int LoginID) {
        //   return jdbcTemplate.update("UPDATE StudentLogin SET password = ?, userName = ?, email = ? WHERE LoginID = ?",
        //       new Object[] {studentLogin.getPassword(), studentLogin.getUserName(), studentLogin.getEmail(),LoginID});
    }

    @Override
    public List<StudentLogin> findAllStudent() {
        //String SqlQuery = "select * from StudentLogin";
        return jdbcTemplate.query("select * from StudentLogin", BeanPropertyRowMapper.newInstance(StudentLogin.class));
    }

    @Override
    public List<StudentLogin> findAllByBoth() {

        String Sql = "select * from StudentLogin as s inner join StudentInfo as ss on ss.id = s.LoginID"
                ;
        List<StudentLogin>studentLogins = jdbcTemplate.query(Sql,BeanPropertyRowMapper.newInstance(StudentLogin.class));
        return studentLogins;

    }
}
