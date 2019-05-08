package code;

/**
 *
 * @author Andrés
 */
public class Quicksort_Mejorado {

    public int Mediana3(int arr[], int ini, int fin) {
        int mitad = (ini + fin) / 2;
        int a, b, c;
        int mediana;
        a = arr[ini];
        b = arr[mitad];
        c = arr[fin];

        if (a < b) {
            if (b < c) {
                mediana = mitad;
            } else {
                if (a < c) {
                    mediana = fin;
                } else {
                    mediana = ini;
                }
            }
        } else {
            if (c < b) {
                mediana = mitad;
            } else {
                if (c < a) {
                    mediana = fin;
                } else {
                    mediana = ini;
                }
            }
        }
//        int aux = arr[mediana];
//        arr[mediana] = arr[fin];
//        arr[fin] = mediana;
        return mediana;
    }

//    public void Mediana3 (int arr[], int izq, int der){
//        
//        int mitad = (izq+der)/2;
//        
//        if (arr[izq] > arr[mitad]){
//            int auxx = arr[izq];
//            arr[izq] = arr[mitad];
//            arr[mitad] = auxx;
//        }
//            
//	if (arr[izq] > arr[der]){
//            int aux = arr[izq];
//            arr[izq] = arr[der];
//            arr[der] = aux;
//        }
//	if (arr[mitad] > arr[der]) {
//            int aux2 = arr[mitad];
//            arr[mitad] = arr[der];
//            arr[der] = aux2;
//            
//            int aux3 = arr[mitad];
//            arr[mitad] = arr[der-1];
//            arr[der-1] = aux2;
//	}
//        
//    }
    /* This function takes last element as pivot, 
       places the pivot element at its correct 
       position in sorted array, and places all 
       smaller (smaller than pivot) to left of 
       pivot and all greater elements to right 
       of pivot */
    public int partition(int arr[], int low, int high) {
        //Mediana3(arr, low, high);
        //int mitad = (low+high)/2;
        
        int mitad = Mediana3(arr, low, high);
        
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element 
        for (int j = low; j < high; j++) {
            // If current element is smaller than or 
            // equal to pivot 
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j] 
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    /* The main function that implements QuickSort() 
      arr[] --> Array to be sorted, 
      low  --> Starting index, 
      high  --> Ending index */
    public void sort(int arr[], int low, int high) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before 
            // partition and after partition 
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
