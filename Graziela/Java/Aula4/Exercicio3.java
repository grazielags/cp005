import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		short numero1 = Short.parseShort(JOptionPane.showInputDialog("Digite o primeiro número."));
		char operacao = JOptionPane.showInputDialog("Digite qual a operação desejada (+, -, *, /)").charAt(0);
		short numero2 = Short.parseShort(JOptionPane.showInputDialog("Digite o segundo número."));
		float resultado = 0;
		switch (operacao) {
			case '+':
				resultado = numero1 + numero2;
				break;
			case '-':
				resultado = numero1 - numero2;
				break;
			case '*':
				resultado = numero1 * numero2;
				break;
			case '/':
				resultado = numero1 / (float)numero2;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
				break;
		}
		JOptionPane.showMessageDialog(null, numero1 + " " + operacao + " " + numero2 + " = " + resultado);
	}
}