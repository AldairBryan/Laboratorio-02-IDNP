package com.example.laboratorio_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText apellidoPaterno =findViewById(R.id.inputApellidoP);
        EditText apellidoMaterno =findViewById(R.id.inputApellidoM);
        EditText nombres =findViewById(R.id.inputNombres);
        EditText fechaNacimiento =findViewById(R.id.inputFechaNacimiento);
        EditText codigoProcedencia =findViewById(R.id.inputColegio);
        EditText carreraPostular =findViewById(R.id.inputCarrera);
        Button registrarEstudiante=findViewById(R.id.buttonRegistrar);
        Button listarEstudiantes=findViewById(R.id.buttonListar);

        ArrayList<Estudiante> listaEstudiantes= new ArrayList<Estudiante>();
        registrarEstudiante.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String apellidoP = apellidoPaterno.getText().toString();
                String apellidoM =apellidoMaterno.getText().toString();
                String nombre =nombres.getText().toString();
                String fechaN =fechaNacimiento.getText().toString();
                String codigoP =codigoProcedencia.getText().toString();
                String carreraP =carreraPostular.getText().toString();
                if(!comprobarCampos(apellidoP,apellidoM,nombre,fechaN,codigoP,carreraP)){
                    listaEstudiantes.add(new Estudiante(nombre,apellidoM,apellidoP,fechaN,carreraP,codigoP));
                    Log.d("INFO", "Estudiante  Registrado");
                } else {
                    Log.d("INFO", "Falta completar campos");
                }
            }
        });

        listarEstudiantes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.d("INFO",listaEstudiantes.toString());
            }
        });
    }
    public static boolean comprobarCampos(String aP,String aM,String nom,String fech,String cod,String carr){
        boolean vacio=false;
        vacio= aP.isEmpty() || aM.isEmpty() || nom.isEmpty() || fech.isEmpty() || cod.isEmpty() || carr.isEmpty();
        return vacio;
    }
}