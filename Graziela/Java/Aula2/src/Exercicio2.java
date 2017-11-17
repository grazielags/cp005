import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		short ano = Short.parseShort(JOptionPane.showInputDialog("Digite um ano: "));
		boolean isAnoBissexto = ano%4 == 0 && ano%100 != 0 || ano%400 == 0;
		if(isAnoBissexto) {
			JOptionPane.showMessageDialog(null, "É um ano Bissexto!");
		} else {
			JOptionPane.showMessageDialog(null, "Não é um ano Bissexto!");
		}
	}
}