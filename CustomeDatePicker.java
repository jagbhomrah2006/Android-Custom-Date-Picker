package com.zsoftware.sampleapps.CustomeDatePicker;

import android.app.DatePickerDialog;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

/**
 * Created by HP on 15-03-2017.
 */

public class CustomeDatePicker extends TextView implements View.OnClickListener {

    private Context ctx;

    public CustomeDatePicker(Context context) {
        super(context);
        this.ctx = context;
        setText("Click Here For Date");
        setOnClickListener(this);
    }

    public CustomeDatePicker(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.ctx = context;
        setText("Click Here For Date");
        setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        showDateDialogInActivity();
    }

    @Override
    public void setText(CharSequence text, BufferType type) {
        super.setText(text, type);
    }

    private void showDateDialogInActivity() {
        int mYear, mMonth, mDay;

        // Get Current Date
        final Calendar c = Calendar.getInstance();
        mYear = c.get(Calendar.YEAR);
        mMonth = c.get(Calendar.MONTH);
        mDay = c.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(ctx,
                new DatePickerDialog.OnDateSetListener() {

                    @Override
                    public void onDateSet(DatePicker view, int year,
                                          int monthOfYear, int dayOfMonth) {
                        setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);
                    }
                }, mYear, mMonth, mDay);
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
    }
}
