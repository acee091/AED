import java.util.Scanner;

public class EX02 {
    public static void main(String[] args){
        System.out.println("informe  o seu nome: ");
        Scanner no = new Scanner(System.in); //no = variavel que é armazenada no nome
        String nome = no.nextLine();
        no.close(); //Fechar estrutura do scanner, break que para a variavel para nao aceitar mais nada do teclado
        System.out.println("Olá " + nome + " é um prazer te conhecer");
    }
}
