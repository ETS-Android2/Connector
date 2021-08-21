  package com.example.practiceandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import java.util.Objects;

public class MainApp extends AppCompatActivity {

    TextView youAreTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_app);
        String firstName = getIntent().getStringExtra("firstName");
        String secondName = getIntent().getStringExtra("secondName");
        youAreTextView = findViewById(R.id.youAreTextView);
        youAreTextView.setText("Hello, " +firstName +" " +secondName +"\nWhat will you want to do?");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

    }


    public void gotoCallSomeOne(View view)
    {
        //Goto CallSomeOne
        Intent intent = new Intent(this,CallSomeOne.class);
        startActivity(intent);
    }

    public void gotoSendEmail(View view)
    {
        //Goto Email
        Intent intent = new Intent(this,SendEmail.class);
        startActivity(intent);
    }

    public void gotoShareAppLogo(View view)
    {
        //Goto ShareOurLogo
        Intent intent = new Intent(this, ShareAppLogo.class);
        startActivity(intent);
    }

    public void gotoShareTheApp(View view)
    {
        //Goto ShareTheApp
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        String shareBody = getResources().getString(R.string.share_message);
        sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(sharingIntent, "Share via"));

    }

    public void gotoAboutMe(View view)
    {
        //Goto AboutMe
        Intent intent = new Intent(this,AboutMe.class);
        startActivity(intent);

    }

    public void gotoCaptureTheMoment(View view)
    {
        //Goto CaptureTheMoment
        Intent intent = new Intent(this,CaptureTheMoment.class);
        startActivity(intent);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}