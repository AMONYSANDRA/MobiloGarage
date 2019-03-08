package com.example.mobilogarage;

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
        inflater.inflate(R.menu.item, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.garage:
                Intent intent = new Intent(getApplicationContext(), Garages.class);
                startActivity(intent);
                return true;

            case R.id.order:
                Intent n = new Intent(getApplicationContext(), Order.class);
                startActivity(n);
                return true;

            case R.id.services:
                Intent s = new Intent(getApplicationContext(), services.class);
                startActivity(s);
                return true;

            default: super.onOptionsItemSelected(item);
        }

    return true;
    }
}