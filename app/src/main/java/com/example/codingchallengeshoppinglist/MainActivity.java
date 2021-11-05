package com.example.codingchallengeshoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/*
Name: Austin Sullivan
Notes:
-It makes a list but I not figured out how to make the buttons fill in the other
TextViews besides the first one.
-The 'Banana' and 'Carrot' button work and will display on the list but can't get the
the button text to show up on the other TextViews.
 */

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE = "com.example.android.codingchallengeshoppinglist.extra.MESSAGE";
    public static final int TEXT_REQUEST = 1;
    private TextView itemTxtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        itemTxtView = findViewById(R.id.textView);
    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                String reply = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                TextView textView1 = findViewById(R.id.textView);
                TextView textView2 = findViewById(R.id.textView2);
                TextView textView3 = findViewById(R.id.textView3);
                TextView textView4 = findViewById(R.id.textView4);
                TextView textView5 = findViewById(R.id.textView5);
                TextView textView6 = findViewById(R.id.textView6);
                TextView textView7 = findViewById(R.id.textView7);
                TextView textView8 = findViewById(R.id.textView8);
                TextView textView9 = findViewById(R.id.textView9);
                TextView textView10 = findViewById(R.id.textView10);

                if (textView1.getText().toString().equals(""))
                    textView1.setText(reply); // Change the text
                else if (textView2.getText().toString().equals("") && !textView2.getText().toString().equals(textView1.getText().toString()))
                    textView2.setText(reply);
                else if (textView3.getText().toString().equals("") && !textView3.getText().toString().equals(textView2.getText().toString()))
                    textView3.setText(reply);
                else if (textView4.getText().toString().equals("") && !textView4.getText().toString().equals(textView3.getText().toString()))
                    textView4.setText(reply);
                else if (textView5.getText().toString().equals("") && !textView5.getText().toString().equals(textView4.getText().toString()))
                    textView5.setText(reply);
                else if (textView6.getText().toString().equals("") && !textView6.getText().toString().equals(textView5.getText().toString()))
                    textView6.setText(reply);
                else if (textView7.getText().toString().equals("") && !textView7.getText().toString().equals(textView6.getText().toString()))
                    textView7.setText(reply);
                else if (textView8.getText().toString().equals("") && !textView8.getText().toString().equals(textView7.getText().toString()))
                    textView8.setText(reply);
                else if (textView9.getText().toString().equals("") && !textView9.getText().toString().equals(textView8.getText().toString()))
                    textView9.setText(reply);
                else if (textView10.getText().toString().equals("") && !textView10.getText().toString().equals(textView9.getText().toString()))
                    textView10.setText(reply);
            }
        }
    }
}