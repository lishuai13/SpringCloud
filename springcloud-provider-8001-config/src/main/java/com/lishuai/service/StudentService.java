package com.lishuai.service;


import com.lishuai.mapper.StudentMapper;
import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentMapper studentMapper;

    public List<Student> findALL(){
        List<Student> students = studentMapper.findAll();
        return students;
    }

    public int delete(int id){
       return studentMapper.delete(id);
    }


    public int insert(Student student){
        return studentMapper.insert(student);
    }

    public Student find(int id){
        return studentMapper.find(id);
    }
}
