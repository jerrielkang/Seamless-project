package com.example.android.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubAlgeMaths extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_alge_maths);






        button = (Button) findViewById(R.id.buttonNext);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SubAlgeMaths.this, SubAlgeMath2.class);
                startActivity(intent);

            }
        });


        button = (Button) findViewById(R.id.btn_Back);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SubAlgeMaths.this, Difficulty.class);
                startActivity(intent);

            }
        });




    };





    }


