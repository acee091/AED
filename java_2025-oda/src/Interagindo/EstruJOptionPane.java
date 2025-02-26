package Interagindo;

import javax.swing.*;

public class EstruJOptionPane {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, " Olá que bom voce por aqui! ");
        String name = JOptionPane.showInputDialog("Digite seu nome.");
        JOptionPane.showMessageDialog(null, "Bom trabalho, " + name);


    }
}
