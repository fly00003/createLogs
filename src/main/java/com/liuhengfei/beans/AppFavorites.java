package com.liuhengfei.beans;

import lombok.Getter;
import lombok.Setter;

/**
 * 收藏
 */
@Getter
@Setter
public class AppFavorites implements EnvIn{
    protected int id;//主键
    protected int res_id;//商品id
    //protected int userid;//用户ID
    protected String add_time;//创建时间
}
