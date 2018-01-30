package test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssm.dao.StudentDao;
import com.ssm.entity.Student;
import com.ssm.service.StudentService;

public class TestStudent1 {

    ApplicationContext ac;
    @Before
    public void set(){
        ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-service.xml");
    }
    //查询所有
    @Test
    public void test1()throws Exception{
        StudentDao it = (StudentDao) ac.getBean("studentDao");
        List<Student>list = it.selectFind(null);
        System.out.println(list);
    }
    //查询所有
    @Test
    public void test2()throws Exception{
        StudentService it = (StudentService) ac.getBean("studentServiceImpl");
        List<Student>list = it.selectFind(null);
        System.out.println(list);
    }
    //添加
    @Test
    public void test3(){
        StudentDao sd1 = (StudentDao) ac.getBean("studentDao");
        Student student1 = new Student();
        student1.setId(7);
        student1.setName("科比");
        student1.setSex("男");
        student1.setAddress("洛杉矶");
        sd1.add(student1);
        System.out.println("添加成功");
    }
    //删除
    @Test
    public void test4(){
        StudentDao sd2 = (StudentDao) ac.getBean("studentDao");
        sd2.delete(7);
        System.out.println("删除成功");
    }

    //修改
    @Test
    public void test5(){
        StudentDao sd3 = (StudentDao) ac.getBean("studentDao");
        Student student3 = new Student();
        student3.setName("哈登");
        student3.setId(4);
        sd3.update(student3);
        System.out.println("修改成功");
    }
    //查询
    @Test
    public void test6(){
        StudentDao sd4 = (StudentDao) ac.getBean("studentDao");
        Student stu = sd4.select("杜兰特");
        System.out.println(stu);
    }

}
