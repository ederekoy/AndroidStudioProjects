package com.example.jd_em.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerGun;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
        registerEventHandlers();


    }

    private void registerEventHandlers(){
        spinner_onItemSelect();

    }

    private void spinner_onItemSelect(){
        spinnerGun.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String secilen = spinnerGun.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, "Seçim: " + secilen, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    private void initComponents(){

        spinnerGun = findViewById(R.id.spinnerGun);
    }
}

