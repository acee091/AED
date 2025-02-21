import java.util.Scanner;

public class EX11 {
    public static void main(String[] args){
        System.out.print("Valor de A: ");
        Scanner ClassA = new Scanner(System.in);
        Double A = ClassA.nextDouble();

        System.out.print("Valor de B: ");
        Scanner ClassB = new Scanner(System.in);
        Double B = ClassB.nextDouble();

        System.out.print("Valor de C: ");
        Scanner ClassC = new Scanner(System.in);
        double C = ClassC.nextDouble();
        ClassC.close();
        /*
        Double delta = B**2.0 - 4.0 * A * C;
        System.out.print("Δ = " + B + "²" + "- 4*" + A + "*" + C);
        System.out.print("Δ = " + delta);
         */
    }
}

/*
A = float(input("Valor de A"))
B = float(input("Valor de B"))
C = float(input("Valor de C"))
delta = B**2 - (4 * A * C)
print(f'Δ = {B}² - 4x{A}*{C}')
print(f'Δ = {delta}')
 */