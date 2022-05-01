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

    public static void main(String[] args) {
        Calculadora();
    }

    public static int Calculadora() {
        Scanner s = new Scanner(System.in);
        System.out.println("Dona la operacio que vols fer (+,-,*,/)");
        String simbol = s.nextLine();
        System.out.println("Quin es el primer valor?");
        int operador1 = s.nextInt();
        System.out.println("Quin es el segon valor?");
        int operador2 = s.nextInt();

        return 0;
    }
}
