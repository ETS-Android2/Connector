package com.example.practiceandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.practiceandroid.R;

import java.util.Objects;

public class AboutMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
    }

    public void onClickOpenGitHub(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/LahavHarary"));
        startActivity(intent);
    }

    public void onClickOpenWebSite(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://lahavcv.netlify.app/"));
        startActivity(intent);
    }

    public void onClickOpenLinkedIn(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://linkedin.com/in/lahav-harary-361a391ab/"));
        startActivity(intent);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}