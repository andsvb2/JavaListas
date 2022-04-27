package l03.numPrimos;

public class CDF {
	
	 public boolean ePrimo(int num) {
		
		if (num < 2) {
			return false;
		} else {
			int contador = 2;
			while (contador < ((int) Math.sqrt(num) + 1)) {
				if (num % contador == 0) {
					return false;
				}
				contador++;
			}
			return true;
		}
	}
}