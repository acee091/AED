package Estrutura;

public class EstruIfElseIf {
    public static void main(String[] args) {

        String nome = "Johann Gabriel";
        int idade = 22;

        if (idade < 10) {
            System.out.println(nome + " Tem " + idade + " anos \nAinda é uma criança" );
        }
        else if (idade < 18)
        {
            System.out.println(nome + " Tem " + idade + " anos \nAinda é um adolecente" );
        }
        else if (idade < 21)
        {
            System.out.println(nome + " Tem " + idade + " anos \nAinda é um jovem adulto" );
        }
        else {
            System.out.println(nome + " Tem " + idade + " anos \nAinda é um adulto" );
        }


    }
}
