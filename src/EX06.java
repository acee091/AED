import java.util.Scanner;

public class EX06 {
    public static void main(String[] args){
        System.out.println("Digite um número");
        Scanner num = new Scanner(System.in);
        Integer n1 = num.nextInt();
        num.close();

        int antecessor = n1 - 1;
        int sucessor = n1 + 1;

        System.out.print("O antecessor é " + antecessor);
        System.out.print("O sucessor é " + sucessor);
    }
}

/* num = int(input("Digite um número: "))
print(f'O antecessor é {num - 1}')
print(f'O sucessor é {num + 1}')
*/