package com.example.jd_em.counter;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = this.getMenuInflater();
        menuInflater.inflate(R.menu.ana_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.cikis:
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Emin Misiniz?");
                builder.setMessage("Sistemden çıkmak istediğinize emin misiniz?");

               /* builder.setPositiveButton("Çık", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Çıkış Gerçekleşti", Toast.LENGTH_SHORT).show();

                    }
                });

                builder.setNegativeButton("İptal", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "İptal Edildi", Toast.LENGTH_SHORT).show();

                    }
                });  */

                class AlertDialogClickListener implements DialogInterface.OnClickListener{
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (which == AlertDialog.BUTTON_NEGATIVE){
                            Toast.makeText(MainActivity.this,"Çıkış başarıyla gerçekleşti.",Toast.LENGTH_SHORT).show();
                        } else if (which == AlertDialog.BUTTON_POSITIVE){
                            Toast.makeText(MainActivity.this,"İşlem İptal Edildi.", Toast.LENGTH_SHORT).show();
                        }

                    }
                }

                AlertDialogClickListener alertDialogClickListener = new AlertDialogClickListener();
                builder.setNegativeButton("Evet", alertDialogClickListener);
                builder.setPositiveButton("Hayır", alertDialogClickListener);


                AlertDialog alertDialog = builder.create();
                alertDialog.show();



                break;
        }
        return super.onOptionsItemSelected(menuItem);
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
