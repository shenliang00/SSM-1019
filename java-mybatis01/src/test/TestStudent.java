import com.tedu.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestStudent {
    //查询所有
    @Test
    public void test1() throws IOException {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //创建SqlSessionFactory
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //创建SqlSession
        SqlSession session = sessionFactory.openSession();
        List<Student> list = session.selectList("com.tedu.entity.Student.findById");
        System.out.println(list);
        session.close();
    }
    //查询
    @Test
    public void test2() throws IOException {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //创建SqlSessionFactory
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //创建SqlSession
        SqlSession session = sessionFactory.openSession();
        Student student = session.selectOne("com.tedu.entity.Student.select",3);
        System.out.println(student);
        session.close();
    }
    //添加
    @Test
    public void test3() throws IOException {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //创建SqlSessionFactory
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //创建SqlSession
        SqlSession session = sessionFactory.openSession();
        Student student = new Student();
        student.setId(6);
        student.setName("安东尼");
        student.setSex("男");
        student.setAddress("俄克拉荷马");
        session.insert("com.tedu.entity.Student.insert",student);
        session.commit();
    }
    //删除
    @Test
    public void test4() throws IOException {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //创建SqlSessionFactory
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //创建SqlSession
        SqlSession session = sessionFactory.openSession();
        session.delete("com.tedu.entity.Student.delete",8);
        session.commit();
        session.close();
    }
    //修改
    @Test
    public void test5() throws IOException {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //创建SqlSessionFactory
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //创建SqlSession
        SqlSession session = sessionFactory.openSession();
        Student student = new Student();
        student.setId(5);
        student.setName("哈登");
        session.update("com.tedu.entity.Student.update",student);
        session.commit();
        session.close();
    }

}
