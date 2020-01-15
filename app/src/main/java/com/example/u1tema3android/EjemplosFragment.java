package com.example.u1tema3android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.u1tema3android.Ejemplo1.MainActivity;
import com.example.u1tema3android.Ejemplo2.ListaCorreo;
import com.example.u1tema3android.Ejemplo3.MainFragmentCorreo;

public class EjemplosFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplos_fragment);
    }
    public void ejemplo1(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }

    public void ejemplo2(View view) {
        startActivity(new Intent(this, ListaCorreo.class));
    }
    public void ejemplo3(View view) {
        startActivity(new Intent(this, MainFragmentCorreo.class));
    }
}
