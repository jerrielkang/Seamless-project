package com.example.android.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TeacherParticular extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_particular);

        Button yoursButton = (Button) findViewById(R.id.button23);

        yoursButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(TeacherParticular.this, TeacherUpdateParticulars.class));
            }
        });


        Button yourdsButton = (Button) findViewById(R.id.button16);

        yourdsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(TeacherParticular.this, TeacherHome.class));
            }
        });



    }
}
