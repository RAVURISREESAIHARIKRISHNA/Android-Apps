package com.example.hari.buttoneventhandling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Date;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    public final static String TAG = "Hari";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button my_button = (Button) findViewById(R.id.my_button);

        my_button.setOnClickListener(
//                Interface
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Log.i(TAG,"Click Detected");
                        TextView my_text = (TextView) findViewById(R.id.my_text);
                        my_text.setText(new java.util.Date().toString());
                        Log.i(TAG , new java.util.Date().toString());
                    }
                }

        );

        my_button.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    @Override
                    public boolean onLongClick(View view) {
                        TextView my_text = (TextView) findViewById(R.id.my_text);
                        my_text.setText("Long Click! Welcome to Hari Secret Service");
                        Log.i(TAG , "Long Click Detected");
                        return true;
//                        This is going to say Android that:I will Handle this event...
//                        If not,Android will execcute this LongClick and as soon as we Lift the finger,onClick will
//                        be executed

//                    return false;
//
                    }
                }
        );
    }

}
