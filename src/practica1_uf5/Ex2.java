/*2. Crear una classe de nom Figura on el constructor rebi un número sencer amb el nombre de
costats de la figura i la longitud de cada costat. Com el nombre de valors dels costats és
variable, utilitzeu el pas de paràmetres de mida indefinida. */
package practica1_uf5;

/**
 *
 * @author ramon
 */
public class Ex2 {

    public static void main(String[] args) throws Exception {
        Figura f = new Figura(4, 1, 2, 3, 4);
        System.out.println("El Perimetre = " + f.Perimetre(4, 1, 2, 3, 4));
    }
}
