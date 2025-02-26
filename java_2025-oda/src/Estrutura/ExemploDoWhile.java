package Estrutura;

public class ExemploDoWhile {
    public static void main(String[] args) {
        int multiplicador = 0;
        int mult = 2;
        int resultado = 0;
        do{
            System.out.println(multiplicador + " X " + mult + " = " + resultado);
            multiplicador++;
            resultado = multiplicador * mult;
        }
        while(multiplicador <= 10);{
            System.out.println("Tabuada finalizada");
        }



    }
}
