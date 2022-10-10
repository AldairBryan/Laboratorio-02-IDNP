package com.example.laboratorio_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText apellidoPaterno =findViewById(R.id.inputApellidoP);
        EditText apellidoMaterno =findViewById(R.id.inputApellidoM);
        EditText nombres =findViewById(R.id.inputNombres);
        EditText fechaNacimiento =findViewById(R.id.inputFechaNacimiento);
        EditText codigoProcedencia =findViewById(R.id.inputCodigoP);
        Spinner carreraPostular =findViewById(R.id.inputCarrera);

    }
}