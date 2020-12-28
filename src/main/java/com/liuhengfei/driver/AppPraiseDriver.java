package com.liuhengfei.driver;

import com.liuhengfei.beans.AppPraise;
import com.liuhengfei.beans.EnvIn;

public class AppPraiseDriver extends BasebeanDriver {
    private AppPraiseDriver(){};
    private static AppPraiseDriver instance;
    public static AppPraiseDriver getInstance()
    {
        if(instance==null)
        {
            instance = new AppPraiseDriver();
        }
        return instance;
    }

    @Override
    protected EnvIn generateBean() {
        AppPraise praise = new AppPraise();

        praise.setId(rand.nextInt(praiseNum));
        //praise.setUserid(rand.nextInt(10));
        praise.setTarget_id(rand.nextInt(allUserNum));
        praise.setType(rand.nextInt(2) + 1);
        praise.setAdd_time((System.currentTimeMillis() - rand.nextInt(99999999)) + "");

        return praise;
    }
}
