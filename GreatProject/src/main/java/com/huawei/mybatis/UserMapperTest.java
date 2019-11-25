package com.huawei.mybatis;

import com.huawei.dao.SC;
import com.huawei.dao.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserMapperTest {
    private SqlSessionFactory getSqlSessionFactory() throws IOException {
        String resource= "mybatis/sqlMapConfig_bak.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        return build;
    }
    @Test
    public void testGetScBySid() throws IOException {
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        try {
            List<SC> scBySid = mapper.getScBySid("1001");
            System.out.println(scBySid);
            for (SC sc : scBySid) {
                System.out.println(sc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }

    }
}
