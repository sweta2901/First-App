package com.example.graphicalprimitives;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        SampleCanvas s = new SampleCanvas(this);
        setContentView(s);
    }

    private class SampleCanvas extends View {

        public SampleCanvas(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            //super.onDraw(canvas);
            Paint x = new Paint();
            x.setColor(Color.BLACK);
            canvas.drawPaint(x);

            x.setColor(Color.WHITE);
            canvas.drawCircle(500, 500, 250, x);

            canvas.drawRect(1000,250,1200,750,x);

            canvas.drawRect(250,1000,750,1500,x);

            x.setStrokeWidth(5);
            canvas.drawLine(1100,1000,1100,1500,x);

        }
    }
}