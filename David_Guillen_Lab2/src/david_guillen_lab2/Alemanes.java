package david_guillen_lab2;
public class Alemanes {
    private String alias;
    private int edad;
    private String casta;
    private int resistencia;
    private String tipo_arma;

    public Alemanes() {
    }

    public Alemanes(String alias, int edad, String casta, int resistencia, String tipo_arma) {
        this.alias = alias;
        this.edad = edad;
        this.casta = casta;
        this.resistencia = resistencia;
        this.tipo_arma = tipo_arma;
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

    @Override
    public String toString() {
        return "Alemanes{" + "alias=" + alias + ", edad=" + edad + ", casta=" + casta + ", resistencia=" + resistencia + ", tipo_arma=" + tipo_arma + '}';
    }
    
}
