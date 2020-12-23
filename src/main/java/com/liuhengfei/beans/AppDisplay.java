package com.liuhengfei.beans;

import lombok.Getter;
import lombok.Setter;

/**
 * 点击日志
 */
@Setter
@Getter
public class AppDisplay extends Basebean{
    protected String action;//动作：曝光=1，点击=2，
    protected String goodsid;//商品ID（服务端下发的ID）
    protected String place;//顺序（第几条商品，第一条为0，第二条为1，如此类推）
    protected String extend1;//曝光类型：1 - 首次曝光 2-重复曝光（没有使用）
    protected String category;//分类ID（服务端定义的分类ID）
    protected int type;//资源类型：众筹=1，众创=2，标注=3，视频资源=4，音频资源=5，文本资源=6，图片资源=7
}
