import java.util.Scanner;

public class EX03{
    public static void main(String[] args){
        System.out.println("Nome do funcionário: ");
        Scanner no = new Scanner(System.in);
        String nome = no.nextLine();

        System.out.println("Digite o salário: ");
        Scanner sal = new Scanner(System.in);
        Double salario = sal.nextDouble(); //next.Double() pra
        sal.close();

        System.out.println("O funcionário " + nome + "tem um salário de "  + salario + " em junho");
    }
}
