package com.vikas.Service.Student;

import com.vikas.Model.Student;
import com.vikas.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShowAllStudentServiceImpl implements ShowAllStudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public List<Student> showStudents() {
        return studentRepository.showStudents();
    }
}
