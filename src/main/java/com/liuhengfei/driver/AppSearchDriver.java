package com.liuhengfei.driver;

import com.liuhengfei.beans.AppSearch;
import com.liuhengfei.beans.EnvIn;
import com.liuhengfei.pojo.Knowledge;

import java.io.IOException;
import java.util.List;

public class AppSearchDriver extends BasebeanDriver {
    private AppSearchDriver(){};
    private static AppSearchDriver instance;
    public static AppSearchDriver getInstance()
    {
        if(instance==null)
        {
            instance=new AppSearchDriver();
        }
        return instance;
    }

    @Override
    protected EnvIn generateBean() {
        AppSearch appSearch = new AppSearch();
        appSearch.setId(rand.nextInt(searchNum));
        appSearch.setAdd_time((System.currentTimeMillis() - rand.nextInt(99999999)) + "");
        try {
            appSearch.setContent(getRandomKeyword());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return appSearch;
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
