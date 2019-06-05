package com.vikas.Controller;

import com.vikas.ExceptionHandling.NotFoundException;
import com.vikas.Model.Student;
import com.vikas.Model.University;
import com.vikas.Service.Student.AddStudentService;
import com.vikas.Service.Student.DeleteStudentByIdService;
import com.vikas.Service.Student.ShowAllStudentService;
import com.vikas.Service.University.FindUniversityService;
import org.aspectj.weaver.ast.Not;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class StudentController {

    @Autowired
    private AddStudentService addStudentService;
    @Autowired
    private ShowAllStudentService showAllStudentService;

    @Autowired
    private FindUniversityService findUniversityService;

    @Autowired
    private DeleteStudentByIdService deleteStudentByIdService;

    @PostMapping("/app/addStudent")
    public Student addStudent(@RequestParam(value = "name") String name, @RequestParam(value = "course")
             String course, @RequestParam(value = "age")Integer age, @RequestParam(value = "email") String email,
             @RequestParam(value = "uniID") Integer uniID){
        Student student = new Student();
        University joinUniversity = new University();

        student.setStu_name(name);
        student.setCourse(course);
        student.setAge(age);
        student.setEmail(email);
        //setting the university id to the student table for join
        joinUniversity.setUniv_id(uniID);
        student.setUniversity(joinUniversity);

        if (findUniversityService.isUniversityFound(uniID)) {
            addStudentService.addStudent(student);
            return student;
        }
        else {
            throw new NotFoundException("The university with ID:"+ uniID+ " is not found");
        }

    }

    @GetMapping("/app/allStudents")
    public List<Student> showAllStudents(){
        return showAllStudentService.showStudents();
    }

    @DeleteMapping("/app/deleteStudent/{id}")
    public Boolean deleteStudentById(@PathVariable Integer id){
        try {
            deleteStudentByIdService.deleteStudentById(id);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

}
