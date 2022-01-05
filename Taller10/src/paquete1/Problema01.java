/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int fila;
        int columna;
        double sumanotas;
        double promedio;
        double[][] notas = {{9, 10, 7, 8}, {10, 5, 7, 9}, {7, 9.4, 10, 9}};
        int divisor = 4;
        String[] Estudiantes = {"Jerry ponce", "Gabriela Lewis",
            "David Bell"};

        for (fila = 0; fila < Estudiantes.length; fila++) {
            sumanotas = 0;
            for (columna = 0; columna <= notas.length; columna++) {
                sumanotas = sumanotas + notas[fila][columna];

            }
            promedio = sumanotas / divisor;

            System.out.printf("Estudiante: %s tiene un promedio de %.2f\n",
                    Estudiantes[fila],
                    promedio);
        }

    }

}
