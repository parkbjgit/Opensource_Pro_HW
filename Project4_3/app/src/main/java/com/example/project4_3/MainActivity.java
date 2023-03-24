package com.example.project4_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    Button btnadd,btnsub,btnmul,btndiv,btnemp;
    TextView textresult;
    String num1,num2;
    Double result;


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
        btnemp=(Button) findViewById(R.id.BtnEmp) ;

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if ((edit1.getText().toString().length() == 0 || edit2.getText().toString().length() == 0)) {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                    textresult.setText("오류");
                } else {
                    result = Double.parseDouble(num1) + Double.parseDouble(num2);
                    textresult.setText("계산결과: " + result.toString());
                }
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if ((edit1.getText().toString().length() == 0 || edit2.getText().toString().length() == 0)) {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                    textresult.setText("오류");
                } else {
                    result = Double.parseDouble(num1) - Double.parseDouble(num2);
                    textresult.setText("계산결과: " + result.toString());
                }
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if ((edit1.getText().toString().length() == 0 || edit2.getText().toString().length() == 0)) {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                    textresult.setText("오류");
                } else {
                    result = Double.parseDouble(num1) * Double.parseDouble(num2);
                    textresult.setText("계산결과: " + result.toString());
                }
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if ((edit1.getText().toString().length() == 0 || edit2.getText().toString().length() == 0)) {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                    textresult.setText("오류");
                } else {
                    result = Double.parseDouble(num1) / Double.parseDouble(num2);
                    textresult.setText("계산결과: " + result.toString());
                }
            }
        });

        btnemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if ((edit1.getText().toString().length() == 0 || edit2.getText().toString().length() == 0)) {
                    Toast.makeText(getApplicationContext(), "값 입력하세요", Toast.LENGTH_SHORT).show();
                    textresult.setText("오류");
                } else {
                    result = Double.parseDouble(num1) % Double.parseDouble(num2);
                    textresult.setText("계산결과: " + result.toString());
                }
            }
        });




    }
}