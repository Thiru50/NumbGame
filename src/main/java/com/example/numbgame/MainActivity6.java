package com.example.numbgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity6 extends AppCompatActivity {
    public static final String ExtraNumberS="com.example.numgame";
    public void yessixteen(View view){
        Intent intent=getIntent();
        int num=intent.getIntExtra(MainActivity5.ExtraNumberE,0);
        num=num+16;
        Intent intent1=new Intent(this,MainActivity7.class);
        intent1.putExtra(ExtraNumberS,num);
        startActivity(intent1);
    }
    public void nosixteen(View view){
        Intent intent=getIntent();
        int num=intent.getIntExtra(MainActivity5.ExtraNumberE,0);
        num=num+0;
        Intent intent1=new Intent(this,MainActivity7.class);
        intent1.putExtra(ExtraNumberS,num);
        startActivity(intent1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }
}