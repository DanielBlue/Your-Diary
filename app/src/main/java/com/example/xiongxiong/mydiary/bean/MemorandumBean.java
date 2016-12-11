package com.example.xiongxiong.mydiary.bean;

import com.example.xiongxiong.mydiary.util.Constant;

/**
 * Created by xiongxiong on 2016/12/11.
 */

public class MemorandumBean extends BaseBean {
    private int type = Constant.MEMORANDUM;
    private int imgRes;
    String title;
    int num;

    public MemorandumBean(String title) {
        this.title = title;
    }
}
