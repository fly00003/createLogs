package com.liuhengfei.driver;

import com.liuhengfei.pojo.Knowledge;
import com.liuhengfei.pojo.KnowledgeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class GetKnowledge {
    private GetKnowledge(){};
    private GetKnowledge instance;
    public GetKnowledge getInstance()
    {
        if (instance==null)
        {
            instance = new GetKnowledge();
        }
        return instance;
    }
    public List<Knowledge> selectKnowledge() throws IOException {

        String resource = "config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        KnowledgeMapper mapper = sqlSession.getMapper(KnowledgeMapper.class);

        List<Knowledge> knowledgeList = mapper.selectKnowledge();
        sqlSession.close();
        return knowledgeList;
    }
}
