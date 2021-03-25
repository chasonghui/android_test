package com.example.android_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        just();
        capture();
    }
    void just()
    {
        Log.v("Check","여기들어오나 ?");
        System.out.println("그냥 만들어본 함수..");
        System.out.println("터미널에서 git 사용 되던가");
    }
    void capture()
    {
        //캡쳐 기능을 이렇게 뚝딱만들수 있다면 을매나 좋을꼬
        System.out.println("캡쳐기능을 만들었다. 나는 유능한 팀원1.");
    }
}