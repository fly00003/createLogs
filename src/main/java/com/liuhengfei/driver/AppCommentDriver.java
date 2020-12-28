package com.liuhengfei.driver;

import com.liuhengfei.beans.AppComment;
import com.liuhengfei.beans.EnvIn;
import com.liuhengfei.pojo.Knowledge;

import java.io.IOException;
import java.util.List;

public class AppCommentDriver extends BasebeanDriver {
    private AppCommentDriver(){};
    private static AppCommentDriver instance;
    public  static AppCommentDriver getInstance()
    {
        if(instance==null)
        {
            instance=new AppCommentDriver();
        }
        return instance;
    }
    @Override
    protected EnvIn generateBean() {
        AppComment comment = new AppComment();

        comment.setComment_id(rand.nextInt(commentNum));
        //comment.setUserid(rand.nextInt(10));
        comment.setP_comment_id(rand.nextInt(commentNum/2));

        try {
            comment.setContent(getCONTENT());
        } catch (IOException e) {
            e.printStackTrace();
        }
        comment.setAddtime((System.currentTimeMillis() - rand.nextInt(99999999)) + "");

        comment.setOther_id(rand.nextInt(100));
        comment.setPraise_count(rand.nextInt(5000));
        comment.setReply_count(rand.nextInt(200));

        return comment;
    }

    private String getCONTENT() throws IOException {

        String str ="";

        for (int i = 0; i < rand.nextInt(10); i++) {
            str=str+","+getRandomKeyword();
        }

        return str;
    }

    private String getRandomKeyword() throws IOException {
        List<Knowledge> knowledges = GetKnowledge.getInstance().getKnowledges();
        int flag = rand.nextInt(2);
        if (flag==0)
        {
            return knowledges.get(rand.nextInt(knowledges.size())).getKey_words();
        }
        else
        {
            return knowledges.get(rand.nextInt(knowledges.size())).getKnowledge_subject();
        }
    }
}
