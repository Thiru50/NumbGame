package com.example.numbgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {
    public static final String ExtraNumberF="com.example.numgame";
    public void yesfour(View view){
        Intent intent=getIntent();
        int num=intent.getIntExtra(MainActivity3.ExtraNumberT,0);
        num=num+4;
        Intent intent1=new Intent(this,MainActivity5.class);
        intent1.putExtra(ExtraNumberF,num);
        startActivity(intent1);
    }
    public void nofour(View view){
        Intent intent=getIntent();
        int num=intent.getIntExtra(MainActivity3.ExtraNumberT,0);
        num=num+0;
        Intent intent1=new Intent(this,MainActivity5.class);
        intent1.putExtra(ExtraNumberF,num);
        startActivity(intent1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
}