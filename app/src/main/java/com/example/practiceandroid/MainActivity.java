package com.example.practiceandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstNameEditText;
    EditText secondNameEditText;
    Button registerButton;
    ImageView connectorLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNameEditText = findViewById(R.id.firstNameEditText);
        secondNameEditText = findViewById(R.id.secondNameEditText);
        connectorLogo = findViewById(R.id.connector_logo);
        registerButton = findViewById(R.id.registerButton);

        connectorLogo.animate().translationX(-1500);
        registerButton.animate().translationX(1500).withEndAction(new Runnable() {
            @Override
            public void run() {
                connectorLogo.animate().translationX(0).setDuration(1750).start();
                registerButton.animate().translationX(0).setDuration(1750).start();
                connectorLogo.animate().alpha(1).setDuration(2500).start();
                registerButton.animate().alpha(1).setDuration(1500).start();
            }
        });


    }

    public void onClickRegister(View view)
    {
        Intent intent = new Intent(this,MainApp.class);
        intent.putExtra("firstName",firstNameEditText.getText().toString());
        intent.putExtra("secondName", secondNameEditText.getText().toString());
        startActivity(intent);
    }
}