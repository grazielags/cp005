import javax.swing.JOptionPane;
public class ExemploTecladoJOptionPane {
	public static void main(String args[]) {
		String nome = JOptionPane.showInputDialog("Entre com o seu nome: ");
		char sexo = JOptionPane.showInputDialog("Entre com o seu sexo(F/M): ").charAt(0);	
		//Byte.parseByte - Tranforma o conteúdo String obtido do showInputDialog para byte;
		byte idade = Byte.parseByte(JOptionPane.showInputDialog("Entre com a sua idade: "));
		//Integer.parseInt - Tranforma o conteúdo String obtido do showInputDialog para int;
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor do emprestimo: "));
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor do salário: "));
		boolean isCasaPropria = Boolean.parseBoolean(JOptionPane.showInputDialog("Possui casa própria?: "));
		JOptionPane.showMessageDialog(null, "Nome: " + nome 
						+ "\nIdade: " + idade 
						+ "\nSexo: " + sexo
						+ "\nEmpréstimo: " + numero
						+ "\nSalário: " + salario
						+ "\náCasa própria?: " + isCasaPropria);
	}
}
