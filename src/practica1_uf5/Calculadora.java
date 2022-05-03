/*3. Implementar una classe Calculadora amb un mètode main que realitzi les operacions
típiques d'una calculadora (+,-,*,/). A l'iniciar-se haurà de demanar a l'usuari tres valors en
l'ordre següent: operació (+,-,*,/), operand1 i operand2. Tot seguit mostrarà el resultat de
l'operació. Anirà demanant operacions fins que teclegi el caràcter de sortir. Utilitzarem
aritmètica sencera.*/
package practica1_uf5;

import java.util.Scanner;

/**
 *
 * @author ramon
 */
public class Calculadora {

    public static void main(String[] args) throws Exception {
        Calculadora();
    }

    public static int Calculadora() throws Exception {
        int resultat = 0, operador1, operador2;
        boolean comprovar = true;
        String simbol = null;
        Scanner s = new Scanner(System.in);
        while (comprovar) {
            System.out.println("Dona la operacio que vols fer (+,-,*,/) o Z per a finalitzar");
            s.nextLine();
            simbol = s.nextLine();
            switch (simbol) {
                case "+":
                    try {
                    System.out.print("Quin es el primer valor? ");
                    operador1 = Integer.parseInt(s.next());
                    System.out.print("Quin es el segon valor? ");
                    operador2 = Integer.parseInt(s.next());
                    resultat = operador1 + operador2;
                    System.out.println("El resultat de l'operacio es : " + resultat);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("NumberFormatException occured");
                    System.out.println("Torna-ho a probar");
                }
                case "-":
                    try {
                    System.out.print("Quin es el primer valor? ");
                    operador1 = Integer.parseInt(s.next());
                    System.out.print("Quin es el segon valor? ");
                    operador2 = Integer.parseInt(s.next());
                    resultat = operador1 - operador2;
                    System.out.println("El resultat de l'operacio es : " + resultat);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("NumberFormatException occured");
                    System.out.println("Torna-ho a probar");
                }
                case "*":
                    try {
                    System.out.print("Quin es el primer valor? ");
                    operador1 = Integer.parseInt(s.next());
                    System.out.print("Quin es el segon valor? ");
                    operador2 = Integer.parseInt(s.next());
                    resultat = operador1 * operador2;
                    System.out.println("El resultat de l'operacio es : " + resultat);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("NumberFormatException occured");
                    System.out.println("Torna-ho a probar");
                }
                case "/":
                    try {
                    System.out.print("Quin es el primer valor? ");
                    operador1 = Integer.parseInt(s.next());
                    System.out.print("Quin es el segon valor? ");
                    operador2 = Integer.parseInt(s.next());
                    try {
                        resultat = operador1 / operador2;
                        System.out.println("El resultat de l'operacio es : " + resultat);
                        break;
                    } catch (ArithmeticException e) {
                        System.out.println("ArithmeticException occured");
                        System.out.println("La divisio es entre zero");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("NumberFormatException occured");
                    System.out.println("Torna-ho a probar");
                }
                case "Z":
                    comprovar = false;
                    break;
                default:
                    throw new Exception("L'operador no existeix, torna-ho a probar");
            }
        }
        return resultat;
    }
}
