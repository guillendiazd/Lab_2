package david_guillen_lab2;

import javax.swing.JOptionPane;

public class Alemanes {
    private String alias;
    private int edad;
    private String casta;
    private int resistencia;
    private String tipo_arma;
    private int poder_fuego;
    public Alemanes() {
    }

    public Alemanes(String alias, int edad, String casta, String tipo_arma) {
        this.alias = alias;
        this.edad = edad;
        this.casta = casta;
        this.resistencia = 8 * edad;
        this.tipo_arma = tipo_arma;
        if (tipo_arma.equalsIgnoreCase("MP 40")) {
            poder_fuego = 25;
        }else if (tipo_arma.equalsIgnoreCase("MG42")) {
            poder_fuego = 32;
        }else if (tipo_arma.equalsIgnoreCase("Walther P38")) {
            poder_fuego = 11;
        }
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCasta() {
        return casta;
    }

    public void setCasta(String casta) {
        this.casta = casta;
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
        return "Alemanes{" + "alias=" + alias + ", edad=" + edad + ", casta=" + casta + ", resistencia=" + resistencia + ", tipo_arma=" + tipo_arma + '}';
    }
    
}
