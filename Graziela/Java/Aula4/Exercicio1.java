import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		char plano = JOptionPane.showInputDialog("Digite o plano (A/B/C): ").charAt(0);
		float salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário: "));
		switch (plano) {
			case 'A':
				salario += (10 * salario) /100;
				break;
			case 'B':
				salario += (15 * salario) /100;
				break;
			case 'C':
				salario = salario + ((20 * salario) /100);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Plano inválido!");
				break;
		}
		JOptionPane.showMessageDialog(null, "Novo salário: " + salario);
	}
}