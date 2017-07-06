package com.kotlindemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.Toast;

import com.lvr.library.adapter.CommonAdapter;
import com.lvr.library.adapter.MultiItemCommonAdapter;
import com.lvr.library.anims.adapters.AlphaInAnimationAdapter;
import com.lvr.library.anims.adapters.ScaleInAnimationAdapter;
import com.lvr.library.anims.animators.LandingAnimator;
import com.lvr.library.anims.animators.SlideInLeftAnimator;
import com.lvr.library.holder.BaseViewHolder;
import com.lvr.library.recyclerview.HRecyclerView;
import com.lvr.library.recyclerview.OnLoadMoreListener;
import com.lvr.library.recyclerview.OnRefreshListener;
import com.lvr.library.support.MultiItemTypeSupport;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends BaseNewDemo implements OnRefreshListener,OnLoadMoreListener{
    HRecyclerView hRecyclerView;
    List<String> mDatas=new ArrayList<>();
     MultiItemCommonAdapter<String> mAdapter;
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
        mDatas.add("uuuuuuuuu");
        mDatas.add("rrrrrrrrr");
        mDatas.add("uuuuutttt");
        mDatas.add("kkkkggggg");
        mDatas.add("xxxxxxxxx");
        mDatas.add("uuuuuuuuu");
        mDatas.add("rrrrrrrrr");
        mDatas.add("uuuuutttt");
        mDatas.add("kkkkggggg");
        mDatas.add("xxxxxxxxx");
        mDatas.add("uuuuuuuuu");
        mDatas.add("rrrrrrrrr");
        mDatas.add("uuuuutttt");
        mDatas.add("kkkkggggg");
        mDatas.add("xxxxxxxxx");
        mDatas.add("uuuuuuuuu");
        mDatas.add("rrrrrrrrr");
        mDatas.add("uuuuutttt");
        mDatas.add("kkkkggggg");
        mDatas.add("xxxxxxxxx");
        mDatas.add("uuuuuuuuu");
        mDatas.add("rrrrrrrrr");
        mDatas.add("uuuuutttt");
        mDatas.add("kkkkggggg");
        mDatas.add("xxxxxxxxx");



       /* CommonAdapter<String> mAdapter = new CommonAdapter<String>(this, R.layout.item_layout, mDatas) {
            @Override
            public void convert(BaseViewHolder holder, int position) {
                holder.setText(R.id.tv_content,mDatas.get(position));

            }
        };*/
        MultiItemTypeSupport<String> support=new MultiItemTypeSupport<String>() {
            @Override
            public int getLayoutId(int i) {
                if(i==0){
                   return R.layout.item_layout;
                }else {
                   return R.layout.item_two_layout;
                }
            }

            @Override
            public int getItemViewType(int i, String s) {
                if(i%3==0&&i>0){
                    return  0;
                }else {
                    return 1;
                }
            }
        };
         mAdapter=new MultiItemCommonAdapter<String>(this,mDatas,support) {
            @Override
            public void convert(BaseViewHolder baseViewHolder, int i) {
                baseViewHolder.setText(R.id.tv_content,mDatas.get(i));
            }
        };

        hRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter.setOnItemClickListener(new CommonAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, RecyclerView.ViewHolder viewHolder, int i) {
                Toast.makeText(getApplicationContext(),"item "+i,Toast.LENGTH_SHORT).show();

            }
        });
        mAdapter.setOnItemLongClickListener(new CommonAdapter.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(View view, RecyclerView.ViewHolder viewHolder, int i) {
                Toast.makeText(getApplicationContext(),"item  long "+i,Toast.LENGTH_SHORT).show();
                return false;
            }
        });
//        hRecyclerView.setItemAnimator(new LandingAnimator());
     /*  SlideInLeftAnimator animator = new SlideInLeftAnimator();
        animator.setInterpolator(new OvershootInterpolator());
        hRecyclerView.setItemAnimator(animator);*/

        AlphaInAnimationAdapter alphaAdapter = new AlphaInAnimationAdapter(mAdapter);
        hRecyclerView.setAdapter(new ScaleInAnimationAdapter(alphaAdapter));

        hRecyclerView.setOnRefreshListener(this);
        hRecyclerView.setOnLoadMoreListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity","onResume");
    }

    @Override
    public void onLoadMore() {
        mDatas.add("888888888");
        mDatas.add("888888888");
        mDatas.add("888888888");
        mDatas.add("888888888");
        mDatas.add("888888888");
        mDatas.add("888888888");
        mDatas.add("888888888");
        mDatas.add("888888888");
        mDatas.add("888888888");
        mDatas.add("888888888");
        mDatas.add("888888888");
        mDatas.add("888888888");
        mDatas.add("888888888");
        mDatas.add("888888888");
        mDatas.add("888888888");
        mDatas.add("888888888");
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void onRefresh() {
        mDatas.clear();
        mDatas.add("6666666666");
        mDatas.add("6666666666");
        mDatas.add("6666666666");
        mDatas.add("6666666666");
        mDatas.add("6666666666");
        mDatas.add("6666666666");
        mDatas.add("6666666666");
        mDatas.add("6666666666");
        mDatas.add("6666666666");
        mDatas.add("6666666666");
        mAdapter.notifyDataSetChanged();

    }
}
