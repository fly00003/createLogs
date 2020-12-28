package com.liuhengfei.driver;

import com.liuhengfei.beans.AppDisplay;
import com.liuhengfei.beans.EnvIn;

public class AppDisplayDriver extends BasebeanDriver{
    private AppDisplayDriver(){};
    private static AppDisplayDriver instance;
    public static AppDisplayDriver getInstance()
    {
        if(instance==null)
        {
            instance = new AppDisplayDriver();
        }
        return instance;
    }

    @Override
    protected EnvIn generateBean() {
        AppDisplay appDisplay = new AppDisplay();

        boolean boolFlag = rand.nextInt(10) < 7;

        // 动作：曝光商品=1，点击商品=2，
        if (boolFlag) {
            appDisplay.setAction("1");
        } else {
            appDisplay.setAction("2");
        }

        // 商品id
        String goodsId = s_goodsid + "";
        s_goodsid++;

        appDisplay.setGoodsid(goodsId);

        // 顺序  设置成6条吧
        int flag = rand.nextInt(10);
        appDisplay.setPlace("" + flag);

        // 曝光类型
        flag = 1 + rand.nextInt(2);
        appDisplay.setExtend1("" + flag);

        // 分类
        flag = 1 + rand.nextInt(100);
        appDisplay.setCategory("" + flag);

        //类型
        appDisplay.setType(rand.nextInt(7)+1);
        return appDisplay;
    }
}
