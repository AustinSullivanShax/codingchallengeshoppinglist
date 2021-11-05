package com.example.codingchallengeshoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private static final String LOG_TAG = SecondActivity.class.getSimpleName();
    //public static final String EXTRA_MESSAGE = "com.example.android.twoactivities.extra.MESSAGE";
    public static final int TEXT_REQUEST = 1;
    //private EditText mMessageEditText;
    public static final String EXTRA_REPLY = "com.example.android.codingchallengeshoppinglist.extra.REPLY";
    public Button button1;
    public Button button2;
    public Button button3;
    public Button button4;
    public Button button5;
    public Button button6;
    public Button button7;
    public Button button8;
    public Button button9;
    public Button button10;
    private TextView itemTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        itemTextView = findViewById(R.id.textView);

        button1 = findViewById(R.id.itemButton1);
        button2 = findViewById(R.id.itemButton2);
        button3 = findViewById(R.id.itemButton3);
        button4 = findViewById(R.id.itemButton4);
        button5 = findViewById(R.id.itemButton5);
        button6 = findViewById(R.id.itemButton6);
        button7 = findViewById(R.id.itemButton7);
        button8 = findViewById(R.id.itemButton8);
        button9 = findViewById(R.id.itemButton9);
        button10 = findViewById(R.id.itemButton10);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                String reply = button1.getText().toString(); //Get button text
                Intent replyIntent = new Intent();
                replyIntent.putExtra(EXTRA_REPLY, reply);
                setResult(RESULT_OK,replyIntent);
                finish();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String reply = button2.getText().toString(); //Get button text
                Intent replyIntent = new Intent();
                replyIntent.putExtra(EXTRA_REPLY, reply);
                setResult(RESULT_OK,replyIntent);
                finish();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                String reply = button3.getText().toString(); //Get button text
                Intent replyIntent = new Intent();
                replyIntent.putExtra(EXTRA_REPLY, reply);
                setResult(RESULT_OK,replyIntent);
                finish();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                String reply = button4.getText().toString(); //Get button text
                Intent replyIntent = new Intent();
                replyIntent.putExtra(EXTRA_REPLY, reply);
                setResult(RESULT_OK,replyIntent);
                finish();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                String reply = button5.getText().toString(); //Get button text
                Intent replyIntent = new Intent();
                replyIntent.putExtra(EXTRA_REPLY, reply);
                setResult(RESULT_OK,replyIntent);
                finish();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                String reply = button6.getText().toString(); //Get button text
                Intent replyIntent = new Intent();
                replyIntent.putExtra(EXTRA_REPLY, reply);
                setResult(RESULT_OK,replyIntent);
                finish();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                String reply = button7.getText().toString(); //Get button text
                Intent replyIntent = new Intent();
                replyIntent.putExtra(EXTRA_REPLY, reply);
                setResult(RESULT_OK,replyIntent);
                finish();
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                String reply = button8.getText().toString(); //Get button text
                Intent replyIntent = new Intent();
                replyIntent.putExtra(EXTRA_REPLY, reply);
                setResult(RESULT_OK,replyIntent);
                finish();
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                String reply = button9.getText().toString(); //Get button text
                Intent replyIntent = new Intent();
                replyIntent.putExtra(EXTRA_REPLY, reply);
                setResult(RESULT_OK,replyIntent);
                finish();
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                String reply = button10.getText().toString(); //Get button text
                Intent replyIntent = new Intent();
                replyIntent.putExtra(EXTRA_REPLY, reply);
                setResult(RESULT_OK,replyIntent);
                finish();
            }
        });

    }
}