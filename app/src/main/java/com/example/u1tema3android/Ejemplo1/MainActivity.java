package com.example.u1tema3android.Ejemplo1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.u1tema3android.Ejemplo2.ListaCorreo;
import com.example.u1tema3android.R;

public class MainActivity extends AppCompatActivity {

    String miitem;
    EditText edtDescripcion;
    Spinner mispinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mispinner=findViewById(R.id.mispinner);

        mispinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView,View view, int position, long arg3) {
// TODO Auto-generated method stub
                        Fragment FragmentoSeleccionado = null;
                        switch (position){
                            case 0:
                                FragmentoSeleccionado= new ListaFragmento();
                                break;
                            case 1:
                                FragmentoSeleccionado= new GridFragmento();
                        }
                        FragmentManager fragmentManager=getSupportFragmentManager();
                        FragmentTransaction transaction = fragmentManager.beginTransaction();
                        transaction.replace(R.id.fragmento,FragmentoSeleccionado);
                        transaction.commit();
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {
// TODO Auto-generated method stub
                    }
                });

    }


    public void ejemplo3(View view) {
    }

    public void ejemplo2(View view) {
    }

    public void ejemplo1(View view) {
    }
}
