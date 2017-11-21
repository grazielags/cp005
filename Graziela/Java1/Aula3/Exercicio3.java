import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		char sexo = JOptionPane.showInputDialog("Digite o sexo F/M").charAt(0);
		if(sexo == 'F' || sexo == 'f') {
			JOptionPane.showMessageDialog(null, "Feminino");
		} else if(sexo == 'M' || sexo == 'm') {
			JOptionPane.showMessageDialog(null, "Masculino");
		} else {
			JOptionPane.showMessageDialog(null, "Opção inválida!");
		}
	}
}