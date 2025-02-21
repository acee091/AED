import java.util.Scanner;

public class EX09 {
    public static void main(String[]args){
        System.out.print("Digite o dinheiro em real: ");
        Scanner dinheiro = new Scanner(System.in);
        Double real = dinheiro.nextDouble();
        dinheiro.close();

        double dolar = real * 3.45;

        System.out.print("Você pode comprar $" + dolar);

    }

}

/*
real = float(input("Dinheiro em real: "))
dolar = real * 3.45
print(f'Você pode comprar ${dolar}')
 */