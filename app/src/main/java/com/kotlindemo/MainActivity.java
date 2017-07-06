package com.kotlindemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends BaseNewDemo {

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
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity","onResume");
    }
}
