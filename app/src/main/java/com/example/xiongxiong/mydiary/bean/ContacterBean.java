package com.example.xiongxiong.mydiary.bean;

import com.example.xiongxiong.mydiary.util.Constant;

/**
 * Created by xiongxiong on 2016/12/11.
 */

public class ContacterBean extends BaseBean {
    private int type = Constant.CONTACTER;
    private int imgRes;
    String title;
    int num;

    public ContacterBean(String title) {
        this.title = title;
    }
}
