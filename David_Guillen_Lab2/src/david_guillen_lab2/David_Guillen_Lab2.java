package david_guillen_lab2;

import java.util.ArrayList;
import java.util.Iterator;
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
                        + "a) AK-47\n"
                        + "b) Revolver Navant\n"
                        + "c) RPG-7\n");
                if (tipo_arma.equalsIgnoreCase("a")) {
                    tipo_arma = "AK-47";
                } else if (tipo_arma.equalsIgnoreCase("b")){
                    tipo_arma = "Revolver Navant";
                } else if(tipo_arma.equalsIgnoreCase("c")){
                    tipo_arma = "RPG-7";
                }else{
                    JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
                }
                if (edad >= 18 ) {
                    if (tipo_arma.equalsIgnoreCase("RPG-7") && edad<25) {
                        JOptionPane.showMessageDialog(null, "Edad no suficiente para equipar el RPG-7");
                    }else{
                        rusos.add(new Rusos(nombre, id, edad, rango, tipo_arma));
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
                        + "a) MP 40\n"
                        + "b) MG42\n"
                        + "c) Walther P38\n");
                if (tipo_arma.equalsIgnoreCase("a")) {
                    tipo_arma = "MP 40";
                } else if (tipo_arma.equalsIgnoreCase("b")){
                    tipo_arma = "MG42";
                } else if(tipo_arma.equalsIgnoreCase("c")){
                    tipo_arma = "Walter p38";
                }else{
                    JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
                }
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
                        + "a) Disco duro\n"
                        + "b) Control de Wii\n"
                        + "c) Laptop\n");
                if (mochila.equalsIgnoreCase("a")) {
                    mochila = "Disco duro";
                } else if (mochila.equalsIgnoreCase("b")){
                    mochila = "Control de Wiit";
                } else if(mochila.equalsIgnoreCase("c")){
                    mochila = "Laptop";
                }else{
                    JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
                }
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
                        + "a) AK-47\n"
                        + "b) Revolver Navant\n"
                        + "c) RPG-7\n");
                 if (tipo_arma.equalsIgnoreCase("a")) {
                    tipo_arma = "AK-47";
                } else if (tipo_arma.equalsIgnoreCase("b")){
                    tipo_arma = "Revolver Navant";
                } else if(tipo_arma.equalsIgnoreCase("c")){
                    tipo_arma = "RPG-7";
                }else{
                    JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
                }
                if (edad >= 18 ) {
                    if (tipo_arma.equalsIgnoreCase("RPG-7") && edad<25) {
                        JOptionPane.showMessageDialog(null, "Edad no suficiente para equipar el RPG-7");
                    }else{
                        rusos.add(new Rusos(nombre, id, edad, rango, tipo_arma));
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Edad incorrecta");
                }
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
                        + "a) MP 40\n"
                        + "b) MG42\n"
                        + "c) Walther P38\n");
                 if (tipo_arma.equalsIgnoreCase("a")) {
                    tipo_arma = "MP 40";
                } else if (tipo_arma.equalsIgnoreCase("b")){
                    tipo_arma = "MG42";
                } else if(tipo_arma.equalsIgnoreCase("c")){
                    tipo_arma = "Walter p38";
                }else{
                    JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
                }
                if (edad > 0) {
                    alemanes.add(new Alemanes(alias, edad, casta, tipo_arma));
                } else {
                    JOptionPane.showMessageDialog(null, "Edad incorrecta");
                }
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
                        + "a) Disco duro\n"
                        + "b) Control de Wii\n"
                        + "c) Laptop\n");
                if (mochila.equalsIgnoreCase("a")) {
                    mochila = "Disco duro";
                } else if (mochila.equalsIgnoreCase("b")){
                    mochila = "Control de Wiit";
                } else if(mochila.equalsIgnoreCase("c")){
                    mochila = "Laptop";
                }else{
                    JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
                }
                if (edad >= 16) {
                    alumnos.add(new Alumnos(apodo, numero_cuenta, edad, grado_academico, mochila));
                } else {
                    JOptionPane.showMessageDialog(null, "Edad incorrecta");
                }
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
            if (opcion.equalsIgnoreCase("h")) {
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
                 //---Primera Ronda---
                int pos = 0;
                for (Alemanes a : alemanes) {
                    int res = a.getResistencia() - rusos.get(pos).getPoder_fuego();
                    a.setResistencia(res);
                    pos++;
                }
                pos = 0;
                for (Alumnos al : alumnos) {
                    int res = al.getResistencia() - rusos.get(pos).getPoder_fuego();
                    al.setResistencia(res);
                    pos++;
                }
                //---Segunda Ronda---
                pos = 0;
                for (Rusos a : rusos) {
                    int res = a.getResistencia() - alemanes.get(pos).getPoder_fuego();
                    a.setResistencia(res);
                    pos++;
                }
                pos = 0;
                for (Alumnos al : alumnos) {
                    int res = al.getResistencia() - alemanes.get(pos).getPoder_fuego();
                    al.setResistencia(res);
                    pos++;
                }
                //---Tercera Ronda---
                pos = 0;
                for (Rusos a : rusos) {
                    int res = a.getResistencia() - alumnos.get(pos).getPoder_fuego();
                    a.setResistencia(res);
                    pos++;
                }
                pos = 0;
                for (Alemanes al : alemanes) {
                    int res = al.getResistencia() - alumnos.get(pos).getPoder_fuego();
                    al.setResistencia(res);
                    pos++;
                }
            }
        }
    }
}


