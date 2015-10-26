/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import clases.Comandos;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Comandos cm = new Comandos();

//        cm.setDirectorioActual("C:\\");
//        System.out.println(cm.getDirectorioActual());

//        System.out.println(cm.getDirectorioActual());
//        System.out.println(cm.crearCarpeta("Juan"));
//        System.out.println(cm.renombrarCarpeta("Juan", "Pedro"));
//        System.out.println(cm.eliminarCarpeta("Juan"));
//        System.out.println(cm.eliminarCarpeta("Pedro"));
//        cm.buscarDirectorio("Ped");
//        cm.avanzarUnDirectorio("Jhon");
//        System.out.println(cm.getDirectorioActual());
//        cm.regresarUnDirectorio();
//        System.out.println(cm.getDirectorioActual());
//        cm.setDirectorioActual("C:\\");
//        System.out.println(cm.getDirectorioActual());
//        cm.crearArchivo("jhonatan.txt");
//        cm.renombrarArchivo("jhonatan.txt", "jhon.txt");
//        cm.renombrarArchivo("jhon.txt", "jhony.txt");
//        cm.editarArchivo("jhony.txt", "Hola");
//        cm.eliminarArchivo("jhony.txt");
//
        System.out.println("Empezamos el programa");
        String entradaTeclado = "";
        Scanner entradaEscaner = new Scanner(System.in); //Creación de un objeto Scanner
        while (true) {
            System.out.print(cm.getDirectorioActual() + ">");
            entradaTeclado = entradaEscaner.nextLine(); //Invocamos un método sobre un objeto Scanner
            String[] comandoCompleto = entradaTeclado.split(" ");
            switch (comandoCompleto.length) {

                case 1:
                    if (comandoCompleto[0].equals("")) {
                        break;
                    }
                    cm.ejecutarComado(comandoCompleto[0]);
                    break;
                case 2:
                    cm.ejecutarComado(comandoCompleto[0], comandoCompleto[1]);

                    break;
                case 3:
                    cm.ejecutarComado(comandoCompleto[0], comandoCompleto[1], comandoCompleto[2]);

                    break;
                default:
                    throw new AssertionError();
            }

        }
    }

}
