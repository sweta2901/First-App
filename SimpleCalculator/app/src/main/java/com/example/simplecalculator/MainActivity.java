package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button B1,B2,B3,B4;
    EditText N1,N2,N3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B1=(Button) findViewById(R.id.b1);
        B2=(Button) findViewById(R.id.b2);
        B3=(Button) findViewById(R.id.b3);
        B4=(Button) findViewById(R.id.b4);
        N1=(EditText) findViewById(R.id.n1);
        N2=(EditText) findViewById(R.id.n2);
        N3=(EditText) findViewById(R.id.n3);

        B1.setOnClickListener((View.OnClickListener) this);
        B2.setOnClickListener((View.OnClickListener) this);
        B3.setOnClickListener((View.OnClickListener) this);
        B4.setOnClickListener((View.OnClickListener) this);
    }
    @Override
    public void onClick(View view) {
        String s1 = N1.getText().toString();
        String s2 = N2.getText().toString();
        if(view == B1){
            int r1 = Integer.parseInt(s1)+Integer.parseInt(s2);
            N3.setText(Integer.toString(r1));
        }
        else if(view == B2){
            int r2 = Integer.parseInt(s1)-Integer.parseInt(s2);
            N3.setText(Integer.toString(r2));
        }
        else if(view == B3){
            int r3 = Integer.parseInt(s1)*Integer.parseInt(s2);
            N3.setText(Integer.toString(r3));
        }
        else{
            float r4 = Float.parseFloat(s1)/Float.parseFloat(s2);
            N3.setText(Float.toString(r4));
        }

    }
}