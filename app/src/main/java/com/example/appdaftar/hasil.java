package com.example.appdaftar;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.widget.Button;
import android.os.Bundle;

public class hasil extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        Button kembali2=findViewById(R.id.tombol6);

        kembali2.setOnClickListener(v -> {
            Intent f = new Intent( hasil.this , tampilanawal.class);
            startActivity(f);
        });
    }
}