import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		int i = 0;
		float salario = 0;
		byte numeroFilhos = 0;
		byte qtdPessoasSalarioAteMil = 0;
		float somaSalario = 0;
		float somaNumeroFilhos = 0;
		float maiorSalario = 0;
		float menorSalario = 0;
		while (i < 10) {
			salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário."));
			numeroFilhos = Byte.parseByte(JOptionPane.showInputDialog("Digite a quatidade de filhos."));
			somaSalario = somaSalario + salario;
			somaNumeroFilhos = somaNumeroFilhos + numeroFilhos;
			if(salario <= 1000) {
				qtdPessoasSalarioAteMil = (byte) (qtdPessoasSalarioAteMil + 1);
			}
			if (i == 0) {
				maiorSalario = salario;
				menorSalario = salario;
			} else {
				if(salario > maiorSalario) {
					maiorSalario = salario;
				}
				if(salario < menorSalario) {
					menorSalario = salario;
				}
			}
			
			i = i + 1;
		}
		float percentual = (float) ((qtdPessoasSalarioAteMil / 10.0) * 100.0);
		float mediaSalarios = (float) (somaSalario / 10.0) ;
		float mediaNumeroFilho = (float) (somaNumeroFilhos / 10.0) ;
		System.out.println("Percentual de pessoas com salário até R$1000,00: " + percentual 
				+ "%\nMédia os salários: R$" + mediaSalarios 
				+ "\nMaior salário: R$" + maiorSalario 
				+ "\nMenor salário: R$" + menorSalario 
				+ "\nMédia do número de filhos" + mediaNumeroFilho);
	}
}