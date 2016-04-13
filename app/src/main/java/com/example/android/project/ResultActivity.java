package com.example.android.project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class ResultActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Button yousrButton = (Button) findViewById(R.id.button11);

        yousrButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(ResultActivity.this, Feedback.class));
            }
        });

        Button yourButton = (Button) findViewById(R.id.button5);

        yourButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(ResultActivity.this, ExplanationSubAlge.class));
            }
        });
        TextView textResult = (TextView) findViewById(R.id.textResult);
        Bundle b = getIntent().getExtras();
        int score = b.getInt("score");
        textResult.setText("Your score is " + " " + score + "/10. Thank you for playing the quiz!");
        if (score == 10) {

        }
    }
    public void playagain(View o) {
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
    }







}