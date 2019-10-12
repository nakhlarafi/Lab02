package com.example.lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void passText(View view){
        EditText et = (EditText) findViewById(R.id.text);
        String theText = et.getText().toString();

        Intent i = new Intent(this, SearchActivity.class);
        i.putExtra("text_label", theText);
        startActivity(i);
    }
}
