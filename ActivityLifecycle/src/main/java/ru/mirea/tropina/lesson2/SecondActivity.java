package ru.mirea.tropina.lesson2;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        Bundle extras = getIntent().getExtras();
        if (extras != null){
            String value = extras.getString("key");
            Log.d(SecondActivity.class.getSimpleName(), value);
        }
        Log.d(SecondActivity.class.getSimpleName(),value);
    }
    @Override
    protected void onStart() {
        super.onStart();

    }
}