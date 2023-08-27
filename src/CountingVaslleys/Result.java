package CountingVaslleys;

public class Result {

	/*
	 * Complete the 'countingValleys' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER steps 2. STRING path
	 */

	public static int countingValleys(int steps, String path) {

		int cont = 0;
		int abaixoNivelMar = 0;
		for (int i = 0; i < steps; i++) {
			if (path.charAt(i) == 'U') {
				cont += 1;
			} else {
				cont -= 1;
				if (cont == -1) {
					abaixoNivelMar++;
				}
			}
		}
		return abaixoNivelMar;
	}
}