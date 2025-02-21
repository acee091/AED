import java.util.Scanner;

public class EX07 {
    public static void main(String[] args){
        System.out.print("Digite um número: ");
        Scanner num = new Scanner(System.in);
        int numero = num.nextInt();
        num.close();

        int dobro = numero*2;
        int terco = numero / 3;

        System.out.println("O dobro de"+ numero +" é " + dobro);
        System.out.println("A terça parte de "+ numero+ " é" + terco);


    }
}

/*
num1 = float(input("Digite um número: "))
print(f'O dobro de {num1} é {num1 * 2}')
print(f'A terça parte de {num1} é {num1 / 3}')
 */