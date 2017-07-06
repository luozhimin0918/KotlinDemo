package com.kotlindemo;

import android.util.Log;

/**
 * Created by Administrator on 2017/7/5.
 */

public class NewDemo  extends BaseNewDemo implements NewInterface{
    @Override
    public void show() {
        Log.d("NewDemo","show");
    }

    @Override
    public void TO() {
            Log.d("NewDemo","TO");
    }
}
