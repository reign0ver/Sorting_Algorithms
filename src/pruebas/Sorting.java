package pruebas;

import code.*;

/**
 *
 * @author Andrés
 */
public class Sorting {

    public static void main(String[] args) {
        int n = 10000000;
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
        Quicksort_Mejorado qm = new Quicksort_Mejorado();
        Quicksortxd qxd = new Quicksortxd();
        
        //m.sort(array, 0, 999);
        
        //q.sort(array, 0, 9999999);
        qm.sort(array, 0, 999999);        
        //qxd.quicksortMedianaDeTres(array, 0, 99999999);
        //i.printArray(array);
    }

}
