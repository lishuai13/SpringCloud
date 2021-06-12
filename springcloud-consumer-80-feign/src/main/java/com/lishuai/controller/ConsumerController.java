package com.lishuai.controller;

import com.lishuai.service.ConsumerService;
import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;


    @RequestMapping("/consumer/list")
    public List queryAll(){
        return consumerService.getAllPerson();
    }

    @RequestMapping("/consumer/add")
    public Integer addStudent(Student student){
        return consumerService.addStudent(student);
    }

    @RequestMapping("/consumer/delete/{id}")
    public Integer deleteStudent(@PathVariable int id){
        return consumerService.delete(id);
    }

    @RequestMapping("/consumer/find/{id}")
    public Student findStudent(@PathVariable int id){
        return consumerService.find(id);
    }

}
