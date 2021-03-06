package david_guillen_lab2;

import javax.swing.JOptionPane;

public class Rusos {
    private String nombre;
    private String id;
    private int edad;
    private int rango;
    private int resistencia;
    private String tipo_arma;
    private int poder_fuego;

    public Rusos() {
    }

    public Rusos(String nombre, String id, int edad, int rango, String tipo_arma) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.rango = rango;
        this.resistencia = 8 * edad;
        this.tipo_arma = tipo_arma;
        if (tipo_arma.equalsIgnoreCase("AK-47")) {
            poder_fuego = 27;
        }else if (tipo_arma.equalsIgnoreCase("Revolver Navant")) {
            poder_fuego = 13;
        }else if (tipo_arma.equalsIgnoreCase("RPG-7")) {
            poder_fuego = 57;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public String getTipo_arma() {
        return tipo_arma;
    }

    public void setTipo_arma(String tipo_arma) {
        this.tipo_arma = tipo_arma;
        
    }

    public int getPoder_fuego() {
        return poder_fuego;
    }

    public void setPoder_fuego(int poder_fuego) {
        this.poder_fuego = poder_fuego;
    }
    
    @Override
    public String toString() {
        return "Rusos{" + "nombre=" + nombre + ", id=" + id + ", edad=" + edad + ", rango=" + rango + ", resistencia=" + resistencia + ", tipo_arma=" + tipo_arma + '}';
    }
    
}
