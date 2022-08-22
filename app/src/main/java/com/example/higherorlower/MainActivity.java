package com.example.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void guess (View view){
        EditText editText =(EditText) findViewById(R.id.editText);
        int guessValue = Integer.parseInt(editText.getText().toString());

        String  message;

        if (guessValue>100){
            message = "Higher";
        }
        else if (guessValue<50)
        {
            message = "Lower";
        }
        else {
            message = "Between";
        }
        Toast.makeText(this, message , Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}