package com.example.numbgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity5 extends AppCompatActivity {
    public static final String ExtraNumberE="com.example.numgame";
    public void yeseight(View view){
        Intent intent=getIntent();
        int num=intent.getIntExtra(MainActivity4.ExtraNumberF,0);
        num=num+8;
        Intent intent1=new Intent(this,MainActivity6.class);
        intent1.putExtra(ExtraNumberE,num);
        startActivity(intent1);
    }
    public void noeight(View view){
        Intent intent=getIntent();
        int num=intent.getIntExtra(MainActivity4.ExtraNumberF,0);
        num=num+0;
        Intent intent1=new Intent(this,MainActivity6.class);
        intent1.putExtra(ExtraNumberE,num);
        startActivity(intent1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
}