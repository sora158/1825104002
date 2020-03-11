package com.example.sora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    //public static final String EXTRA_MESSAGE = "com.example.Sora.MESSAGE";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)this.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
// 打开另一个activity，通过意图，意图作用是激活其他组件
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Linear.class);
                startActivity(intent);
            }
        });

        Button button1 = (Button)this.findViewById(R.id.button7);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
// 打开另一个activity，通过意图，意图作用是激活其他组件
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Relative.class);
                startActivity(intent);
            }
        });

        Button button2 = (Button)this.findViewById(R.id.button8);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
// 打开另一个activity，通过意图，意图作用是激活其他组件
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Frame.class);
                startActivity(intent);
            }
        });
        Button button3 = (Button)this.findViewById(R.id.button9);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
// 打开另一个activity，通过意图，意图作用是激活其他组件
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Table.class);
                startActivity(intent);
            }
        });
        Button button4 = (Button)this.findViewById(R.id.button10);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
// 打开另一个activity，通过意图，意图作用是激活其他组件
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Grid.class);
                startActivity(intent);
            }
        });
    }


}
