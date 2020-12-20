/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan", 
            "Teresa", "Luis", "Mark", "Jennifer",
            "Alcides"};
        String inicial;
        char[] letra = new char[7];
        String[] estudiantes1 = {"","","","","","",""};
        String m;
        boolean bandera = true;
        while(bandera){
            System.out.println("Ingrese una letra");
            inicial = entrada.nextLine();
            m = inicial.toUpperCase();
            for (int i = 0; i < estudiantes.length; i++) {
                letra[i] = estudiantes[i].charAt(0);
                estudiantes1[i] = estudiantes1[i] + letra[i];
                if (m.equals(estudiantes1[i])) {
                    bandera = false;
                }
            }
                    
        }
        
        
    }

}
