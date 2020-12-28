package com.liuhengfei.driver;

import com.liuhengfei.beans.AppNewsDetail;
import com.liuhengfei.beans.EnvIn;

public class AppNewsDetailDriver extends BasebeanDriver{
    private AppNewsDetailDriver(){};
    private static AppNewsDetailDriver instance;
    public static AppNewsDetailDriver getInstance()
    {
        if(instance==null)
        {
            instance = new AppNewsDetailDriver();
        }
        return instance;
    }

    @Override
    protected EnvIn generateBean() {
        AppNewsDetail appNewsDetail = new AppNewsDetail();

        // 页面入口来源
        int flag = 1 + rand.nextInt(3);
        appNewsDetail.setEntry(flag + "");

        // 动作
        appNewsDetail.setAction("" + (rand.nextInt(4) + 1));

        // 资源id
        appNewsDetail.setGoodsid(s_goodsid + "");

        // 资源来源类型
//        flag = 1 + rand.nextInt(3);
//        appNewsDetail.setShowtype(flag + "");

        // 资源样式
        flag = rand.nextInt(6);
        appNewsDetail.setShowtype("" + flag);

        // 页面停留时长
        flag = rand.nextInt(10) * rand.nextInt(7);
        appNewsDetail.setNews_staytime(flag + "");

        // 加载时长
        flag = rand.nextInt(10) * rand.nextInt(7);
        appNewsDetail.setLoading_time(flag + "");

        // 加载失败码
        flag = rand.nextInt(10);
        switch (flag) {
            case 1:
                appNewsDetail.setType1("102");
                break;
            case 2:
                appNewsDetail.setType1("201");
                break;
            case 3:
                appNewsDetail.setType1("325");
                break;
            case 4:
                appNewsDetail.setType1("433");
                break;
            case 5:
                appNewsDetail.setType1("542");
                break;
            default:
                appNewsDetail.setType1("");
                break;
        }

        // 分类
        flag = 1 + rand.nextInt(100);
        appNewsDetail.setCategory("" + flag);

        //类型
        appNewsDetail.setType(rand.nextInt(7)+1);
        return appNewsDetail;
    }
}
