package com.kim9212.ex90hellookotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //override가 꼭쓰여져야하고 코틀린은 변수명이 앞에있고 참조변수가 뒤에있다
        //xml은 그대로쓰면된다


    }

    fun Clickbtn(view: View) {
        //xml에서 뷰에서 지정한 id를 변수명으로사용
        //주의 kotlinx.android.synthetic.main.activity_main.*가 되어있어야함


        tv.setText("nice to meet you")

    }

    //오버라이드는 키워드가있어야함
    override fun onResume() {
                super.onResume()
    Toast.makeText(this,"onresum",Toast.LENGTH_LONG).show();
    }


}