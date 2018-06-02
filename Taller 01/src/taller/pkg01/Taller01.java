/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.pkg01;

import java.util.Scanner;

/**
 * TALLER: 01
 *
 * @author xxx
 * @version 1.0
 */
public class Taller01 {

    String Caracteres;
    char[] arrayChar;

    public static double ContarCaracteres(String x) {

        double sumaCaracteres = 0.0;
        char[] arrayChar = x.toCharArray();

        for (int i = 0; i < arrayChar.length; i++) {
            sumaCaracteres++;
        }
        System.out.println("Caracteres: " + sumaCaracteres);
        return sumaCaracteres;
    }

    public static double ContarPalabras(String[] a) {

        double sumaPalabras = 0.0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() != 0) {
                sumaPalabras++;
            }
        }
        System.out.println("Palabras: " + sumaPalabras);
        return sumaPalabras;
    }

    public static double ContarEspacios(String z) {

        double sumaEspacios = 0.0;
        char[] arrayChar = z.toCharArray();

        for (int i = 0; i < arrayChar.length; i++) {
            if (arrayChar[i] == ' ') {
                sumaEspacios++;
            }
        }
        System.out.println("Espacios: " + sumaEspacios);
        return sumaEspacios;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la cadena de caracteres:");
        String Cadena = teclado.nextLine();
        String[] VectorPalabra = Cadena.split(" ");
        ContarCaracteres(Cadena);
        ContarPalabras(VectorPalabra);
        ContarEspacios(Cadena);

        //System.out.println("Caracteres -> " + Cadena.length());        
        //System.out.println("Espacios -> " + (d + c - 1));
    }

}
