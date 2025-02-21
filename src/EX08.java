import java.util.Scanner;

public class EX08 {
    public static void main(String[]args){
        System.out.print("Digite uma distância em metros: ");
        Scanner num = new Scanner(System.in);
        Double distancia = num.nextDouble();
        num.close();

        double cm = distancia * 100;
        System.out.print("A distância é de " + cm + "Cm");

    }
}


/*
dist = float(input("Digite uma distância em metros: "))
cm = dist * 100
print(f'Distância de {cm} Cm')
 */