package com.example.studentlogindetails.Controller;

import com.example.studentlogindetails.Repository.IStudentRepo;
import com.example.studentlogindetails.model.StudentLogin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

  Logger log = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private IStudentRepo iStudentRepo;


    @GetMapping("/StudentLogin")
    public List<StudentLogin> findAllStudent() {
        log.info("processing the list of student {}");
        List<StudentLogin> result = iStudentRepo.findAllStudent();

        if (result.isEmpty()) {

            System.out.println("no Record Found");
            log.warn("Empty DataBase");
        } else {
           System.out.println(result);
           log.info("this is successfully");
        }

        return result;
    }


    @PostMapping("/student/insert")
    public String insertData(@RequestBody StudentLogin studentLogin) {
        return iStudentRepo.insertData(studentLogin) + " student Data saved Successfully";
    }


    @DeleteMapping("student/delete/{id}")
    public String delete(@PathVariable int id) {

      /* try {
            return iStudentRepo.delete(id) + " Record Deleted Successfully";
        } catch (Exception e) {
            return ("Exception occurred :" + e);
        }*/
        int result = iStudentRepo.delete(id);
        if (result < 1) {
            System.out.println("Record Not Found");
        } else if (result > 0) {
            System.out.println("record with loginID" + id + " deleted successfully");
        }
        return Integer.toString(result);
    }



    @PutMapping("/put/{LoginID}")
    public String update(@RequestBody StudentLogin studentLogin, @PathVariable int LoginID) {
        return iStudentRepo.update(studentLogin, LoginID) + " record updated successfully";
    }

    @GetMapping("join")
    public List<StudentLogin> findByBoth() {
        try {
            if(List.of().isEmpty()) {
               // return iStudentRepo.findAllByBoth();
                log.warn("no Data available please enter data");
            }
            else{
                return iStudentRepo.findAllByBoth();
            }
        }catch(Exception e){
            log.error("Exception occurred :" + e);
        }
        return iStudentRepo.findAllByBoth() ;
  }


}
