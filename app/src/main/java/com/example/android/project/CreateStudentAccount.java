package com.example.android.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreateStudentAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_student_account);

               Button yoursButton = (Button) findViewById(R.id.button28);

        yoursButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(CreateStudentAccount.this, TeacherHome.class));
            }
        });


        Button yoursdButton = (Button) findViewById(R.id.button27);

        yoursdButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(CreateStudentAccount.this, TeacherHome.class));
            }
        });



    }
}
