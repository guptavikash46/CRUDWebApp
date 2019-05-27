package com.vikas.Service.Student;

import com.vikas.Model.Student;
import com.vikas.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddStudentServiceImpl implements AddStudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }
}
