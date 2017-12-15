import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade!"));
		verificaIdade(idade);
	}

	public static void verificaIdade(int idade) {
		if(idade >= 5 && idade <= 7) {
			JOptionPane.showMessageDialog(null, "A idade: " + idade + " está na categoria: Infantil A.");
		} else if(idade >= 8 && idade <= 10) {
			JOptionPane.showMessageDialog(null, "A idade: " + idade + " está na categoria: Infantil B.");
		} else if(idade >= 11 && idade <= 13) {
			JOptionPane.showMessageDialog(null, "A idade: " + idade + " está na categoria: Juvenil A.");
		} else if(idade >= 14 && idade <= 17) {
			JOptionPane.showMessageDialog(null, "A idade: " + idade + " está na categoria: Juvenil B.");
		} else if(idade >= 18) {
			JOptionPane.showMessageDialog(null, "A idade: " + idade + " está na categoria: Adulto.");
		} else {
			JOptionPane.showMessageDialog(null, "A idade: " + idade + " não está presente nas categorias existentes.");
		}
	}
}