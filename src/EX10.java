import java.util.Scanner;
public class EX10 {
    public static void main(String[] args){
        System.out.print("Digite a altura: ");
        Scanner alt = new Scanner(System.in);
        Double altura = alt.nextDouble();
        System.out.print("Digite a largura: ");
        Scanner larg = new Scanner(System.in);
        Double largura = larg.nextDouble();
        larg.close();

        double area = altura * largura;
        double tinta = area / 2;

        System.out.print("A quantidade de litros de tinta " +
                "necessária para a área de " + area + " é de " + tinta);
    }
}


/*
altura = float(input('Digite a altura: '))
largura = float(input('Digite a largura: '))
area= altura * largura
tinta = area / 2
print(f'A quantidade de litros de tintas necessárias é de: {tinta}')
 */