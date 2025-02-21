import java.util.Scanner;

public class EX14 {
    public static void main(String[] args){
        System.out.print("Digite os KMS percorridos: ");
        Scanner classKM = new Scanner(System.in);
        double KM = classKM.nextDouble();

        System.out.print("Quantos dias? ");
        Scanner classDias = new Scanner(System.in);
        int dias = classDias.nextInt();
        classDias.close();

        double valorKm = KM * 0.2;
        int valorDIAS = dias * 90;
        double total = valorKm + valorDIAS;

        System.out.print("O valor total é de R$" + total);
    }
}

/*
km = int(input("Digite os KMS percorridos: "))
dias = int(input("Quantos dias? "))
valorKM = km * 0.20
valorDIAS = dias * 90
total = valorKM + valorDIAS
print(f'O valor total é de R${total}')
 */