package com.example.quizjava;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class QuestionActivity extends AppCompatActivity {

    private int score = 0;
    CheckBox checkBox3, checkBox2, checkBox;
    EditText editText1, editText2, editText3;
    RadioButton radioButton;
    TextView scoreTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_question);

        scoreTextView = findViewById (R.id.score_text_view);
        checkBox3 = findViewById (R.id.checkBox3);
        checkBox2 = findViewById (R.id.checkBox2);
        checkBox = findViewById (R.id.checkBox);
        radioButton = findViewById (R.id.radioButton);
        editText1 = findViewById (R.id.editText1);
        editText2 = findViewById (R.id.editText2);
        editText3 = findViewById (R.id.editText3);


    }


    public void submit(View view) {

        if (radioButton.isChecked ()) {
            score += 1;
            displayScoreRadioBtn (score);
        } else {
            Toast.makeText (getApplicationContext (), "Question 1 is wrong!", Toast.LENGTH_LONG).show ();
        }

        String userAnswer1 = editText1.getText ().toString ();
        if (userAnswer1.equals ("0")) {
            score += 1;
            displayScoreEditText1 (score);
        } else {
            Toast.makeText (getApplicationContext (), "Question 2 is wrong!", Toast.LENGTH_LONG).show ();
        }


        if (checkBox.isChecked () && checkBox3.isChecked () && !checkBox2.isChecked ()) {
            score += 1;
            displayScoreCheckBox (score);
        } else {
            Toast.makeText (getApplicationContext (), "Question 3 is wrong!", Toast.LENGTH_LONG).show ();
        }

        String userAnswer2 = editText2.getText ().toString ();
        if (userAnswer2.equals ("*")) {
            score += 1;
            displayScoreEditText2 (score);
        } else {
            Toast.makeText (getApplicationContext (), "Question 4 is wrong!", Toast.LENGTH_LONG).show ();
        }

        String userAnswer3 = editText3.getText ().toString ();
        if (userAnswer3.equals ("if (x > y)")) {
            score += 1;
            displayScoreEditText3 (score);
        } else if (userAnswer3.equals ("if (x>y)")) {
            score += 1;
            displayScoreEditText3 (score);
        } else if (userAnswer3.equals ("if(x>y)")) {
            score += 1;
            displayScoreEditText3 (score);
        } else {
            Toast.makeText (getApplicationContext (), "Question 5 is wrong!", Toast.LENGTH_LONG).show ();

        }
        score = 0;

        if (scoreTextView.getText ().equals ("Score: " + 5)) {
            Toast.makeText (getApplicationContext (), "Congratulations! \nyou answered 5/5 \nGreat Job!!", Toast.LENGTH_LONG).show ();
        }
    }

    /**
     * Display Score
     */
    public void displayScoreRadioBtn(int score) {
        TextView scoreTextView = findViewById (R.id.score_text_view);
        scoreTextView.setText ("Score: " + score);
    }

    public void displayScoreEditText1(int score) {
        TextView scoreTextView = findViewById (R.id.score_text_view);
        scoreTextView.setText ("Score: " + score);
    }

    public void displayScoreCheckBox(int score) {
        TextView scoreTextView = findViewById (R.id.score_text_view);
        scoreTextView.setText ("Score: " + score);
    }

    public void displayScoreEditText2(int score) {
        TextView scoreTextView = findViewById (R.id.score_text_view);
        scoreTextView.setText ("Score: " + score);
    }

    public void displayScoreEditText3(int score) {
        TextView scoreTextView = findViewById (R.id.score_text_view);
        scoreTextView.setText ("Score: " + score);
    }


    /**
     * Reset Score
     */

    public void reset(View view) {

        radioButton.setChecked (false);
        editText1.getText ().clear ();
        checkBox.setChecked (false);
        checkBox2.setChecked (false);
        checkBox3.setChecked (false);
        editText2.getText ().clear ();
        editText3.getText ().clear ();

        score = 0;
        TextView scoreTextView = findViewById (R.id.score_text_view);
        scoreTextView.setText ("Score: " + score);


    }
}