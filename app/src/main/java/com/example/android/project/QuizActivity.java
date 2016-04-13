package com.example.android.project;

import java.util.List;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
public class QuizActivity extends Activity {
    List<Question> quesList;
    int score=0;
    int hint = 0;
    int qid=0;
    Question currentQ;
    TextView txtQuestion, txtView;
    RadioButton rda, rdb, rdc;
    Button butNext, butHint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        DbHelper db=new DbHelper(this);
        quesList=db.getAllQuestions();
        currentQ=quesList.get(qid);
        txtQuestion=(TextView)findViewById(R.id.textView1);
        rda=(RadioButton)findViewById(R.id.radio0);
        rdb=(RadioButton)findViewById(R.id.radio1);
        rdc=(RadioButton)findViewById(R.id.radio2);
        butNext=(Button)findViewById(R.id.button1);
        butHint = (Button) findViewById(R.id.button7);
        txtView = (TextView)findViewById(R.id.textView39);

        setQuestionView();



        TextView msg = (TextView) findViewById(R.id.textView39) ;

           msg.setVisibility(View.INVISIBLE);

        butHint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setVisibility(View.VISIBLE);


                butHint.setVisibility(View.INVISIBLE);

                hint++;
                if(hint > 3) {
                    butHint.setEnabled(false);
                }
                Log.d("hint", String.valueOf(hint));
            }

        });



        butNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RadioGroup grp = (RadioGroup) findViewById(R.id.radioGroup1);
                RadioButton answer = (RadioButton) findViewById(grp.getCheckedRadioButtonId());
                Log.d("yourans", currentQ.getANSWER() + " " + answer.getText());

                if (currentQ.getANSWER().equals(answer.getText())) {
                    score++;
                    Log.d("score", "Your score" + score);
                }

                AlertDialog.Builder builder = new AlertDialog.Builder(QuizActivity.this);

                builder.setTitle("Confirm");
                builder.setMessage("Are you sure of ur answer which is " + answer.getText() + "?");

                builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        // Do nothing but close the dialog


                        TextView msg = (TextView) findViewById(R.id.textView39) ;

                        msg.setVisibility(View.INVISIBLE);
                        butHint.setVisibility(View.VISIBLE);
                        if(qid<10){
                            currentQ=quesList.get(qid);
                            setQuestionView();
                        }else{
                            Intent intent = new Intent(QuizActivity.this, ResultActivity.class);

                            Bundle b = new Bundle();
                            b.putInt("score", score); //Your score
                            intent.putExtras(b); //Put your score to your next Intent
                            startActivity(intent);

                            finish();

                        }
                        dialog.dismiss();
                    }

                });

                builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Do nothing
                        dialog.dismiss();
                    }
                });

                AlertDialog alert = builder.create();
                alert.show();


            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_quiz, menu);
        return true;
    }
    private void setQuestionView()
    {
        txtQuestion.setText(currentQ.getQUESTION());
        rda.setText(currentQ.getOPTA());
        rdb.setText(currentQ.getOPTB());
        rdc.setText(currentQ.getOPTC());
        txtView.setText(currentQ.getHINT());

        qid++;
    }


}
