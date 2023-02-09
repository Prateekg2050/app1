package com.example.first;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Activity1");

        final EditText name = findViewById(R.id.editTextTextPersonName);
        final EditText email = findViewById(R.id.editTextTextEmailAddress);
        final EditText phone = findViewById(R.id.editTextPhone);
        Button saveBtn = findViewById(R.id.button);
        Button callBtn = findViewById(R.id.button3);


        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone1 = phone.getText().toString();

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",phone1,null));
                startActivity(intent);
            }
        });

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name1 = name.getText().toString();
                String email1 = email.getText().toString();
                String phone1 = phone.getText().toString();

                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("NAME",name1);
                intent.putExtra("EMAIL",email1);
                intent.putExtra("PHONE",phone1);

                startActivity(intent);

            }
        });

    }
}