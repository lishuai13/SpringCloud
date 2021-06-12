package com.lishuai.service;

import entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Component
@FeignClient(value = "SPRINGCLOUD-PROVIDER-SERVICE")    //指定服务名称
public interface ConsumerService {

    //在该服务下执行什么请求
    @GetMapping("/listStudent")
    //对应的服务的接口
    List<Student> getAllPerson();

    @GetMapping("/deleteStudent/{id}")
    int delete(@PathVariable("id") int id);

    @PostMapping("/addStudent")
    int addStudent(Student student);

    @GetMapping("/findStudent/{id}")
    Student find(@PathVariable("id") int id);
}
