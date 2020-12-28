package com.liuhengfei.driver;

import com.alibaba.fastjson.JSON;
import com.liuhengfei.beans.AppLoading;

public class AppLoadingDriver extends BasebeanDriver{
    private AppLoadingDriver(){};
    private static AppLoadingDriver instance;
    public static AppLoadingDriver getInstance()
    {
        if (instance==null)
        {
            instance = new AppLoadingDriver();
        }
        return instance;
    }
    //产生资源列表对象
    protected AppLoading generateBean()
    {
        AppLoading appLoading = new AppLoading();
        // 动作
        int flag = rand.nextInt(3) + 1;
        appLoading.setAction(flag + "");

        // 加载时长
        flag = rand.nextInt(10) * rand.nextInt(7);
        appLoading.setLoading_time(flag + "");

        // 页面  加载类型
        flag = 1 + rand.nextInt(2);
        appLoading.setLoading_way("" + flag);

        // 扩展字段1
        appLoading.setExtend1("");

        // 扩展字段2
        appLoading.setExtend2("");

        //资源类型：众筹=1，众创=2，标注=3，视频资源=4，音频资源=5，文本资源=6，图片资源=7
        flag = rand.nextInt(7)+1;
        appLoading.setType(flag);

        // 失败码
        flag = rand.nextInt(10);
        switch (flag) {
            case 1:
                appLoading.setType1("102");
                break;
            case 2:
                appLoading.setType1("201");
                break;
            case 3:
                appLoading.setType1("325");
                break;
            case 4:
                appLoading.setType1("433");
                break;
            case 5:
                appLoading.setType1("542");
                break;
            default:
                appLoading.setType1("");
                break;
        }

        return appLoading;
    }

}
