package Interagindo;

import javax.swing.*;

public class Ex03 {
    public static void main(String[] args) {

        //JOptionPane.showMessageDialog(null, "Digite seu Nome");
        //String nome = JOptionPane.showInputDialog("DIGITE SEU NOME");
        //JOptionPane.showMessageDialog(null, "Bom dia");

        String numero = JOptionPane.showInputDialog("Digite um numero");
        Byte num1 = Byte.parseByte(numero);
        Short num2 = Short.parseShort(numero);
        Integer num3 = Integer.parseInt(numero);
        Long num4 = Long.parseLong(numero);
        Float num5 = Float.parseFloat(numero);
        Double num6 = Double.parseDouble(numero);

        JOptionPane.showMessageDialog(null, " Os numeros convertidos sao ? \n  " + num1 + " \n " + num2 + " \n " + num3 + " \n " + num4 + " \n " + num5 + " \n " + num6);

    }
}
