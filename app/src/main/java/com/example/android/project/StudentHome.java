package com.example.android.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import javax.security.auth.Subject;

public class StudentHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_home);



        Button yoursButton = (Button) findViewById(R.id.button32);

        yoursButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(StudentHome.this, StudentParticulars.class));
            }
        });

        Button yours = (Button) findViewById(R.id.btnLesson);

        yours.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(StudentHome.this, Subjects.class));
            }
        });


        Button yourssdButton = (Button) findViewById(R.id.button34);

        yourssdButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(StudentHome.this, StudentViewGrades.class));
            }
        });

        Button yourssdsButton = (Button) findViewById(R.id.button31);

        yourssdsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(StudentHome.this, Home.class));
            }
        });









    }
}
