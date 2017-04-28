package david_guillen_lab2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

    public class David_Guillen_Lab2 {
    public static void main(String[] args) {
        String opcion ="";
        ArrayList<Rusos> rusos = new ArrayList();
        ArrayList<Alemanes> alemanes = new ArrayList();
        ArrayList<Alumnos> alumnos = new ArrayList();
        while(!opcion.equals("f")){
            opcion = JOptionPane.showInputDialog(null, "Ingrese Opcion\n"
                    + "a). Reclutiar Ruso\n"
                    + "b). Reclutiar Aleman\n"
                    + "c). Reclutiar Alumno");
            if (opcion.equals("a")) {
                String nombre, id, tipo_arma;
                int edad, rango, resistencia;
                nombre = JOptionPane.showInputDialog("Ingrese Nombre del soldado");
                id = JOptionPane.showInputDialog("Ingrese ID del soldado");
                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad del soldado"));
                rango = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Rango del soldado"));
                resistencia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Resistecia del soldado"));
                tipo_arma = JOptionPane.showInputDialog("Ingrese Tipo de arma del soldado\n"
                        + "AK-47\n"
                        + "Revolver Navant\n"
                        + "RPG-7\n");
                rusos.add(new Rusos(nombre, id, edad, rango, resistencia, tipo_arma));
            }
            if (opcion.equals("b")) {
                String alias, casta, tipo_arma;
                int edad, resistencia;
                alias = JOptionPane.showInputDialog("Ingrese Alias del soldado");
                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad del soldado"));
                casta = JOptionPane.showInputDialog("Ingrese Casta del soldado");
                resistencia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Resistecia del soldado"));
                tipo_arma = JOptionPane.showInputDialog("Ingrese Tipo de arma del soldado\n"
                        + "MP 40\n"
                        + "MG42\n"
                        + "Walther P38\n");
                alemanes.add(new Alemanes(alias, edad, casta, resistencia, tipo_arma));
            }
            if (opcion.equals("c")) {
                String apodo, casta, mochila;
                int numero_cuenta, edad, resistencia, grado_academico;
                apodo = JOptionPane.showInputDialog("Ingrese Apodo del alumno");
                numero_cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero de cuenta del alumno"));
                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad del alumno"));
                resistencia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Resistecia del alumno"));
                grado_academico = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Grado academico del alumno"));
                mochila = JOptionPane.showInputDialog("Ingrese Objeto de la mochila del alumno\n"
                        + "Disco duro\n"
                        + "Control de Wii\n"
                        + "Laptop\n");
                alumnos.add(new Alumnos(apodo, numero_cuenta, edad, resistencia, grado_academico, mochila));
            }
        }
    }
    
}
