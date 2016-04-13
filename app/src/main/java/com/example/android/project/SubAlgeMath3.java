package com.example.android.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubAlgeMath3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_alge_math3);

        Button yourButton = (Button) findViewById(R.id.button1);

        yourButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SubAlgeMath3.this, SubAlgeMath4.class));
            }
        });


        Button yoursButton = (Button) findViewById(R.id.buttonback12);

        yoursButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SubAlgeMath3.this, SubAlgeMath2.class));
            }
        });


    }
}
