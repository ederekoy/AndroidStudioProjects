package com.example.jd_em.karedondurme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by jd_em on 15.03.2018.
 */

public class DestinationActivity extends AppCompatActivity{

    private TextView lblGelenSayi;
    private Button btnGeriGonder;
    private Intent incomingIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);

        initComponents();
        registerEventHandlers();
    }

    private void registerEventHandlers(){

        btnGeriGonder_onClick();
    }

    private void btnGeriGonder_onClick(){
        btnGeriGonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnIntent = new Intent();
                Integer gelenSayi = Integer.parseInt(lblGelenSayi.getText().toString());
                returnIntent.putExtra("sayi",gelenSayi * gelenSayi);
                setResult(RESULT_OK, returnIntent);
                finish();
            }
        });
    }

    private void initComponents(){

        lblGelenSayi = findViewById(R.id.lblGelenSayi);
        btnGeriGonder = findViewById(R.id.btnGeriGonder);

        incomingIntent = getIntent();

        int sayi = incomingIntent.getIntExtra("sayi", 0);
        lblGelenSayi.setText(sayi + "");
    }
}
