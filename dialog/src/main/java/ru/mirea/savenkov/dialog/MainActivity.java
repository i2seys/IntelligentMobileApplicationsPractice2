package ru.mirea.savenkov.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    public TextView timeView;
    public TextView dateView;
    private final String TAG = MainActivity.class.getSimpleName().toString();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timeView = findViewById(R.id.timeView);
        dateView = findViewById(R.id.dateView);
    }

    public void onClickShowDialog(View view) {
        AlertDialogFragment dialogFragment = new AlertDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "mirea");
    }
    public void onOkClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Иду дальше\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Нет\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"На паузе\"!",
                Toast.LENGTH_LONG).show();
    }

    public void onClickSnackbar(View view) {
        Snackbar snackbar = Snackbar.make(view, "Длинная строка, которая не уместилась бы в Toast. " +
                        "А я думал...", Snackbar.LENGTH_LONG);
        snackbar.setAction("Что?", new View.OnClickListener (){
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "...как сделать так, чтобы она вместилась...",Toast.LENGTH_LONG);
                toast.show();
            }
        });
        snackbar.show();
    }

    public void onClickSetTime(View view) {
        MyTimeDialogFragment timePickerDialog = new MyTimeDialogFragment(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int i, int i1) {
                Toast t = new Toast(getApplicationContext());
                t.setText("Время: " + i + " часов " + i1 + " минут.");
                t.show();
            }
        }, 0, 0, true, timeView);
        timePickerDialog.show();
    }

    public void onClickSetDate(View view) {
        MyDateDialogFragment myDateDialogFragment = new MyDateDialogFragment(this, dateView);
        myDateDialogFragment.show();
    }

    public void onClickProgress(View view) {
        MyProgressDialogFragment myProgressDialogFragment = new MyProgressDialogFragment(this);
        myProgressDialogFragment.show();
    }
}