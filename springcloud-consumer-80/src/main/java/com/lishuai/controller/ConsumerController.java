package com.lishuai.controller;

import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ConsumerController {

    //private final static String URL = "http://localhost:8081";
    //有了注册中心，配置文件知道了注册中心的地址，所以这里只需要知道服务的application名字即可
    private final static String URL = "http://SPRINGCLOUD-PROVIDER-SERVICE";

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping("/consumer/list")
    public List queryAll(){
        return restTemplate.getForObject(URL+"/listStudent",List.class);
    }

    @RequestMapping("/consumer/add")
    public Integer addStudent(Student student){
        return restTemplate.postForObject(URL+"/addStudent",student,Integer.class);
    }

    @RequestMapping("/consumer/delete/{id}")
    public Integer deleteStudent(@PathVariable int id){
        return restTemplate.getForObject(URL+"/deleteStudent/"+id,Integer.class);
    }

    @RequestMapping("/consumer/find/{id}")
    public Student findStudent(@PathVariable int id){
        return restTemplate.getForObject(URL+"/findStudent/"+id,Student.class);
    }

}
