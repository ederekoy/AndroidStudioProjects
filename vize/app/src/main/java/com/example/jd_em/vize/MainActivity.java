package com.example.jd_em.vize;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    EditText kullaniciAdi, sifre;
    Button btnKayit, btnGiris;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
        registerEventHandlers();

    }

    public void registerEventHandlers(){

        btnGiris_onClick();
        btnKayit_onClick();

    }

    public void btnGiris_onClick(){
        btnGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Girildi",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void btnKayit_onClick(){
        btnKayit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegisterMain.class);
                intent.putExtra("kullaniciAdi",kullaniciAdi.getText().toString() );
                startActivity(intent);

            }
        });

    }

    public void initComponents(){
        kullaniciAdi = findViewById(R.id.editText);
        sifre = findViewById(R.id.editText2);
        btnKayit = findViewById(R.id.button2);
        btnGiris = findViewById(R.id.button);

    }


}
