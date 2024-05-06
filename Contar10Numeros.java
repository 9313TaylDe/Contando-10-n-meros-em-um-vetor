package principal;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Contar10Numeros {
    public static void main(String[] args) {
        Contar();

    }

    public static void Contar() {

        int aux = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do seu vetor: "));
        int vetor[] = new int[aux];
        boolean encontrado;
        int cont = 0;

       
        for (int x = 0; x < aux; x++) {
            vetor[x] = Integer.parseInt(JOptionPane.showInputDialog("Digite: ", null));
        }
        for(int i = 0; i < aux; i ++ ){
           JOptionPane.showMessageDialog(null, "Número: "+vetor[i]);
        }
        
    }
}

// FRANCISCO EXPEDITO NASCIMENTO DE PAULO
