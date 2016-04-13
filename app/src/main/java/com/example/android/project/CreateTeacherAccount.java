package com.example.android.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreateTeacherAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_teacher_account);

        Button yoursButton = (Button) findViewById(R.id.btn_back12);

        yoursButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(CreateTeacherAccount.this, TeacherHome.class));
            }
        });


        Button yoursdButton = (Button) findViewById(R.id.button271);

        yoursdButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(CreateTeacherAccount.this, TeacherHome.class));
            }
        });


    }
}
