package com.example.sora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class Frame extends AppCompatActivity {
    private  int current = 0;
    final int[] names = new int[]{
            R.id.imageView,
            R.id.imageView2,
            R.id.imageView3,
            R.id.imageView4,
            R.id.imageView5
    };

    ImageView[] views = new ImageView[names.length];

    Handler handler = new Handler(){
        @Override
        //注意霓虹灯是同时闪的
        public void handleMessage(Message msg) {
            if (msg.what == 0x666) {
                //for (int i = 0;i<names.length;i++) {
                /*        views[(current)%names.length].setVisibility(View.VISIBLE);
                        views[(1+current)%names.length].setVisibility(View.INVISIBLE);
                        views[(2+current)%names.length].setVisibility(View.INVISIBLE);
                        views[(3+current)%names.length].setVisibility(View.INVISIBLE);
                        views[(4+current)%names.length].setVisibility(View.INVISIBLE);
                  //  }*/

                views[(current + 1)%names.length].setVisibility(View.VISIBLE);
                views[(current )%names.length].setVisibility(View.INVISIBLE);
            }
                current++;
            super.handleMessage(msg);
        }
    };
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        for (int i = 0;i<names.length;i++){
            views[i] = (ImageView) findViewById(names[i]);
        }

        //线程
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(0x666);
            }
        },1000,1000);

        Button br =(Button)findViewById(R.id.buttonFR);
        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Frame.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
