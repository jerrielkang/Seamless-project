package com.example.android.project;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class Subjects extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);

        Button yoursButton = (Button) findViewById(R.id.button12);

        yoursButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Subjects.this, StudentHome.class));
            }
        });



        String[] subjects = {"Maths", "English", "Chinese", "Science"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, subjects);
        ListView tryList = (ListView) findViewById(R.id.list_view);
        tryList.setAdapter(adapter);


        tryList.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch(position) {
                            case 0:
                                Intent nextactivity = new Intent(Subjects.this, Difficulty.class);
                                startActivity(nextactivity);
                        }
                    }
                }
        );




    }
}
