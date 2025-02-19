import java.util.Scanner;

public class Media {
    public static void main(String[] args){
        int numero;
        int soma = 0;
        int cont = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número maior que 0");

        while((numero = in.nextInt()) >=0){
            soma+= numero;
            cont++;
        }

        int media = soma/cont;

        System.out.println("A média dos números é " + media);

    }
}
