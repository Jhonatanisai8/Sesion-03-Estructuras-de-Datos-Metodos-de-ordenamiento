package com.mycompany;

/**
 *
 * @author Jhonatan
 */
public class MetodoQuikShort {

    public static void main(String[] args) {
        System.out.println("\nMETODO QUICKSHORT");
        int num[] = {12, 10, 8, 5, 25, 17};
        System.out.println("\nDatos del arreglo tal cual: ");
        mostrar(num);
        quikShort(num, 0, 5);
        System.out.println("\nDatos Ordenados");
        mostrar(num);

    }

    public static void quikShort(int num[], int izq, int der) {

        int pivote = num[izq];
        int i = izq;
        int j = der;
        int aux;

        while (i < j) {
            //buscamos los valores menores
            while (num[i] <= pivote && i < j) {
                i++;
            }
            while (num[j] > pivote) {
                j--;
            }
            if (i < j) {
                aux = num[i];
                num[i] = num[j];
                num[j] = aux;
            }
        }

        num[izq] = num[j];
        num[j] = pivote;

        //empleamos recursividad
        if (izq < j - 1) {
            quikShort(num, izq, j - 1);
        }
        if (j + 1 < der) {
            quikShort(num, j + 1, der);
        }
    }

    public static void mostrar(int arreglo[]) {
        int total = arreglo.length;
        for (int i = 0; i < total; i++) {
            System.out.print(arreglo[i] + "-");
        }
    }

}
