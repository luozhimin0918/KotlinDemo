package com.kotlindemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;

import com.lvr.library.adapter.CommonAdapter;
import com.lvr.library.holder.BaseViewHolder;
import com.lvr.library.recyclerview.HRecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends BaseNewDemo {
    HRecyclerView hRecyclerView;
    List<String> mDatas=new ArrayList<>();
    @Override
    public void show() {
        Log.d("NewDemo","show");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity","onCreate");
        NewDemo newDemo = new NewDemo();
        newDemo.show();
        newDemo.TO();

         hRecyclerView= (HRecyclerView) findViewById(R.id.list);
        mDatas.add("uuuuuuuuu");
        mDatas.add("rrrrrrrrr");
        mDatas.add("uuuuutttt");
        mDatas.add("kkkkggggg");
        mDatas.add("xxxxxxxxx");



        CommonAdapter<String> mAdapter = new CommonAdapter<String>(this, R.layout.item_layout, mDatas) {
            @Override
            public void convert(BaseViewHolder holder, int position) {
                holder.setText(R.id.tv_content,mDatas.get(position));

            }
        };
        hRecyclerView.setAdapter(mAdapter);
        hRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity","onResume");
    }
}
