package com.example.numbgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {
    public static final String ExtraNumberO="com.example.numgame";
    public void yesone(View view){
        Intent intent= new  Intent(this,MainActivity3.class);
        int number=1;
        intent.putExtra(ExtraNumberO,number);
        startActivity(intent);
    }
    public void noone(View view){
        Intent intent= new  Intent(this,MainActivity3.class);
        int number=0;
        intent.putExtra(ExtraNumberO,number);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}