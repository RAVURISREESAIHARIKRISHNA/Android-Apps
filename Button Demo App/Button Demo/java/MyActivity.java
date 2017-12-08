package com.example.hari.buttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_layout);

        Toast.makeText(this,"Can you see me ?" , Toast.LENGTH_SHORT).show();
        Log.i("info","Done creating the app");
    }

    public void leftClick(View v){
        Toast.makeText(this , "You Clicked ME !! ",Toast.LENGTH_SHORT).show();
        Log.i("info","Pressed");
    }

    public void rightClick(View v){
        Toast.makeText(this,"Right Click" , Toast.LENGTH_SHORT).show();
        Log.i("info","Bottom Clicked");
    }
}
