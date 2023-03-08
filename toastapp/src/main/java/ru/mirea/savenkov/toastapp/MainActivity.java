package ru.mirea.savenkov.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editTextLength);
        //button.setOnClickListener();
    }
    public void btnOnClick(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "студент №22, группа бсбо-05-21, символов = " + editText.getText().toString().length(), //«СТУДЕНТ No Х ГРУППА Х Количество символов - Х».
                Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setMargin(20,20);
        toast.show();
    }
}