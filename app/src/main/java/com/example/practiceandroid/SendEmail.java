package com.example.practiceandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Objects;

// add to calender from email
// add contact
// share the application
// share a photo

public class SendEmail extends AppCompatActivity {

    EditText etTo,etSubject,etMessage;
    Button btSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_email);

        etTo = findViewById(R.id.et_to);
        etSubject = findViewById(R.id.et_subject);
        etMessage = findViewById(R.id.et_message);
        btSend = findViewById(R.id.bt_send);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);


        btSend.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(android.content.Intent.EXTRA_EMAIL,new String[] { etTo.getText().toString() });
                intent.putExtra(intent.EXTRA_SUBJECT,etSubject.getText().toString());
                intent.putExtra(intent.EXTRA_TEXT,etMessage.getText().toString());
                intent.setType("text/plain");
                startActivity(intent);
            }

        });
    }

    public void onSendEmail(View view) {

        Intent intent = new Intent(Intent.ACTION_VIEW
                , Uri.parse("mailto:" +etTo.getText().toString()));
        intent.putExtra(intent.EXTRA_SUBJECT,etSubject.getText().toString());
        intent.putExtra(intent.EXTRA_TEXT,etMessage.getText().toString());
        startActivity(intent);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }


}