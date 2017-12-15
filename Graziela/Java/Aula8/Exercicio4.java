import javax.swing.JOptionPane;

public class Exercicio4 {
	public static void main(String[] args) {
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
		double media = (nota1 + nota2) / 2;
		char conceito = conceito(media);
		if(conceito == 'Y') {
			JOptionPane.showMessageDialog(null, "Média inválida!");
		} else {
			JOptionPane.showMessageDialog(null, "Seu conceito é: '" + conceito + "' com média: " + media + "!");
		}
	}

	public static char conceito(double media) {
		if(media >= 0 && media <= 4.9) {
			return 'D';
		} else if(media >= 5 && media <= 6.9) {
			return 'C';
		} else if(media >= 7 && media <= 8.9) {
			return 'B';
		} else if(media >= 9 && media <= 10) {
			return 'A';
		}
		return 'Y';
	}
}