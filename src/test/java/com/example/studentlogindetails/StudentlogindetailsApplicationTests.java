package com.example.studentlogindetails;

import com.example.studentlogindetails.Repository.IStudentRepo;
import com.example.studentlogindetails.model.StudentLogin;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;

@SpringBootTest
class StudentlogindetailsApplicationTests {
   /* @Autowired
    JdbcTemplate;

    StudentlogindetailsApplicationTests(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }*/
    // @Autowired
    // IStudentRepo iStudentRepo;
    IStudentRepo iStudentRepo;

    @Test
        //use test annotation
    void display() {
        // List<StudentLogin> student = iStudentRepo.findAllStudent();
        //System.out.println(student);
       /* IStudentRepo iStudentRepo = new StudentLoginImpl();
        List<StudentLogin> student = iStudentRepo.findAllStudent();
        System.out.println("test pass");*/
        StudentLogin studentLogin = new StudentLogin("a", "b", "c");
        Assert.assertEquals(studentLogin.getPassword(), "a");
        System.out.println("display method is passed");

    }

    @Test
    void show() {
        StudentLogin studentLogin = new StudentLogin("a", "b", "c");
        Assert.assertTrue(studentLogin.getUserName().contains("c"));
        System.out.println("show method is passed");


    }

     @Test
    void set() {
        StudentLogin studentLogin = new StudentLogin("a", "b", "c");
        Assert.assertTrue(studentLogin.getEmail().contains("b"));
        System.out.println("set method is passed");
}


  /*@Test
    public void update(IStudentRepo iStudentRepo)
  {
      StudentLogin studentLogin = new StudentLogin("a","b","c");
  }

    /*@BeforeEach
    void get()
    {
        try {
            IStudentRepo studentService = new StudentLoginImpl();
            assertEquals("1", studentService.findAllStudent().size());
            System.out.println("get method test is passed");
        }catch(Exception e) {
            System.out.println(e);

    }
    }  */

}


