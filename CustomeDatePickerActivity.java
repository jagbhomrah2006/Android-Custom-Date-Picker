package com.zsoftware.sampleapps.CustomeDatePicker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import com.zsoftware.sampleapps.R;

public class CustomeDatePickerActivity extends AppCompatActivity {

    private LinearLayout llCustomeDatePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custome_date_picker);

        llCustomeDatePicker = (LinearLayout) findViewById(R.id.llCustomeDatePicker);

        llCustomeDatePicker.addView(new CustomeDatePicker(CustomeDatePickerActivity.this));
    }
}
