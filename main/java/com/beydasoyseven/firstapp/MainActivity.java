package com.beydasoyseven.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ChangeImage(View view){
        ImageView imageView = findViewById(R.id.imageView2);
        imageView.setImageResource(R.drawable.air);
    }

}