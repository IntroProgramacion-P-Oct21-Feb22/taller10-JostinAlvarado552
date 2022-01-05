/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        double[][] datos = new double[2][2];
        double datosingresados;
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < datos.length; i++) {
            for (int j = 1; j < datos[i].length; j++) {
                System.out.println("Ingrese valores de la primera fila");
                datosingresados = entrada.nextDouble();
                datos[i][j] = datosingresados;

            }
        }

    }
}
