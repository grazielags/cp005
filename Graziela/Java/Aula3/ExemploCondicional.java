public class ExemploCondicional {
	public static void main(String[] args) {
		final int MAIOR_IDADE = 18;
		boolean isMaiorIdade = 17 >= MAIOR_IDADE;
		if (isMaiorIdade == false) {
			System.out.println("Menor de idade");
		}
	}
}