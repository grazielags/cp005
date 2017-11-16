import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o salário 1: ");
		float salario1 = teclado.nextFloat();
		System.out.println("Digite o salário 2: ");
		float salario2 = teclado.nextFloat();
		System.out.println("Digite o salário 3: ");
		float salario3 = teclado.nextFloat();
		System.out.println("Digite o salário 4: ");
		float salario4 = teclado.nextFloat();
		System.out.println("Digite o salário 5: ");
		float salario5 = teclado.nextFloat();
//		float salario1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário 1: "));
//		float salario2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário 2: "));
//		float salario3 = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário 3: "));
//		float salario4 = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário 4: "));
//		float salario5 = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário 5: "));
		float media = (float) ((salario1 + salario2 + salario3 + salario4 + salario5) / 5.0);
		JOptionPane.showMessageDialog(null, "A média dos salários é: " + media);
	}
}