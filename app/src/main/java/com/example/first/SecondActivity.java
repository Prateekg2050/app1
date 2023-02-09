package com.example.first;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ActionBar actionBar =  getSupportActionBar();
        actionBar.setTitle("Second activity");

        Intent intent = getIntent();

        String name = intent.getStringExtra("NAME");
        String email = intent.getStringExtra("EMAIL");
        String phone = intent.getStringExtra("PHONE");

        TextView nameResult = findViewById(R.id.textView2);
        TextView emailResult = findViewById(R.id.textView3);
        TextView phoneResult = findViewById(R.id.textView4);

        nameResult.setText(name);
        emailResult.setText(email);
        phoneResult.setText(phone);
    }
}