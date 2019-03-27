package com.example.mobilogarage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Order extends AppCompatActivity {
EditText editText;
EditText editText2;
EditText editText20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }

    public void note(View view){

        EditText editText= findViewById(R.id.editText);
        EditText editText2= findViewById(R.id.editText2);
        EditText editText20= findViewById(R.id.editText20);


        Toast.makeText(getApplicationContext(),"Order has been submited",Toast.LENGTH_LONG).show();
        editText20.setText("");
        editText2.setText("");
        editText.setText("");

    }

}
