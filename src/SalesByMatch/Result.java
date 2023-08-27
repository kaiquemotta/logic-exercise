package SalesByMatch;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Result {

	/*
	 * Complete the 'sockMerchant' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER n 2. INTEGER_ARRAY ar
	 */

	public static int sockMerchant(int n, List<Integer> ar) {
		Set<Integer> meiasEncontrads = new HashSet<>();
		int cont = 0;

		for (Integer meia : ar) {
			if (!meiasEncontrads.add(meia)) {
				cont++;
				meiasEncontrads.remove(meia);
			}
		}
		return cont;
	}

}