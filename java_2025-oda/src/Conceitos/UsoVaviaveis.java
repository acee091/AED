package Conceitos;

public class UsoVaviaveis {
    public static void main(String[] args) {

        // Exemplo 01
        int numero;
        numero = 10;

        // Exemplo 02
        int num = 10;

        // neste caso somamos as duas variáveis
        System.out.println(num + numero );

        /**
         * Tipos de variáveis que vamos aprender ao longo do curso
         * byte
         * short
         * int
         * long
         * float
         * double
         * char
         * boolean
         */

        // Um exemplo utilizando Boolean (0 - 1 / false ou true)

        //Quando perguntamos se uma criança é menino ou menina

        //boolean menina = true;
        boolean menina = false; // Criar uma variável booleana

        if (menina){ //verifica se menina == true e exibe o print
            System.out.print(" Sou Menina ");
        }
        else { //se menina == false exibe o print
            System.out.print(" Sou Menino ");
        }


    }
}
