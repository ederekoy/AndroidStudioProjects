package com.example.jd_em.intentmssg;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"mufche@yandex.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Başlık Bilgisi");
        intent.putExtra(Intent.EXTRA_TEXT, "İçerik");
        intent.setType("text/plain");
        intent.setData(Uri.parse("mufche@yandex.com"));
        startActivity(Intent.createChooser(intent , " Uygulama Seçiniz"));
    }
}
