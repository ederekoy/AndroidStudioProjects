package com.example.jd_em.vize;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterMain extends AppCompatActivity {

    public EditText isim, soyisim, eposta, regAdi, regSifre;
    public Button regKayitBtn;
    private Intent incomingIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_main);

        initComponents();
        registerEventHandlers();
    }

    private void registerEventHandlers() {
        kayitGeriGonder_onClick();
    }

    private void kayitGeriGonder_onClick() {

        Intent returnIntent = new Intent();
        String gelenAd = returnIntent.getStringExtra("kullaniciAdi") ;
        regAdi.setText(gelenAd);
        setResult(RESULT_OK, returnIntent);
        finish();

    }

    private void initComponents() {
    isim = findViewById(R.id.isim);
    soyisim = findViewById(R.id.soyisim);
    eposta = findViewById(R.id.eposta);
    regAdi = findViewById(R.id.regAdi);
    regSifre = findViewById(R.id.regSifre);
    regKayitBtn = findViewById(R.id.regKayit);

    incomingIntent = getIntent();
    String gelenAd = incomingIntent.getStringExtra("kullaniciAdi");
    regAdi.setText(gelenAd + "");
    }
}
