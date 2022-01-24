package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launch_sp(View v)
    {
        //launches single player activity
        Intent i =  new Intent(this, singeplayer_screen.class);
        startActivity(i);
    }

    public void launch_twop(View v)
    {
        //launches two player activity
        Intent t = new Intent(this, twoplayer_screen.class);
        startActivity(t);
    }
}