import javax.swing.JOptionPane;

public class Exercicio4 {
	public static void main(String[] args) {
		short numero = Short.parseShort(JOptionPane.showInputDialog("Digite um número."));
		switch (numero) {
			case 0:
				JOptionPane.showMessageDialog(null, "Zero");
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "Um");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Dois");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Três");
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Quatro");
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Cinco");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Número inválida!");
				break;
		}
	}
}