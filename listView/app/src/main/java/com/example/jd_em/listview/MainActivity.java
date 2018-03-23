package com.example.jd_em.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private AdapterView adapterView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindList();
        listGunler_onClick();


    }

    private void bindList(){
        ArrayList gunler = new ArrayList();
        gunler.add("Pzt");
        gunler.add("Salı");
        gunler.add("Cars");
        gunler.add("Pers");
        gunler.add("Cuma");
        gunler.add("Cts");
        gunler.add("Pazar");


        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, gunler);
        listView.setAdapter(arrayAdapter);

    }

    private void listGunler_onClick(){
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String secim = listView.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this,"Secim: " + secim, Toast.LENGTH_LONG).show();
            }
        });
    }


}
