package com.example.aradg.exercise1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    TextView txt1;
    Random rnd=new Random();
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.cfn);
        btn2=(Button)findViewById(R.id.ctn);
        txt1=(TextView)findViewById(R.id.nnf);
    }

    public void onclick1(View view) {
        i=rnd.nextInt(100);
        txt1.setText("Number: "+i);
    }
    public void onclick2(View view){
        i=0;
        txt1.setText("Number not found");
    }
}
