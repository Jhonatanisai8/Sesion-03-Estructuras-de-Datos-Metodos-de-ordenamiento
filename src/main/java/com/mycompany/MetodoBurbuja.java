package com.mycompany;

/**
 *
 * @author Jhonatan
 */
public class MetodoBurbuja {

    public static void main(String[] args) {

        System.out.println("METODO BURBUJA");
        int arreglo[] = {12, 10, 8, 5, 25, 17};
        mostrar(arreglo);

        int total = arreglo.length;
        int aux;
        int contador = 0;
        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total; j++) {
                if (arreglo[i] > arreglo[i + 1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
                contador++;
            }
        }
        System.out.println("Arreglo Ordenado");
        mostrar(arreglo);
        System.out.println("\nNumero de Iteraciones (Metodo Burbuja): " + contador);
    }

    public static void mostrar(int arreglo[]) {
        int total = arreglo.length;
        System.out.println("Mostrando los datos");
        for (int i = 0; i < total; i++) {
            System.out.print(arreglo[i] + "-");
        }
    }

}
