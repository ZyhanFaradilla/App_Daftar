package com.example.appdaftar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;

public class datadiri extends Activity {
    static int PregCode = 1;
    static int REQUESTCODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datadiri);
        Button kembali=findViewById(R.id.tombol4);
        ImageButton tombol_kamera = findViewById(R.id.kamera);

        kembali.setOnClickListener(v -> {
            Intent d = new Intent( datadiri.this , tampilanawal.class);
            startActivity(d);
        });
        tombol_kamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= 18) {
                    CheckPermission();
                } else {
                    buka_kamera();
                }
            }

            private void CheckPermission() {
                if (ContextCompat.checkSelfPermission(datadiri.this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                    if (ActivityCompat.shouldShowRequestPermissionRationale(datadiri.this, Manifest.permission.CAMERA)) {
                        Toast.makeText(datadiri.this, "Please Accept for Required Permission", Toast.LENGTH_SHORT).show();
                    } else {
                        ActivityCompat.requestPermissions(datadiri.this, new String[]{Manifest.permission.CAMERA}, PregCode);
                    }
                } else {
                    buka_kamera();
                }
            }
            private void buka_kamera() {
                Intent  cameraIntent = new Intent(Intent.ACTION_GET_CONTENT);
                cameraIntent.setType("Image/*");
                startActivityForResult(cameraIntent, REQUESTCODE);
            }
        });
    }
}