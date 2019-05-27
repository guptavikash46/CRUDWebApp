package com.vikas.Service.Student;

import com.vikas.Model.Student;
import com.vikas.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteStudentByIdServiceImpl implements DeleteStudentByIdService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student deleteStudentById(Integer id) {
        Student st = studentRepository.getStudentById(id);
        studentRepository.delete(st);
        return st;
    }
}
