package com.example.tromsoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    EditText cajaNombreUsuario;
    EditText cajaContrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        cajaNombreUsuario=findViewById(R.id.nombreUsuario);
        cajaContrasena=findViewById(R.id.contraseñaUsuario);
        String nombreUsuario=cajaNombreUsuario.getText().toString();
        String contraseñaUsuario=cajaContrasena.getText().toString();
    }
}