package ru.mirea.savenkov.dialog;

import android.app.DatePickerDialog;
import android.content.Context;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.time.Month;

public class MyDateDialogFragment extends DatePickerDialog {
    private TextView dateText;
    public MyDateDialogFragment(@NonNull Context context, TextView dateText) {
        super(context);
        this.dateText = dateText;
    }

    @Override
    public void onDateChanged(@NonNull DatePicker view, int year, int month, int dayOfMonth) {
        super.onDateChanged(view, year, month, dayOfMonth);
        dateText.setText("Год: " + year + ", месяц " + Month.of(month + 1) + ", день " + dayOfMonth + ".");
    }
}
