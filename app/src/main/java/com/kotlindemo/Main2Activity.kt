package com.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        uni()
    }

    fun sum(dd:Int,jj:Int): Int{
        var a=4
        var b :Int
        b=9
        val max = if (a > b){
            print("Choose a")
        }
        else{
            print("Choose b")
        }

        var  x=1
        when (x) {
            1 -> print("x == 1")
            2 -> print("x == 2")
            else -> { // 注意这个语句块
                print("x is neither 1 nor 2")
            }
        }
      return  dd+jj
    }

    fun uni():Unit{
        val items = listOf("apple", "banana", "kiwi")
        for (item in items) {
            println(item)
        }
    }

}
