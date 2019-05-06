package pruebas;

import code.*;

/**
 *
 * @author Andrés
 */
public class Sorting {

    public static void main(String[] args) {
        int n = 1000000;
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * n) + 1;
            //System.out.print(array[i] + " - ");
        }
        //llamado de metodos xd
        Insertionsort i = new Insertionsort();
        Mergesort m = new Mergesort();
        Quicksort q = new Quicksort();
        Radixsort r = new Radixsort();

        i.sort(array);
        System.out.println("Sorted insertion array \n");
        i.printArray(array);
    }

}
