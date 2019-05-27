package com.vikas.Repository;

import com.vikas.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query("select s from Student s order by s.stu_id")
    List<Student> showStudents();

    @Query("select s from Student s where s.stu_id =:ID")
    Student getStudentById(@Param("ID") Integer ID);
}
