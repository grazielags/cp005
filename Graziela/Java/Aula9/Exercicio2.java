import javax.swing.JOptionPane;
public class Exercicio2 {
	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero."));
        int soma = soma(numero);
        JOptionPane.showMessageDialog(null, "A soma de: " + numero + " é: " + soma);
	}
	public static int soma(int num){
		if (num <= 0) {
			return 0;
		} else {
			int soma = num + soma(num - 1);
			System.out.println(soma);
			return soma;
		}
    }
}