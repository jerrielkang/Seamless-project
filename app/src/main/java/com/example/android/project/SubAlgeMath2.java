package com.example.android.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubAlgeMath2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_alge_math2);

        Button yourButton = (Button) findViewById(R.id.btn_Next1);

        yourButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SubAlgeMath2.this, SubAlgeMath3.class));
            }
        });


        Button yoursButton = (Button) findViewById(R.id.buttonback11);

        yoursButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SubAlgeMath2.this, SubAlgeMaths.class));
            }
        });



    }
}
