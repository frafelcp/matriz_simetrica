/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matSime;

import java.util.Scanner;

//crear y cargar una matrix y decir si es simetrica

/**
 *
 * @author Felix Castro
 */
public class matrSime {
    public static void main(String[] args) {
        //leer por teclado y consola
        Scanner entrada = new Scanner(System.in);
        
        //definimos variables
        int [][] numeros;
        int filas;
        int columnas;
        boolean simetria = true;
        
        //cantidad de filas
        System.out.println("Ingrese cuantas filas requiere");
        filas = entrada.nextInt();
        
        System.out.println();
        
        //cantidad de columnas
        System.out.println("Ingrese cuantas columnas requiere");
        columnas = entrada.nextInt();
        
        //inicializacion de vector
        numeros = new int[filas][columnas];
        
        System.out.println();
        
        //llenar matriz
        System.out.println("Entrada de datos en la matriz");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("Matriz[" + i +"][" + j + "]: ");
                numeros[i][j] = entrada.nextInt();
            }
        }
        
        if (filas == columnas) {
            int k;
            int l;
            k = 0;
            while (k < filas && simetria == true) {                
                l = 0;
                while (l < l && simetria == true) {                    
                    if (numeros[k][l] != numeros[l][k]) {
                        simetria = false;
                    }
                    l++;
                }
                k++;
            }
            
            if (simetria == true) {
                System.out.println("Matriz simetrica");
            } else {
                System.out.println("Matriz no simetrica");
            }
        }else{
            System.out.println("Matriz no simetrica");
        }
    }
}
