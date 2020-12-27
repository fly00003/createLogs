package com.liuhengfei.beans;

import lombok.Data;

@Data
public class Basebean {
    protected String mid; // (String) 设备唯一标识
    protected String uid; // (String) 用户uid
    protected String vc;  // (String) versionCode，程序版本号
    protected String vn;  // (String) versionName，程序版本名
    protected String l;   // (String) 系统语言
    //protected String sr;  // (String) 渠道号，应用从哪个渠道来的。
    protected String os;  // (String) Android系统版本
    protected String ar;  // (String) 区域
    protected String md;  // (String) 手机型号
    protected String ba;  // (String) 手机品牌
    protected String sv;  // (String) sdkVersion
    protected String g;   // (String) gmail
    protected String hw;  // (String) heightXwidth，屏幕宽高
    protected String t;   // (String) 客户端日志产生时的时间
    protected String nw;  // (String) 网络模式
    protected String ln;  // (double) lng经度
    protected String la;  // (double) lat 纬度
}
