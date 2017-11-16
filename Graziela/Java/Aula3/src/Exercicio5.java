import javax.swing.JOptionPane;

public class Exercicio5 {
	public static void main(String[] args) {
		byte mes = Byte.parseByte(JOptionPane.showInputDialog("Digite o mês."));
		byte ano = Byte.parseByte(JOptionPane.showInputDialog("Digite o ano."));
		switch (mes) {
			case 1:
				JOptionPane.showMessageDialog(null, "Janeiro: 31 dias!");
				break;
			default:
				break;
		}
	}
}