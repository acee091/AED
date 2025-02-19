import java.util.Scanner;

public class EX04 {
    public static void main(String[] args){
        System.out.println("Digite um valor: ");
        Scanner v1 = new Scanner(System.in);
        Integer valor = v1.nextInt();

        System.out.println("Digite outro valor: ");
        Scanner v2 = new Scanner(System.in);
        Integer valor2 = v2.nextInt();
        v2.close();
        int total = valor + valor2;

        System.out.println("A soma entre " + valor + " e " + valor2 + " é igual a " + total);
    }
}


/*n1 = int(input("Digite um valor: "))
n2 = int(input("Digite outro valor: "))
print(f"A soma entre {n1} e {n2} é igual a {n1 + n2}.")
 */