package com.ssm.dao;

import java.util.List;

import com.ssm.entity.Student;

public interface StudentDao {
    //查询所有数据
    List<Student>selectFind(Student student);
    //添加
    public int add(Student student);
    //删除
    public int delete(int id);
    //修改
    public int update(Student student);
    //查询
    public Student select(String name);

}
