package com.example.four_button;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;                                  //2021041022 박범준
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button go_nate, call_911, open_gallery,end;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        go_nate=(Button)findViewById(R.id.go_nate);
        go_nate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nate.com"));
                startActivity(myIntent);
            }
        });

        call_911=(Button)findViewById(R.id.call_911);
        call_911.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("tel:911"));
                startActivity(myIntent);
            }
        });

        open_gallery=(Button)findViewById(R.id.open_gallery);
        open_gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("content://media/internal/images/media"));
                startActivity(myIntent);
            }
        });

        end=(Button)findViewById(R.id.end);
        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}