public class ExemplosListagemDoWhile {
	public static void main(String[] args) {
		int i = 11;
		do {
			System.out.println("Nome " + i + " - Nota " + i);
			i++;
		} while (i <= 10);

		i = 11;

		while (i <= 10) {
			System.out.println("Nome " + i + " - Nota " + i);
			i++;
		}
	}
}
