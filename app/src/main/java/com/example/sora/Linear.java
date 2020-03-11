package com.example.sora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Linear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);

        Button btn_back= (Button)findViewById(R.id.btn_linear_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Linear.this, MainActivity.class);
                startActivity(intent);
            }
        });

        final Button btn_first = (Button)findViewById(R.id.btn_linear_first);
        btn_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout linear1 = findViewById(R.id.linear1);
                if(linear1.getOrientation() != LinearLayout.HORIZONTAL)
                {linear1.setOrientation(LinearLayout.HORIZONTAL);}
            }
        });

        Button btn_second = (Button)findViewById(R.id.btn_linear_second);
        btn_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout linear1 = findViewById(R.id.linear1);
                if(linear1.getOrientation() != LinearLayout.VERTICAL)
                {linear1.setOrientation(LinearLayout.VERTICAL);}
            }
        });

        Button btn_third = (Button)findViewById(R.id.btn_linear_third);
        btn_third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout linear1 = findViewById(R.id.linear1);
                linear1.setGravity(Gravity.LEFT);
            }
        });
    }
}