package practica1_uf5;

/**
 *
 * @author ramon
 */
public class Figura {

    public Figura(int numCostats, int... longitud) throws Exception {
        if (numCostats < 3) {
            throw new Exception("La longitud es molt baixa");
        } else {
            try {
                System.out.println("El numero de cares es de " + numCostats);
                for (int i = 0; i < numCostats; i++) {
                    System.out.println("El " + (i + 1) + " costat te una longitud de " + longitud[i]);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error, t'has passat del limit de cares!! ");
            }
        }
    }

    public int Perimetre(int numCostats, int... longitud) {
        int i = 0;
        int resultat = longitud[i] + longitud[i+1] + longitud[i+2] + longitud[i+3];

        return resultat;
    }
}
