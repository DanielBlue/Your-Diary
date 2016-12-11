package com.example.xiongxiong.mydiary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.xiongxiong.mydiary.bean.BaseBean;
import com.example.xiongxiong.mydiary.bean.ContacterBean;
import com.example.xiongxiong.mydiary.bean.DiaryBean;
import com.example.xiongxiong.mydiary.bean.MemorandumBean;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<BaseBean> mDatalist;
    private RecyclerView rv_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
        UpdateView();
    }

    private void UpdateView() {
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        rv_list.setLayoutManager(manager);
        rv_list.setAdapter(new MainListAdapter());
    }

    private void initData() {
        mDatalist = new ArrayList<>();
        BaseBean bean = new DiaryBean("緊急時以外かけちゃダメ！");
        mDatalist.add(bean);
        bean = new ContacterBean("DIARY");
        mDatalist.add(bean);
        bean = new MemorandumBean("禁止事項 Ver.5");
        mDatalist.add(bean);
        bean = new MemorandumBean("ゼッタイ禁止");
        mDatalist.add(bean);
    }

    private void initView() {
        LinearLayout ll_user_name = (LinearLayout) findViewById(R.id.ll_user_name);
        TextView tv_name = (TextView) findViewById(R.id.tv_name);
        rv_list = (RecyclerView) findViewById(R.id.rv_list);
    }

    private class MainListAdapter extends RecyclerView.Adapter {

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return mDatalist.size();
        }
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}