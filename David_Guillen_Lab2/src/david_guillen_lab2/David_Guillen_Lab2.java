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
                    + "a). Reclutar Ruso\n"
                    + "b). Reclutar Aleman\n"
                    + "c). Reclutar Alumno\n"
                    + "d). Modificar Ruso\n"
                    + "e). Modificar Aleman\n"
                    + "f). Modificar Alumno\n"
                    + "g). Dar de alta a Ruso\n"
                    + "h). Dar de alta a Aleman\n"
                    + "i). Dar de alta a Alumno\n"
                    + "j). Simulacion");
            if (opcion.equalsIgnoreCase("a")) {
                String nombre, id, tipo_arma;
                int edad, rango, resistencia;
                nombre = JOptionPane.showInputDialog("Ingrese Nombre del soldado");
                id = JOptionPane.showInputDialog("Ingrese ID del soldado");
                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad del soldado"));
                rango = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Rango del soldado"));
                tipo_arma = JOptionPane.showInputDialog("Ingrese Tipo de arma del soldado\n"
                        + "AK-47\n"
                        + "Revolver Navant\n"
                        + "RPG-7\n");
                if (edad >= 18 ) {
                    if (tipo_arma.equalsIgnoreCase("RPG-7") && edad>=25) {
                        rusos.add(new Rusos(nombre, id, edad, rango, tipo_arma));
                    }else{
                        JOptionPane.showMessageDialog(null, "Edad no suficiente para equipar el RPG-7");
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Edad incorrecta");
                }
            }
            if (opcion.equalsIgnoreCase("b")) {
                String alias, casta, tipo_arma;
                int edad, resistencia;
                alias = JOptionPane.showInputDialog("Ingrese Alias del soldado");
                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad del soldado"));
                casta = JOptionPane.showInputDialog("Ingrese Casta del soldado");
                tipo_arma = JOptionPane.showInputDialog("Ingrese Tipo de arma del soldado\n"
                        + "MP 40\n"
                        + "MG42\n"
                        + "Walther P38\n");
                if (edad > 0) {
                    alemanes.add(new Alemanes(alias, edad, casta, tipo_arma));
                } else {
                    JOptionPane.showMessageDialog(null, "Edad incorrecta");
                }
            }
            if (opcion.equalsIgnoreCase("c")) {
                String apodo, casta, mochila;
                int numero_cuenta, edad, resistencia, grado_academico;
                apodo = JOptionPane.showInputDialog("Ingrese Apodo del alumno");
                numero_cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero de cuenta del alumno"));
                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad del alumno"));
                grado_academico = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Grado academico del alumno"));
                mochila = JOptionPane.showInputDialog("Ingrese Objeto de la mochila del alumno\n"
                        + "Disco duro\n"
                        + "Control de Wii\n"
                        + "Laptop\n");
                if (edad >= 16) {
                    alumnos.add(new Alumnos(apodo, numero_cuenta, edad, grado_academico, mochila));
                } else {
                    JOptionPane.showMessageDialog(null, "Edad incorrecta");
                }
            }
            if (opcion.equalsIgnoreCase("d")) {
                int t = 0;
                for (Rusos r : rusos) {
                    System.out.println(t+". "+r);
                    t++;
                }
                int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Posicion"));
                JOptionPane.showMessageDialog(null, "Ingrese Nuevos Datos");
                String nombre, id, tipo_arma;
                int edad, rango, resistencia;
                nombre = JOptionPane.showInputDialog("Ingrese Nombre del soldado");
                id = JOptionPane.showInputDialog("Ingrese ID del soldado");
                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad del soldado"));
                rango = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Rango del soldado"));
                tipo_arma = JOptionPane.showInputDialog("Ingrese Tipo de arma del soldado\n"
                        + "AK-47\n"
                        + "Revolver Navant\n"
                        + "RPG-7\n");
                rusos.set(pos, new Rusos(nombre, id, edad, rango, tipo_arma));
            }
            if (opcion.equalsIgnoreCase("e")) {
                int t = 0;
                for (Alemanes r : alemanes) {
                    System.out.println(t+". "+r);
                    t++;
                }
                int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Posicion"));
                JOptionPane.showMessageDialog(null, "Ingrese Nuevos Datos");
                String alias, casta, tipo_arma;
                int edad, resistencia;
                alias = JOptionPane.showInputDialog("Ingrese Alias del soldado");
                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad del soldado"));
                casta = JOptionPane.showInputDialog("Ingrese Casta del soldado");
                tipo_arma = JOptionPane.showInputDialog("Ingrese Tipo de arma del soldado\n"
                        + "MP 40\n"
                        + "MG42\n"
                        + "Walther P38\n");
                alemanes.set(pos, new Alemanes(alias, edad, casta, tipo_arma));
            }
            if (opcion.equalsIgnoreCase("f")) {
                int t = 0;
                for (Alumnos r : alumnos) {
                    System.out.println(t+". "+r);
                    t++;
                }
                int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Posicion"));
                JOptionPane.showMessageDialog(null, "Ingrese Nuevos Datos");
                String apodo, casta, mochila;
                int numero_cuenta, edad, resistencia, grado_academico;
                apodo = JOptionPane.showInputDialog("Ingrese Apodo del alumno");
                numero_cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero de cuenta del alumno"));
                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad del alumno"));
                grado_academico = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Grado academico del alumno"));
                mochila = JOptionPane.showInputDialog("Ingrese Objeto de la mochila del alumno\n"
                        + "Disco duro\n"
                        + "Control de Wii\n"
                        + "Laptop\n");
                alumnos.set(pos, new Alumnos(apodo, numero_cuenta, edad, grado_academico, mochila));
            }
            if (opcion.equalsIgnoreCase("g")) {
                int t = 0;
                for (Rusos r : rusos) {
                    System.out.println(t+". "+r);
                    t++;
                }
                int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Posicion"));
                rusos.remove(pos);
            }
            if (opcion.equalsIgnoreCase("g")) {
                int t = 0;
                for (Alemanes r : alemanes) {
                    System.out.println(t+". "+r);
                    t++;
                }
                int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Posicion"));
                alemanes.remove(pos);
            }
            if (opcion.equalsIgnoreCase("i")) {
                int t = 0;
                for (Alumnos r : alumnos) {
                    System.out.println(t+". "+r);
                    t++;
                }
                int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Posicion"));
                alumnos.remove(pos);
            }
            if (opcion.equalsIgnoreCase("j")) {
                int token = 0;
                while(token==1){
                    //---Primera Ronda---
                    
                }
            }
        }
    }
    
}
