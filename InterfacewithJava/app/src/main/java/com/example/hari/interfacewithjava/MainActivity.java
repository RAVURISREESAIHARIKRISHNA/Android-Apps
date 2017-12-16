package com.example.hari.interfacewithjava;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.EditText;
import android.content.res.Resources;
import android.util.TypedValue;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        RelativeLayout myLayout = new RelativeLayout(this);
        myLayout.setBackgroundColor(Color.YELLOW);

        RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT ,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

//        addRule(int Verb);    OR
//        addRule(int Verb , int subject );

        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        Button redButton = new Button(this);
        redButton.setText("Click Me :) ");
        redButton.setBackgroundColor(Color.RED);
        redButton.setTextColor(Color.WHITE);
        redButton.setId(1);


//        Creating EditText
        EditText userInputText = new EditText(this);

//        Like buttonDetails...We have to create LaoutParameters for this
        RelativeLayout.LayoutParams userInputTextDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

//        I want this Text Field to be on the top of the redButton.SO...
        userInputTextDetails.addRule(RelativeLayout.ABOVE , redButton.getId());
        userInputTextDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
//        But this would come direct top of the button.So...
        userInputTextDetails.setMargins(0,0,0,50);

//      For setting Width of the EditText
        Resources r = getResources();
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP , 200 , r.getDisplayMetrics());
        userInputText.setWidth(px);

//        Add Widget(Button) to Layout
        myLayout.addView(redButton , buttonDetails);
//        Add Widget(userInputText) to Layout
        myLayout.addView(userInputText,userInputTextDetails);

        setContentView(myLayout);
    }
}
