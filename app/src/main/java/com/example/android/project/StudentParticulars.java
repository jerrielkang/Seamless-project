package com.example.android.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import javax.security.auth.Subject;

public class StudentParticulars extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_particulars);



        Button yourssButton = (Button) findViewById(R.id.button20);

        yourssButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(StudentParticulars.this, StudentUpdateParticulars.class));
            }
        });


        Button yoursButton = (Button) findViewById(R.id.button16);

        yoursButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(StudentParticulars.this, StudentHome.class));
            }
        });


    }
}
