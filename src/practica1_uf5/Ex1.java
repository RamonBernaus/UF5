/* 1. Programar una classe que divideixi dos números sencers demanats a l'usuari por tecla i
mostri per pantalla el resultat (aritmètica sencera). Capturar un possible error de conversió de
cadena a número (excepció NumberFormatException), en aquest cas cal convidar a l'usuari a
introduir de nou el número. Capturar també la possible divisió entre zero (excepció
ArithmeticException) informant a l'usuari de l'error. Cal llegir les dades de teclat tal com
s’indica a continuació per a generar l'excepció NumberFormatException:
num = Integer.parseInt(input.next());
 */
package practica1_uf5;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        System.out.println("El resultat entre la divisio del nombres es: " + DividirNumeros());
    }

    public static int DividirNumeros() {
        Scanner s = new Scanner(System.in);
        int num1 = 1, num2 = 1, result = 1;
        boolean comprovar = true;
        boolean comprovar2 = true;
        while (comprovar2) {
            while (comprovar) {
                try {
                    System.out.print("Dona un numero enter ");
                    num1 = Integer.parseInt(s.next());
                    System.out.print("Dona un segon numero enter ");
                    num2 = Integer.parseInt(s.next());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("NumberFormatException occured");
                    System.out.println("Torna-ho a probar");
                }
            }
            try {
                result = num1 / num2;
                break;
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException occured");
                System.out.println("La divisio es entre zero");
            }
        }

        return result;
    }
}
