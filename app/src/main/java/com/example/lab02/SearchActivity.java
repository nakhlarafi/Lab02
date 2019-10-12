package com.example.lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;

public class SearchActivity extends AppCompatActivity {

    String uriString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Intent i = getIntent();
        uriString = i.getStringExtra("text_label");
        //System.out.println(uriString);
        TextView txtView = (TextView) findViewById(R.id.my_text);
        txtView.setText(uriString);

    }


    public void passLink(View view){

        Intent i = new Intent(this, WebActivity.class);
        i.putExtra("text_label", uriString);
        startActivity(i);
    }
}
