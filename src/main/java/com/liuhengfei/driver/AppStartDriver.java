package com.liuhengfei.driver;

import com.alibaba.fastjson.JSON;
import com.liuhengfei.beans.AppStart;
import com.liuhengfei.beans.EnvIn;
import org.junit.Test;

public class AppStartDriver extends BasebeanDriver{
    private static AppStartDriver instance;
    private AppStartDriver(){};

    public static AppStartDriver getInstance() {
        if(instance==null)
        {
            instance = new AppStartDriver();
        }
        return instance;
    }


    protected AppStart generateBean() {

        AppStart appStart = new AppStart();

        //设置日志类型
        appStart.setEn("start");
        int flag = rand.nextInt(3);
        // 入口
        flag = rand.nextInt(5) + 1;
        appStart.setEntry(flag + "");
        // 加载时长
        appStart.setLoading_time(rand.nextInt(20) + "");
        // 客户端产生日志时间
        long millis = System.currentTimeMillis();
        // 状态
        flag = rand.nextInt(10) > 8 ? 2 : 1;
        appStart.setAction(flag + "");

        // 加载时长
        appStart.setLoading_time(rand.nextInt(20) + "");

        // 失败码
        flag = rand.nextInt(10);
        switch (flag) {
            case 1:
                appStart.setDetail("102");
                break;
            case 2:
                appStart.setDetail("201");
                break;
            case 3:
                appStart.setDetail("325");
                break;
            case 4:
                appStart.setDetail("433");
                break;
            case 5:
                appStart.setDetail("542");
                break;
            default:
                appStart.setDetail("");
                break;
        }

        // 扩展字段
        appStart.setExtend1("");

        return appStart;
    }

    public String envLog(int id)
    {
        produceBaseinfo(id);
        String basejson = JSON.toJSON(basebean).toString();
        String appStartjson = JSON.toJSON(generateBean()).toString();
        String appstartlog = basejson.substring(0,basejson.length()-1)+","+appStartjson.substring(1);
        return appstartlog;
    }

}
