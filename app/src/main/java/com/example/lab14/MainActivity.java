package com.example.lab14;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    String KEY="Khudema";

    Button b1;
    private boolean backPressedOnce = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(KEY,"OnCreate Method is called.");
        b1=findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,MainActivity2.class);
                startActivity(i);
            }
        });

        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {


                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Do you want to exit!")
                        .setMessage("Are you sure you want to close this application?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", (dialog, which) -> {
                            // YES clicked
                            finish();
                        })
                        .setNegativeButton("No", (dialog, which) -> dialog.dismiss());

                AlertDialog alertDialog = builder.create();
                alertDialog.show();


            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(KEY,"OnStart Method is called.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(KEY,"OnResume Method is called.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(KEY,"OnPause Method is called.");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(KEY,"OnRestart Method is called.");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(KEY,"OnStop Method is called.");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(KEY,"OnDestroy Method is called.");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}