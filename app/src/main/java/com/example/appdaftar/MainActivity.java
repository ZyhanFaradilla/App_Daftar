package com.example.appdaftar;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText InputUsername;
    private EditText InputPassword;
    private CheckBox ShowPassword;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InputUsername = findViewById(R.id.username);
        InputPassword = findViewById(R.id.password);
        ShowPassword = findViewById(R.id.showpassword);
        Login = findViewById(R.id.btn);

        //Set onClickListener untuk menangani kejadian saat Checkbox di klik (HidePssword)
        ShowPassword.setOnClickListener(view -> {
            if(ShowPassword.isChecked()){
                InputPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            } else {
                InputPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        });
        Login.setOnClickListener(v -> {

            String usernameKey = InputUsername.getText().toString();
            String passwordKey = InputPassword.getText().toString();

            if (usernameKey.equals("Dian") && passwordKey.equals("123")){
                //jika login berhasil
                Toast.makeText(getApplicationContext(), "LOGIN SUKSES",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, tampilanawal.class);
                MainActivity.this.startActivity(intent);
                finish();
            }else {
                //jika login gagal
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Username atau Password Anda salah!")
                        .setNegativeButton("Retry", null).create().show();
            }
        });
    }
}