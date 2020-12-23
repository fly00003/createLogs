package com.liuhengfei.beans;

import lombok.Getter;
import lombok.Setter;

/**
 * 启动日志
 */
@Getter
@Setter
public class AppStart extends Basebean {
    protected String entry;//入口： push=1，widget=2，icon=3，notification=4, lockscreen_widget =5
    protected String open_ad_type;//开屏广告类型:  开屏原生广告=1, 开屏插屏广告=2
    protected String action;//状态：成功=1  失败=2
    protected String loading_time;//加载时长：计算下拉开始到接口返回数据的时间，（开始加载报0，加载成功或加载失败才上报时间）
    protected String detail;//失败码（没有则上报空）
    protected String extend1;//失败的message（没有则上报空）
    protected String en;//启动日志类型标记
}
