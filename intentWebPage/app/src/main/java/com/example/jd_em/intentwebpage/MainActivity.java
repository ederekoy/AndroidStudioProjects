package com.example.jd_em.intentwebpage;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(Intent.ACTION_VIEW);
        String strUrl = "https://www.instagram.com/mufche/";
        intent.setData(Uri.parse(strUrl));
        startActivity(intent);

    }
}
