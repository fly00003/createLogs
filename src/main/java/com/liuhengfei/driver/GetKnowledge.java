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
    private GetKnowledge() throws IOException {
        knowledges=selectKnowledge();
    };
    private static GetKnowledge instance;
    private static List<Knowledge> knowledges;

    public  List<Knowledge> getKnowledges() {
        return knowledges;
    }

    public static GetKnowledge getInstance() throws IOException {
        if (instance==null)
        {
            instance = new GetKnowledge();
        }
        return instance;
    }
    private static List<Knowledge> selectKnowledge() throws IOException {

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
