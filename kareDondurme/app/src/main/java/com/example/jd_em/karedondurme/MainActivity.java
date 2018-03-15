package com.example.jd_em.karedondurme;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE_KARE_AL = 1 ;

    private Button button;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
        registerEventHandlers();
    }

    private void initComponents(){
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
    }

    private void registerEventHandlers(){

        button_OnClick();

    }

    private void button_OnClick(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DestinationActivity.class);
                intent.putExtra("sayi", Integer.parseInt(editText.getText().toString()));
                startActivityForResult(intent, REQUEST_CODE_KARE_AL);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_KARE_AL) {
            if (resultCode == Activity.RESULT_OK){
                Integer gelenSayi = data.getIntExtra("sayi", 0);
                Toast.makeText(this,"Gelen Sayi: " + gelenSayi, Toast.LENGTH_SHORT).show();
            } else if (resultCode == Activity.RESULT_CANCELED){}
        }
    }
}
