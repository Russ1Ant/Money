package com.exam.money;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Button bt = new Button();
       // bt.setOnClickListener(e->new Intent(String.valueOf(R.layout.activity_second)));
    }

    public void moveToNewIntent(View view) {
        Intent intent = new Intent(MainActivity.this, ConverterActivity.class);
        startActivity(intent);
    }
}
