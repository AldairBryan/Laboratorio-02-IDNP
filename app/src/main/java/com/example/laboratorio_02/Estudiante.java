package com.example.laboratorio_02;

public class Estudiante {
    public String nombre,apellidoP,apellidoM,fechaN,carrera,colegio;

    public Estudiante(String nombre,String apellidoM,String apellidoP, String fechaN, String carrera, String colegio){
        this.nombre=nombre;
        this.apellidoM=apellidoM;
        this.apellidoP=apellidoP;
        this.fechaN=fechaN;
        this.carrera=carrera;
        this.colegio=colegio;
        System.out.println("Registrado");
    }

    public String toString(){
        return "Nombre: "+nombre+
                "\nApellido Paterno: "+apellidoP+
                "\nApellido Materno: "+apellidoM+
                "\nFecha Nacimiento: "+fechaN+
                "\nCarrera: "+carrera+
                "\nColegio Procedencia: "+colegio;
    }
}
