package com.example.android.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubAlgeMath4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_alge_math4);

        Button yourButton = (Button) findViewById(R.id.buttomMEXT);
        yourButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SubAlgeMath4.this, congrats.class));
            }

        });

        Button yoursButton = (Button) findViewById(R.id.button3);
        yoursButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SubAlgeMath4.this, SubAlgeMath3.class));
            }

        });



    }
}
