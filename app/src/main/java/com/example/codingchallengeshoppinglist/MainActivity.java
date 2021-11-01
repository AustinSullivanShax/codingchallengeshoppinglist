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
                textView1.setText(reply); // Change the text
            }
        }
    }
}