package com.example.lab3_3;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class BirdsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.birds_view);

        ImageButton huuhkaja = findViewById(R.id.huuhkaja);
        huuhkaja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(BirdsActivity.this, R.raw.huuhkaja_norther_eagle_owl);
                mediaPlayer.start();
            }
        });

        ImageButton peippo = findViewById(R.id.peippo);
        peippo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(BirdsActivity.this, R.raw.peippo_chaffinch);
                mediaPlayer.start();
            }
        });

        ImageButton peukaloinen = findViewById(R.id.peukaloinen);
        peukaloinen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(BirdsActivity.this, R.raw.peukaloinen_wren);
                mediaPlayer.start();
            }
        });

        ImageButton punatulkku = findViewById(R.id.punatulkku);
        punatulkku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(BirdsActivity.this, R.raw.punatulkku_northern_bullfinch);
                mediaPlayer.start();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.animals_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        if (item.getItemId() == R.id.mammals_menu_item) {
            Intent mammalsIntent = new Intent(BirdsActivity.this,MammalsActivity.class);
            startActivity(mammalsIntent);

        }

        else if (item.getItemId() == R.id.birds_menu_item) {

            Intent birdsIntent = new Intent (BirdsActivity.this, BirdsActivity.class);
            startActivity(birdsIntent);


        }

        return true;
    }

}