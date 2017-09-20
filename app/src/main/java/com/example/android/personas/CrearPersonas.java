package com.example.android.personas;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CrearPersonas extends AppCompatActivity {
    private EditText cedula, nombre, apellido;
    private Resources resources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_personas);
        cedula = (EditText) findViewById(R.id.txtCedula);
        nombre = (EditText) findViewById(R.id.txtNombre);
        apellido =(EditText) findViewById(R.id.txtApellido);
    }

    public void guardar(View view){
        String ced, nom, ape;
        ced=cedula.getText().toString();
        nom=nombre.getText().toString();
        ape=apellido.getText().toString();

        Persona p=new Persona(ced,nom,ape);
        p.guardar();
        Toast.makeText(this,resources.getString(R.string.mensaje1),Toast.LENGTH_SHORT).show();
    }
}
