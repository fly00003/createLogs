package com.liuhengfei.driver;

import com.liuhengfei.beans.Basebean;

import java.util.Random;

public class BasebeanDriver {
    private static Random rand = new Random();
    protected Basebean basebean = new Basebean();
    private Basebean produceBaseinfo(int id)
    {

        if (id<100000)
        {
            basebean.setMid(id+"");
            basebean.setUid(id+"");
        }
        else
        {
            basebean.setMid(id+"");
            basebean.setUid("");
        }
        //程序版本号 5,6等
        basebean.setVc("" + rand.nextInt(20));

        //程序版本名 v1.1.1
        basebean.setVn("1." + rand.nextInt(4) + "." + rand.nextInt(10));

        // 安卓系统版本
        basebean.setOs("8." + rand.nextInt(3) + "." + rand.nextInt(10));

        // 语言  es,en,pt
        int flag = rand.nextInt(3);
        switch (flag) {
            case (0):
                basebean.setL("es");
                break;
            case (1):
                basebean.setL("en");
                break;
            case (2):
                basebean.setL("pt");
                break;
        }


        // 区域
        flag = rand.nextInt(2);
        switch (flag) {
            case 0:
                basebean.setAr("BR");
            case 1:
                basebean.setAr("MX");
        }

        // 手机品牌 ba ,手机型号 md，就取2位数字了
        flag = rand.nextInt(3);
        switch (flag) {
            case 0:
                basebean.setBa("Sumsung");
                basebean.setMd("sumsung-" + rand.nextInt(20));
                break;
            case 1:
                basebean.setBa("Huawei");
                basebean.setMd("Huawei-" + rand.nextInt(20));
                break;
            case 2:
                basebean.setBa("HTC");
                basebean.setMd("HTC-" + rand.nextInt(20));
                break;
        }

        // 嵌入sdk的版本
        basebean.setSv("V2." + rand.nextInt(10) + "." + rand.nextInt(10));
        // gmail
        basebean.setG(getRandomCharAndNumr(8) + "@gmail.com");

        // 屏幕宽高 hw
        flag = rand.nextInt(4);
        switch (flag) {
            case 0:
                basebean.setHw("640*960");
                break;
            case 1:
                basebean.setHw("640*1136");
                break;
            case 2:
                basebean.setHw("750*1134");
                break;
            case 3:
                basebean.setHw("1080*1920");
                break;
        }

        // 客户端产生日志时间
        long millis = System.currentTimeMillis();
        basebean.setT("" + (millis - rand.nextInt(99999999)));

        // 手机网络模式 3G,4G,WIFI
        flag = rand.nextInt(3);
        switch (flag) {
            case 0:
                basebean.setNw("5G");
                break;
            case 1:
                basebean.setNw("4G");
                break;
            case 2:
                basebean.setNw("WIFI");
                break;
        }

        // 拉丁美洲 西经34°46′至西经117°09；北纬32°42′至南纬53°54′
        // 经度
        basebean.setLn((-34 - rand.nextInt(83) - rand.nextInt(60) / 10.0) + "");
        // 纬度
        basebean.setLa((32 - rand.nextInt(85) - rand.nextInt(60) / 10.0) + "");

        return basebean;
    }
    public static int[] genRandomArray(int m , int n) {
        if(m<=0) return null;
        if(n<=0) return null;
        if(m< n) return null;

        int[] intRet = new int[n];
        int intRd = 0; // 存放随机数
        int count = 0; // 记录生成的随机数个数
        boolean flag = false;  // 是否已经生成过标志
        while(count< n){
            Random rdm = new Random(System.currentTimeMillis());
            intRd = Math.abs(rdm.nextInt())%m +1;
            for(int i=0;i<count;i++){
                if(intRet[i]==intRd){
                    flag = true;
                    break;
                }else{
                    flag = false;
                }
            }
            if(flag==false){
                intRet[count] = intRd;
                count++;
            }
        }
        return intRet;
    }

    /**
     * 获取随机字母数字组合
     * @param length 字符串长度
     */
    private static String getRandomCharAndNumr(Integer length) {

        StringBuilder str = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {

            boolean b = random.nextBoolean();

            if (b) { // 字符串
                // int choice = random.nextBoolean() ? 65 : 97; 取得65大写字母还是97小写字母
                str.append((char) (65 + random.nextInt(26)));// 取得大写字母
            } else { // 数字
                str.append(String.valueOf(random.nextInt(10)));
            }
        }

        return str.toString();
    }

}
