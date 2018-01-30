package test;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.ssm.entity.Student;
import org.junit.Test;
public class TestStudent {
 @Test
    public void test2() throws IOException{
        String resource = "mybatis/SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = factory.openSession();
        Student student = session.selectOne("com.ssm.entity.Student.select",2);
        System.out.println(student);
        session.close();
    }
}
