package com.liuhengfei.beans;

import lombok.Getter;
import lombok.Setter;

/**
 * 错误日志
 */
@Setter
@Getter
public class AppErrorLog{

    protected String errorBrief;    //错误摘要
    protected String errorDetail;   //错误详情

}
