package com.example.android.quizzproject;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.text.Editable;


import com.example.android.quizzproject.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the submitQuiz button is clicked.
     */

    int score = 0;
    int checkanswered = 0;

    public void submitQuiz(View view) {
        int score = 0;
        int checkanswered = 0;


        RadioButton question1ans1 = (RadioButton) findViewById(R.id.answer1);
        boolean ifchecked1 = question1ans1.isChecked();

        RadioButton question1ans2 = (RadioButton) findViewById(R.id.answer2);
        boolean ifchecked2 = question1ans2.isChecked();


        RadioButton question1ans3 = (RadioButton) findViewById(R.id.answer3);
        boolean ifchecked3 = question1ans3.isChecked();
        if (ifchecked1) {
            score += 1;
        }
        if (ifchecked1 || ifchecked2 || ifchecked3) {
            checkanswered += 1;
        }


        CheckBox Checkbox1 = (CheckBox) findViewById(R.id.check1);
        boolean Check1 = Checkbox1.isChecked();

        CheckBox Checkbox2 = (CheckBox) findViewById(R.id.check2);
        boolean Check2 = Checkbox2.isChecked();
        if (Check1 && Check2) {
            score += 1;

        }
        if (Check1 || Check2) {
            checkanswered += 1;
        } else {
            checkanswered += 0;
        }


        EditText question3 = (EditText) findViewById(R.id.question3);
        String question3ans = question3.getText().toString();
        if (question3ans.equals("Miller")) {
            score += 1;
        }
        if (question3ans.equals("")) {
            checkanswered += 0;
        } else {
            checkanswered += 1;
        }


        if (checkanswered >= 3) {
            Toast.makeText(this, "You need to answer every question. Please check your answers.", Toast.LENGTH_SHORT).show();
            return; }


        String final;
        final = Integer.toString(score);

        Toast.makeText(this, "Your score is" + final, Toast.LENGTH_SHORT).show();

        }
    }
}