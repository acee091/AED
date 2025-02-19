import jdk.dynalink.beans.StaticClass;

public class Soma {
    public static void main(String[] args){
        int x = 0;
        int y = 0;

        int soma = x + y;

        System.out.println("A soma é -> " + soma);
        if (soma != 0){
            System.out.println("O valor -> " + soma + "Diferente de zero");
        }else
        {
            System.out.println("A soma é igual a " + soma);
        }
    }
}
