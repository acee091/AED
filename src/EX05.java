import java.util.Scanner;

public class EX05 {
    public static void main(String[] args){ //main = função principal, tudo no java usa sobre funções
        System.out.print("Nota 1: ");
        Scanner n1 = new Scanner(System.in);
        Double nota1 = n1.nextDouble();

        System.out.print("Nota 2: ");
        Scanner n2 = new Scanner(System.in);
        Double nota2 = n2.nextDouble();
        n2.close();
        double media = (nota1 + nota2) / 2;

        System.out.printf("A média entre " + nota1 + " e " + nota2 + " é igual a " + media);
    }
}

/* nota1 = float(input("Nota 1: "))
nota2 = float(input("Nota 2: "))
media = (nota1 + nota2) / 2
print(f'A média entre {nota1} e {nota2} é igual a {media}')
*/