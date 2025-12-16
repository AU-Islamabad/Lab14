package com.example.lab14;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    String KEY="Khudema";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        Log.d(KEY,"OnCreate-2 Method is called.");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(KEY,"OnStart-2 Method is called.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(KEY,"OnResume-2 Method is called.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(KEY,"OnPause-2 Method is called.");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(KEY,"OnRestart-2 Method is called.");
    }
}