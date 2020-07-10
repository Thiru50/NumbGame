package com.example.numbgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {
    public static final String ExtraNumberT="com.example.numgame";
    public void yestwo(View view){
        Intent intent=getIntent();
        int num=intent.getIntExtra(MainActivity2.ExtraNumberO,0);
        num=num+2;
        Intent intent1=new Intent(this,MainActivity4.class);
        intent1.putExtra(ExtraNumberT,num);
        startActivity(intent1);
    }
    public void notwo(View view){
        Intent intent=getIntent();
        int num=intent.getIntExtra(MainActivity2.ExtraNumberO,0);
        num=num+0;
        Intent intent1=new Intent(this,MainActivity4.class);
        intent1.putExtra(ExtraNumberT,num);
        startActivity(intent1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
}