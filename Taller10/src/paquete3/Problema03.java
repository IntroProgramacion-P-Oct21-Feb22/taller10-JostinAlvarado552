/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {
        String[][] notasCualitativas = new String[3][3];
        double[][] notasCuantitativas = {{7.1, 8, 10}, {3, 7, 9}, {10, 9, 2.1}};
        String cualitativo = "";
        double nota = 0;

        for (int i = 0; i < notasCualitativas.length; i++) {
            for (int j = 1; j < notasCuantitativas[i].length; j++) {
                nota = notasCuantitativas[i][j];
                if (nota >= 0 && nota <= 2.9) {
                    cualitativo = "Insuficiente";
                } else {
                    if (nota >= 3 && nota <= 4.9) {
                        cualitativo = "Regular";
                    } else {
                        if (nota >= 5 && nota <= 7.9) {
                            cualitativo = "Buena";
                        } else {
                            if (nota >= 8 && nota <= 9.5) {
                                cualitativo = "Muy buena";
                            } else {
                                if (nota >= 9.6 && nota <= 10) {
                                    cualitativo = "Sobresaliente";
                                }
                            }
                        }
                    }

                }
                notasCualitativas[i][j] = cualitativo;
                System.out.println(cualitativo);
            }

        }
    }
}
