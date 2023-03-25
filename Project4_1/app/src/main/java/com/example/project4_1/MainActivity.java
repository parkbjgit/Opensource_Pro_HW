package com.example.project4_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    Button btnadd,btnsub,btnmul,btndiv;                         //2021041022 소프트웨어
    TextView textresult;                                        //박범준
    String num1,num2;
    Integer result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("초간단계산기");

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);

        btnadd = (Button) findViewById(R.id.BtnAdd);
        textresult = (TextView) findViewById(R.id.TextResult);

        btnsub = (Button) findViewById(R.id.BtnSub);
        btnmul = (Button) findViewById(R.id.BtnMul);
        btndiv = (Button) findViewById(R.id.BtnDiv);

        btnadd.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                result=Integer.parseInt(num1)+Integer.parseInt(num2);
                textresult.setText("계산결과: "+result.toString());
                return false;
            }
        });

        btnsub.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                result=Integer.parseInt(num1)-Integer.parseInt(num2);
                textresult.setText("계산결과: "+result.toString());
                return false;
            }
        });

        btnmul.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                result=Integer.parseInt(num1)*Integer.parseInt(num2);
                textresult.setText("계산결과: "+result.toString());
                return false;
            }
        });

        btndiv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                result=Integer.parseInt(num1)/Integer.parseInt(num2);
                textresult.setText("계산결과: "+result.toString());
                return false;
            }
        });


    }
}