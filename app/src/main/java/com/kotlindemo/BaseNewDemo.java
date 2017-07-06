package com.kotlindemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by Administrator on 2017/7/5.
 */

abstract class BaseNewDemo extends Activity {
    public abstract void show();//public abstract 可以省略

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("BaseNewDemo","onCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BaseNewDemo","onResume");
    }

}
