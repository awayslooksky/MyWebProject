package com.huawei.mybatis;

import com.huawei.dao.SC;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {
    @org.junit.Test
    public void getScBySid() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis/sqlMapConfig_bak.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = factory.openSession();
        List<SC> getScBySid1 = sqlSession.selectList("getScBySid", "1001");
        for (SC sc : getScBySid1) {
            //System.out.println(sc.getSid()+","+sc.getCid()+","+sc.getScore());
            System.out.println(sc);
        }
        sqlSession.close();

    }
}
