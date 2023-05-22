package com.example.appdaftar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class tampilanawal extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilanawal);
        Button tombol1=findViewById(R.id.tombol1);
        Button tombol2=findViewById(R.id.tombol2);
        Button tombol3=findViewById(R.id.tombol3);
        FloatingActionButton tombol_bagi = findViewById(R.id.share);
        tombol1.setOnClickListener(v -> {
            Intent a = new Intent( tampilanawal.this, datadiri.class );
            startActivity(a);
        });
        tombol2.setOnClickListener(v -> {
            Intent b = new Intent( tampilanawal.this, pemilihan.class );
            startActivity(b);
        });
        tombol3.setOnClickListener(v -> {
            Intent c = new Intent( tampilanawal.this, hasil.class );
            startActivity(c);
        });
        // Tombol Share
        tombol_bagi.setOnClickListener(v -> {
            Intent intent = new Intent((Intent.ACTION_SEND));
            intent.putExtra(Intent.EXTRA_TEXT, "Lihat Aplikai Ini");
            intent.setType("text/plain");
            startActivity(Intent.createChooser(intent, "Share to :"));
        });
    }
}