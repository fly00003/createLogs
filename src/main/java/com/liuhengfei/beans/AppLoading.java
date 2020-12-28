package com.liuhengfei.beans;

import lombok.Getter;
import lombok.Setter;

/**
 * 资源列表
 */
@Getter
@Setter
public class AppLoading implements EnvIn{
    protected String action;//动作：开始加载=1，加载成功=2，加载失败=3
    protected String loading_time;//加载时长：计算下拉开始到接口返回数据的时间，（开始加载报0，加载成功或加载失败才上报时间）
    protected String loading_way;//加载类型：1-读取缓存，2-从接口拉新数据   （加载成功才上报加载类型）
    protected String extend1;//扩展字段 Extend1
    protected String extend2;//扩展字段 Extend2
    protected int type;////资源类型：众筹=1，众创=2，标注=3，视频资源=4，音频资源=5，文本资源=6，图片资源=7
    protected String type1;//加载失败码：把加载失败状态码报回来（报空为加载成功，没有失败）
}
