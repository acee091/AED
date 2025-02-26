package Estrutura;

public class ExemploFor {
    public static void main(String[] args) {

        int multiplicador = 15;
        System.out.println("Tabuada do " + multiplicador);
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " X " + multiplicador + " = " + i * multiplicador);
        }
    }
}
