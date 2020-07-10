package com.example.numbgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity7 extends AppCompatActivity {
    public void restart(View view){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void exit(View view){
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        Intent intent=getIntent();
        int num=intent.getIntExtra(MainActivity6.ExtraNumberS,0);
        TextView tv=(TextView) findViewById(R.id.res);
        tv.setText(""+num);
    }
}