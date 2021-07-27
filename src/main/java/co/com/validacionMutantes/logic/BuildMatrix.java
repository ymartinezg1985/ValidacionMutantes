package co.com.validacionMutantes.logic;

public class BuildMatrix {

	public String[][] generatMatrix(String[] cadenas) {
		

		// String[] cadenas = {"TTGCAA", "CAGTGC", "TTATGT", "AGAAGG", "CTCCTA",
		// "TCACTG"};
		String[][] matrizG = new String[cadenas.length][cadenas[0].length()];
		try {

			int contadorMatriz = 0;
			for (String cadena : cadenas) {
				int contadorVector = 0;
				char[] caracteres = cadena.toCharArray();
				for (char caracter : caracteres) {
					matrizG[contadorMatriz][contadorVector] = String.valueOf(caracter);
					contadorVector++;
				}
				contadorMatriz++;
			}
		} catch (Exception e) {

		}

		return matrizG;
	}

}
