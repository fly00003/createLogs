package com.liuhengfei.beans;

import lombok.Getter;
import lombok.Setter;

/**
 * 评论
 */
@Getter
@Setter
public class AppComment implements EnvIn {

    protected int comment_id;//评论表
    //protected int userid;//用户id
    protected  int p_comment_id;//父级评论id(为0则是一级评论,不为0则是回复)
    protected String content;//评论内容
    protected String addtime;//创建时间
    protected int other_id;//评论的相关id
    protected int praise_count;//点赞数量
    protected int reply_count;//回复数量

}