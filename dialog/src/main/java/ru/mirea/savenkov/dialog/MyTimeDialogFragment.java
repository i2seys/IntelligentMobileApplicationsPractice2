package ru.mirea.savenkov.dialog;

import android.app.AlertDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.annotation.NonNull;

public class MyTimeDialogFragment extends TimePickerDialog {
    private final String TAG  = TimePickerDialog.class.getSimpleName().toString();
    public TextView timeView;
    public MyTimeDialogFragment(Context context, OnTimeSetListener listener, int hourOfDay, int minute, boolean is24HourView, TextView timeView) {
        super(context, listener, hourOfDay, minute, is24HourView);
        this.timeView = timeView;
    }

    @Override
    public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
        super.onTimeChanged(view, hourOfDay, minute);
        timeView.setText("Время: " + hourOfDay + " часов " + minute + " минут.");
    }
}
