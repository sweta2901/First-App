package com.example.exp2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button Button1;
    Button Button2;
    Button Button3;
    TextView text1;
    int count=10;
    int flag=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button1 = (Button) findViewById(R.id.b1);
        Button2 = (Button) findViewById(R.id.b2);
        Button3 = (Button) findViewById(R.id.b3);
        text1 = (TextView) findViewById(R.id.text);

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count < 30) {
                    text1.setTextSize(count);
                    count = count + 5;
                } else {
                    text1.setTextSize(count);
                    count = 5;
                }
            }
        });
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==1) {
                    text1.setTextColor(Color.RED);
                    flag = flag + 1;
                }
                else if(flag==2) {
                    text1.setTextColor(Color.BLACK);
                    flag = flag + 1;
                }
                else {
                    text1.setTextColor(Color.BLUE);
                    flag = 1;
                }
            }
        });
        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==1) {
                    text1.setBackgroundColor(Color.RED);
                    flag = flag + 1;
                }
                else if(flag==2) {
                    text1.setBackgroundColor(Color.GREEN);
                    flag = flag + 1;
                }
                else {
                    text1.setBackgroundColor(Color.BLUE);
                    flag = 1;
                }
            }
        });

    }

}