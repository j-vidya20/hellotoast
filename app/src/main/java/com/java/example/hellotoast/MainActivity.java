package com.java.example.hellotoast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=findViewById(R.id.tv);
        if(savedInstanceState!=null && savedInstanceState.containsKey("anyKey")){

            count=savedInstanceState.getInt("anyKey");

            txt.setText(String.valueOf(count));
        }

    }


    public void showbtn(View view) {

        Toast.makeText(this , "This is my project", Toast.LENGTH_SHORT).show();

    }

    public void showbtn1(View view) {
        count++;
        if(txt.equals("9"))
        {

            Toast.makeText(this, "count exceeded", Toast.LENGTH_SHORT).show();

        }


        //txt.setText(String.valueOf(count));


    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("anyKey",count);
    }
}