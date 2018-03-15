package com.example.jd_em.validation;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Display;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nameText, surnameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        detectOrientation();
        initComponents();
        registerEventHandlers();
    }

    private void detectOrientation() {
        WindowManager windowManager = (WindowManager) this.getSystemService(Context.WINDOW_SERVICE);
        Display display = windowManager.getDefaultDisplay();
        int height = display.getHeight();
        int widht = display.getWidth();

        if (height > widht)
            Toast.makeText(this, " Portrait bebeyim ", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this, " Landscape bebeyim ", Toast.LENGTH_LONG).show();

    }


    private void initComponents(){
      nameText = (EditText) findViewById(R.id.nameText);
      surnameText = (EditText) findViewById(R.id.surnameText);

    }


    private void registerEventHandlers() {
        nameText_onTextChange();
        surnameText_onTextChange();
    }

    private void nameText_onTextChange() {
        nameText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence value, int start, int before, int count) {
                if (!value.equals("") && value.length() <= 2 ){
                    Resources resources = MainActivity.this.getResources();
                    Drawable errorImage = resources.getDrawable(R.drawable.ic_new_releases_black_24dp);
                    int height = errorImage.getIntrinsicHeight();
                    int width = errorImage.getIntrinsicWidth();
                    errorImage.setBounds(0, 0, width, height);
                    nameText.setError(" Minimum 3 character! ", errorImage);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    private void surnameText_onTextChange() {
        surnameText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence value, int start, int before, int count) {
                if (!value.equals("") && value.length() <=1 ) {
                    Resources resources = MainActivity.this.getResources();
                    Drawable errorImage = resources.getDrawable(R.drawable.ic_new_releases_black_24dp);
                    int height = errorImage.getIntrinsicHeight();
                    int width = errorImage.getIntrinsicWidth();
                    errorImage.setBounds(0,0, width,height);
                    surnameText.setError(" Minimum 2 Character! ", errorImage);
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }





}
