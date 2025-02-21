import java.util.Scanner;

public class EX12 {
    public static void main(String[] args){
        System.out.print("Digite um valor do produto: ");
        Scanner prod = new Scanner(System.in);
        double produto = prod.nextDouble();

        double desc = produto * 0.95;

        System.out.print("O produto com desconto é de " + desc);
    }
}

/*
produto = float(input("Digite o valor do produto: "))
produtodesc = produto * 0.95
print(f'O produto com desconto é de R${produtodesc}')
 */