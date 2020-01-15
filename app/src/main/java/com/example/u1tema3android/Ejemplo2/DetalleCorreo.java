package com.example.u1tema3android.Ejemplo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.u1tema3android.R;

public class DetalleCorreo extends AppCompatActivity {

    TextView txtmensaje;
    String asunto,de,texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_correo);

        Bundle extras = getIntent().getExtras();
        asunto= extras.getString("asunto");
        de = extras.getString("de");
        texto = extras.getString("texto");
        txtmensaje=findViewById(R.id.txtdetalle);

        txtmensaje.setText(de +" "+asunto +" "+texto);
    }
}
