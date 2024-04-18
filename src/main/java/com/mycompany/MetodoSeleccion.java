package com.mycompany;

/**
 *
 * @author Jhonatan
 */
public class MetodoSeleccion {

    public static void main(String[] args) {
        System.out.println("");
        int arreglo[] = {12, 10, 8, 5, 25, 17};
        System.out.println("Datos tal cual del arreglo");
        mostrarArreglo(arreglo);
        System.out.println("\nDatos del arreglo Ordeando");
        ordenarMetodoClaseAscendente(arreglo);
    }

    public static void ordenarMetodoClaseAscendente(int arreglo[]) {
        int longitud = arreglo.length;
        int mayor, pos;
        int contador = 0;
        for (int j = 0; j < longitud; j++) {
            mayor = arreglo[j];
            pos = j;
            for (int i = j + 1; i < longitud; i++) {
                if (arreglo[i] < mayor) {
                    mayor = arreglo[i];
                    pos = i;
                }
                contador++;
            }
            arreglo[pos] = arreglo[j];
            arreglo[j] = mayor;
        }
        mostrarArreglo(arreglo);
        System.out.println("\nNumero de iteraciones (Metodo Seleccion): " + contador);
    }

    public static void mostrarArreglo(int arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
    }
}
