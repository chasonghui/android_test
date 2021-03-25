package com.example.android_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    void just()
    {
        System.out.println("그냥 만들어본 함수..");
        System.out.println("터미널에서 git 사용 되던가");
    }
}