package com.example.ado;

import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.ado.R;

public class MainActivity extends AppCompatActivity {
    private final int zagr=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.enableEdgeToEdge(getWindow());
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent peremenay=new Intent(MainActivity.this, MainActivity2.class);
                MainActivity.this.startActivity(peremenay);
                MainActivity.this.finish();
            }
        },zagr);
    }
}