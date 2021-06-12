package com.lishuai.controller;

import com.lishuai.service.StudentService;
import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/listStudent")
    public List<Student> getAllPerson(){
        return studentService.findALL();
    }

    //通过路径得到参数
    @GetMapping("/deleteStudent/{id}")
    public int delete(@PathVariable int id){
        return studentService.delete(id);
    }

    //如果参数是放在请求体中，传入后台的话，那么后台要用@RequestBody才能接收到
    @PostMapping("/addStudent")
    public int addStudent(@RequestBody Student student){
        return studentService.insert(student);
    }

    //通过路径得到参数
    @GetMapping("/findStudent/{id}")
    public Student find(@PathVariable int id){
        return studentService.find(id);
    }
}
