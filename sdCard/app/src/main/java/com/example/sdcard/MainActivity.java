package com.example.sdcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {
    Button btWrite, btRead;
    EditText etFileName, etStudentName, etCGPA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btWrite = (Button) findViewById(R.id.button);
        btRead = (Button) findViewById(R.id.button2);
        etFileName = (EditText) findViewById(R.id.editTextTextPersonName);
        etStudentName = (EditText) findViewById(R.id.editTextTextPersonName2);
        etCGPA = (EditText) findViewById(R.id.editTextTextPersonName3);
        btWrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                writeData();
            }
        });
        btRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                readData();
            }
        });
    }
    public void writeData() {
        String data = "";
        String fileName = etFileName.getText().toString();
        try {
            FileOutputStream fos = openFileOutput(fileName, MODE_PRIVATE);
            data = etStudentName.getText().toString() + "," + etCGPA.getText().toString();
            fos.write(data.getBytes());
            fos.close();
        } catch (Exception e) {

        }
    }

    public void readData() {
        int c;
        String temp = "";
        String fileName = etFileName.getText().toString();
        try {
            FileInputStream fis = openFileInput(fileName);
            while ((c = fis.read()) != -1) {
                temp = temp + Character.toString((char) c);
            }
            fis.close();
            String arr[];
            arr = temp.split(",");
            etStudentName.setText(arr[0]);
            etCGPA.setText(arr[1]);
        } catch(Exception e) {
        }
    }
}