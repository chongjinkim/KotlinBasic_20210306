package com.nepplus.kotlinbasic_20210306

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        testBtn1.setOnClickListener {

//            Ctrl + // 코드에 메모를 남기는 단축키

//            이 중괄호 안에 적는 코드가, testBtn1이 눌렀을 때 실행해줄 일

           Log.d("태그종류","테스트1 버튼 눌림")


        }
    }
}