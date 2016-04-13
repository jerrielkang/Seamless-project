package com.example.android.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Difficulty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty);

        String[] chapters = {"Subtraction of algrbra", "Addition of algebra", "Multiplcation of algrbra"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, chapters);
        ListView tryList = (ListView) findViewById(R.id.list_view);
        tryList.setAdapter(adapter);

        tryList.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch (position) {
                            case 0:
                                Intent nextactivity = new Intent(Difficulty.this, SubAlgeMaths.class);
                                startActivity(nextactivity);
                        }
                    }
                });


                Button yourButton = (Button) findViewById(R.id.btn_Back1);
                yourButton.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Difficulty.this, Subjects.class));
                    }
                });


    }
}
