package com.lishuai.mapper;


import entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper //这个注解说明他是Mybatis的组件
@Repository //这个注解说明他是Spring的组件
public interface StudentMapper {


    List<Student> findAll();

    int delete(int id);

    int insert(Student student);

    Student find(int id);
}
