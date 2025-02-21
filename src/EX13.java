import java.util.Scanner;

public class EX13 {
    public static void main(String[] args){
        System.out.print("digite o salário: ");
        Scanner sal = new Scanner(System.in);
        double salario = sal.nextDouble();
        sal.close();

        double aumento = salario * 1.15;
        System.out.print("Seu salário com aumento de 15% é de " + aumento);

    }
}

/*
salar = float(input("Digite o salário: "))
aumento = salar * 1.15
print(f'Seu salário com aumento de 15% é de {aumento}')
 */