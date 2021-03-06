package com.example.jd_em.popupmenu;

import android.app.Dialog;
import android.content.ClipData;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registerEventHandlers();
    }

    public void registerEventHandlers(){
        onOptionsItemSelected();
    }

    public void initComponents(){

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.cikis:
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Emin Misiniz?");
                builder.setMessage("Çıkış yapmak ıstedıgınez emin misiniz?");
                builder.setIcon(R.drawable.ic_question_answer_black_24dp);

                AlertDialog alertDialog = builder.create();
                alertDialog.show();

        }
        return super.onOptionsItemSelected(menuItem);
    }
}
