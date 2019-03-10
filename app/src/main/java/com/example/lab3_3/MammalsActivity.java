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

public class MammalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mammals_view);

        ImageButton susi = findViewById(R.id.susi);
        susi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MammalsActivity.this, R.raw.wolf);
                mediaPlayer.start();
            }
        });

        ImageButton ronsu = findViewById(R.id.ronsu);
        ronsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MammalsActivity.this, R.raw.elephant);
                mediaPlayer.start();
            }
        });

        ImageButton karhu = findViewById(R.id.karhu);
        karhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MammalsActivity.this, R.raw.bear);
                mediaPlayer.start();
            }
        });

        ImageButton lammas = findViewById(R.id.lammas);
        lammas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MammalsActivity.this, R.raw.lamb);
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
            Intent mammalsIntent = new Intent(MammalsActivity.this,MammalsActivity.class);
            startActivity(mammalsIntent);

        }

        else if (item.getItemId() == R.id.birds_menu_item) {

            Intent birdsIntent = new Intent (MammalsActivity.this, BirdsActivity.class);
            startActivity(birdsIntent);


        }

        return true;
    }
}