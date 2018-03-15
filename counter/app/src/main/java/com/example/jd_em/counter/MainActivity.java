package com.example.jd_em.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button, clearButton;
    private TextView counterText;
    private int count = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initCompenents();
        registerEventHandlers();
    }

    private void initCompenents(){
        button = (Button) findViewById(R.id.button);
        clearButton = (Button) findViewById(R.id.clearButton);
        counterText = (TextView) findViewById(R.id.counterText);
    }

    private void registerEventHandlers(){
        registerButtonClickEvent();
    }

    private void registerButtonClickEvent() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                counterText.setText(count + " times clicked. ");
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                counterText.setText("Counter Cleared.");
            }
        });
    }
    
}
