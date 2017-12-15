import javax.swing.JOptionPane;

public class ExemploCalculadora {
	static short numero1;
	static char operacao;
	static short numero2;
	static float resultado = 0;

	public static void main(String[] args) {
		numero1 = Short.parseShort(JOptionPane.showInputDialog("Digite o primeiro número."));
		operacao = JOptionPane.showInputDialog("Digite qual a operação desejada (+, -, *, /)").charAt(0);
		numero2 = Short.parseShort(JOptionPane.showInputDialog("Digite o segundo número."));
		calculadora();
		JOptionPane.showMessageDialog(null, numero1 + " " + operacao + " " + numero2 + " = " + resultado);
	}
	
	public static void calculadora() {
		switch (operacao) {
			case '+':
				resultado = soma();
				break;
			case '-':
				resultado = subtracao();
				break;
			case '*':
				resultado = multiplicacao();
				break;
			case '/':
				resultado = divisao();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
				break;
		}
	}

	static float soma() {
		return numero1 + numero2;
	}

	static float subtracao() {
		return numero1 - numero2;
	}

	static float divisao() {
		return numero1 / (float)numero2;
	}

	static float multiplicacao() {
		return numero1 * numero2;
	}
}