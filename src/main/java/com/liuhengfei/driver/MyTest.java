package com.liuhengfei.driver;

import com.liuhengfei.beans.AppSearch;
import com.liuhengfei.pojo.Knowledge;
import com.liuhengfei.pojo.KnowledgeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(AppSearchDriver.getInstance().envLog(1));
        }

    }
    @Test
    public void selectKnowledge() throws IOException {

        String resource = "config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        KnowledgeMapper mapper = sqlSession.getMapper(KnowledgeMapper.class);

        List<Knowledge> knowledgeList = mapper.selectKnowledge();
        for (Knowledge knowledge: knowledgeList){
            System.out.println(knowledge);
        }

        sqlSession.close();
    }
}


