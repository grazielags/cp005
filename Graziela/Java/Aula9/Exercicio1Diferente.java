import javax.swing.JOptionPane;

public class Exercicio1Diferente {
	public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("Digite um número!");
        int soma = somaAlgarismosB(numero, numero.contains("-") ? 1 : 0);
        JOptionPane.showMessageDialog(null, "O valor da soma dos algarismos é: " + soma);
    }

    public static int somaAlgarismosB(String numeros, int posicao){
        if((numeros.length() - 1) == posicao) {
            return Character.getNumericValue(numeros.charAt(posicao));
        }
        return Character.getNumericValue(numeros.charAt(posicao)) + somaAlgarismosB(numeros, posicao+1);
    }
}