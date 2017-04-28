package david_guillen_lab2;

import java.util.ArrayList;

public class Alumnos {
    private String apodo;
    private int numero_cuenta;
    private int edad;
    private int resistencia;
    private int grado_academico;
    private ArrayList<String> mochila = new ArrayList();

    public Alumnos() {
    }

    public Alumnos(String apodo, int numero_cuenta, int edad, int resistencia, int grado_academico) {
        this.apodo = apodo;
        this.numero_cuenta = numero_cuenta;
        this.edad = edad;
        this.resistencia = resistencia;
        this.grado_academico = grado_academico;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getGrado_academico() {
        return grado_academico;
    }

    public void setGrado_academico(int grado_academico) {
        this.grado_academico = grado_academico;
    }

    public ArrayList<String> getMochila() {
        return mochila;
    }

    public void setMochila(ArrayList<String> mochila) {
        this.mochila = mochila;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "apodo=" + apodo + ", numero_cuenta=" + numero_cuenta + ", edad=" + edad + ", resistencia=" + resistencia + ", grado_academico=" + grado_academico + ", mochila=" + mochila + '}';
    }
    
}
