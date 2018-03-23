package com.example.jd_em.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registerEventHandlers();
        initComponents();


    }

    private void registerEventHandlers(){
        spinner_onItemSelect();

    }

    private void spinner_onItemSelect() {
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String str = (String) spinner.getItemAtPosition(position);
                Toast.makeText(MainActivity.this, "Secilen Gun: " + str, Toast.LENGTH_LONG);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }


    private void initComponents(){
        spinner = findViewById(R.id.spinner);
    }
}

