package com.example.xiongxiong.mydiary.bean;

import com.example.xiongxiong.mydiary.util.Constant;

public class DiaryBean extends BaseBean {
    private int type = Constant.DIARY;
    private int imgRes;
    String title;
    int num;

    public DiaryBean(String title) {
        this.title = title;
    }
}
