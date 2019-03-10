package com.example.lab3_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
            Intent mammalsIntent = new Intent(MainActivity.this,MammalsActivity.class);
            startActivity(mammalsIntent);

        }

         else if (item.getItemId() == R.id.birds_menu_item) {

            Intent birdsIntent = new Intent (MainActivity.this, BirdsActivity.class);
            startActivity(birdsIntent);


            }

            return true;
        }
    }
