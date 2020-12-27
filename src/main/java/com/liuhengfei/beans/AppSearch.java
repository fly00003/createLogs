package com.liuhengfei.beans;

import lombok.Getter;
import lombok.Setter;

/*
*搜索日志
 */
@Setter
@Getter
public class AppSearch {
    protected int id;
    protected int user_id;
    protected String content;
    protected String add_time;
}
