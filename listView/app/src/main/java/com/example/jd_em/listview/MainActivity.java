package com.example.jd_em.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
    {

    private ListView listGunler;
    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
        bindData();
        registerEventHandlers();
    }

    private void initComponents() {
        listGunler = findViewById(R.id.listGunler);
    }


    private void bindData()
    {
        bindList();
    }


    private void registerEventHandlers() {
        listGunler_onClick();
    }
    private void bindList() {
        ArrayList gunler = new ArrayList();
        gunler.add("Pazartesi");
        gunler.add("Salı");
        gunler.add("Carşamba");
        gunler.add("Perşembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");


        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, gunler);
        listGunler.setAdapter(arrayAdapter);

    }


    private void listGunler_onClick(){
        listGunler.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String secim = listGunler.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, "Seçim: " + secim, Toast.LENGTH_SHORT).show();
            }

    }); }

}
