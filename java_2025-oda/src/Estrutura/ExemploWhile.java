/**
 *
 *  Desenvolvendo uma tabuada somente com a estrutura While
 *
 */

package Estrutura;

public class ExemploWhile {

    public static void main(String[] args) {
        int mult = 0;
        int multiplicador = 15;

        while(mult <= 10){

            int resultado = mult * multiplicador;
            System.out.println(multiplicador + " X " + mult + " = " + resultado);
            mult++;


        }
    }


}
