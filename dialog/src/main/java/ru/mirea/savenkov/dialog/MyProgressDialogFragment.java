package ru.mirea.savenkov.dialog;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.Toast;

public class MyProgressDialogFragment extends ProgressDialog {
    public MyProgressDialogFragment(Context context) {
        super(context);
        this.setMessage("Подождём...");
        this.setButton(DialogInterface.BUTTON_POSITIVE, "Выйти", new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast t = new Toast(getContext());
                t.setText("Зачем вышли?");
                t.show();
            }
        });
    }


}
