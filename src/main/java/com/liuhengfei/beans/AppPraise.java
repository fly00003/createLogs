package com.liuhengfei.beans;

import lombok.Getter;
import lombok.Setter;

/**
 * 点赞
 */
@Getter
@Setter
public class AppPraise implements EnvIn{
    protected int id; //主键id
    //protected int userid;//用户id
    protected int target_id;//点赞的对象id
    protected int type;//点赞类型 1资源点赞 2评论点赞
    protected String add_time;//添加时间
}
