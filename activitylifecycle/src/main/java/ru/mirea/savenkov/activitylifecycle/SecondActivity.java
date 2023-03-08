package ru.mirea.savenkov.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = findViewById(R.id.textView);
        String text = (String) getIntent().getSerializableExtra("textValue");
        textView.setText(text);
    }
    //String text = (String) getIntent().getSerializableExtra("key");
}