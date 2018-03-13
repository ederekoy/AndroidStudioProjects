package com.example.jd_em.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public final String TAG = MainActivity.class.getName();

    private Button button , btnCikar;
    private EditText editText, editText2;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
        registerEventHandlers();
        cikarma();
        Log.i(TAG, "On Create() Metodu calisti." );
    }

    private void registerEventHandlers(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1 = Integer.valueOf(editText.getText().toString());
                int sayi2 = Integer.valueOf(editText2.getText().toString());
                textView2.setText("Sonuc = " + (sayi1+sayi2));
            }
        });
    }

    private void cikarma() {
        btnCikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1 = Integer.valueOf(editText.getText().toString());
                int sayi2 = Integer.valueOf(editText2.getText().toString());
                textView2.setText("Sonuc = " + (sayi1-sayi2));
            }
        });
    }

    private void initComponents() {
        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        button = findViewById(R.id.button);
        textView2 = findViewById(R.id.textView2);
        btnCikar = findViewById(R.id.btnCikar);

    }

}
