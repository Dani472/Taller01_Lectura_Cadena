/*
 esta clase arroja los resultados de numero de caracteres, palabras y espacios en blanco dentro de
una cadena de caracteres
 */
package taller.pkg01;

import java.util.Scanner;

/**
 * TALLER: 01
 *
 * @author * Daniel Muñoz * Diego Muñoz * Jaiver Lesmes
 * @version 1.1
 */
public class Taller01 {

    String Caracteres;
    char[] arrayChar;
/**
 * se realiza conteo de caracteres de la cadena 
 * @param x cadena de caracteres ingresada 
 * @return sumaCaracteres cuenta la cantidad de caracteres de la cadena
 */
    public static double ContarCaracteres(String x) {

        double sumaCaracteres = 0.0;
        char[] arrayChar = x.toCharArray();

        for (int i = 0; i < arrayChar.length; i++) {
            sumaCaracteres++;
        }
        System.out.println("Caracteres: " + sumaCaracteres);
        return sumaCaracteres;
    }
/**
 * se realiza conteo de palabras de la cadena 
 * @param y vector que contiene las palabras ingresadas en la cadena 
 * @return sumaPalabras cuenta la cantidad de palabras de la cadena
 */
    public static double ContarPalabras(String[] y) {

        double sumaPalabras = 0.0;
        for (int i = 0; i < y.length; i++) {
            if (y[i].length() != 0) {
                sumaPalabras++;
            }
        }
        System.out.println("Palabras: " + sumaPalabras);
        return sumaPalabras;
    }
/**
 * se realiza conteo de espacios de la cadena 
 * @param z cadena de caracteres ingresada 
 * @return sumaEspacios cuenta la cantidad de espacios en blanco de la cadena
 */
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
    /**
     * 
     * @param args 
     * llamada a los metodos donde se muestran sus resultados
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la cadena de caracteres:");
        String Cadena = teclado.nextLine();
        String[] VectorPalabra = Cadena.split(" ");
        ContarCaracteres(Cadena);
        ContarPalabras(VectorPalabra);
        ContarEspacios(Cadena);

        
    }

}
