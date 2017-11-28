import java.util.Random;

import javax.swing.JOptionPane;

public class Exercício1 {
	public static void main(String[] args) {
		int matriz[][] = new int [3][3];
		boolean isMatrizIdentidade = true;
		for(int l = 0; l < matriz.length; l++) {
			System.out.print("[");
			for(int c = 0; c < matriz[l].length; c++) {
				matriz[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número [" + l + "][" + c +"]"));
//				if(l == c) {
//					matriz[l][c] = 1;
//				} else {
//					matriz[l][c] = 0;
//				}
//				matriz[l][c] = l == c ? 1 : 0;
//				matriz[l][c] = new Random().nextInt(2);
				System.out.print(" " + matriz[l][c]);
				if(l == c && matriz[l][c] != 1) {
					isMatrizIdentidade = false;
					break;
				} else if(l != c && matriz[l][c] != 0) {
					isMatrizIdentidade = false;
					break;
				}
			}
			if(isMatrizIdentidade != true) {
				break;
			}
			System.out.print("]\n");
		}
		JOptionPane.showMessageDialog(null, "É uma matriz identidade? " + isMatrizIdentidade);
	}
}