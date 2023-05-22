package com.example.appdaftar;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.widget.Button;
import android.os.Bundle;

public class pemilihan extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemilihan);
        Button kembali1=findViewById(R.id.tombol5);

        kembali1.setOnClickListener(v -> {
            Intent e = new Intent( pemilihan.this , tampilanawal.class);
            startActivity(e);
        });
    }
}