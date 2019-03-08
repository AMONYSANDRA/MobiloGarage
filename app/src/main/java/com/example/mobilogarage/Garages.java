package com.example.mobilogarage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Garages extends AppCompatActivity {

    public void fade(View view) {

        ImageView gar = (ImageView) findViewById(R.id.garage1);
        ImageView garr = (ImageView) findViewById(R.id.garge2);
        ImageView garrr = (ImageView) findViewById(R.id.garage3);


        gar.animate().rotationBy(360).scaleX(0.5f).scaleY(0.5f).scaleX(0.5f).alpha(1).setDuration(2000);
        garr.animate().rotationBy(360).scaleX(0.5f).scaleY(0.5f).alpha(1).setDuration(2000);
        garrr.animate().rotationBy(360).scaleX(0.5f).scaleY(0.5f).alpha(1).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garages);
    }
}
