package com.example.jd_em.timepicker;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnTimePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
        btnTime_onClick();
    }

    private void btnTime_onClick() {
        btnTimePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                class TimeHandler implements TimePickerDialog.OnTimeSetListener{

                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        String minToString = String.valueOf(minute);
                        String hourToString = String.valueOf(hourOfDay);
                        if (minute < 10)
                            minToString = "0" + minute;


                        if (hourOfDay < 10)
                            hourToString = "0" + hourOfDay;

                        String msg = "Secim: " + hourToString + ":" + minToString;
                        Toast.makeText(MainActivity.this,msg,Toast.LENGTH_LONG).show();
                    }

                    }
               TimePickerDialog timePickerDialog = new TimePickerDialog(MainActivity.this, new TimeHandler(),9,0,true);
                timePickerDialog.setTitle("Saat Ayarı");
                timePickerDialog.show();

                }
        });

    }

    public void initComponents(){

        btnTimePicker = findViewById(R.id.timePicker);
    }
}
