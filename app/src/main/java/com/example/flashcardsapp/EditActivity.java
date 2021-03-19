package com.example.flashcardsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class EditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        //Declare variables for component objects
        ImageView cancelBtn = findViewById(R.id.cancelBtn);
        ImageView saveBtn = findViewById(R.id.saveBtn);

        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ((EditText) findViewById(R.id.editQuestionField)).getText().toString();
                ((EditText) findViewById(R.id.editAnswerField)).getText().toString();

                TextView question = findViewById(R.id.editQuestionField);
                TextView answer = findViewById(R.id.editAnswerField);

                String questionString = question.getText().toString();
                String answerString = answer.getText().toString();

                Intent data = new Intent();
                data.putExtra("string1", questionString); // Puts intent in the first string
                data.putExtra("string2", answerString);
                setResult(RESULT_OK, data); // bundle data
                finish();
            }
        });
    }
}