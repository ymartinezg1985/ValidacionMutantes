package co.com.validacionMutantes.logic;

/**
 * @author Ymartinezg
 *
 */
public class TravelMatrix {

	/*
	 * @Param String[][] matrizG
	 * 
	 */

	public boolean analyze(String[][] matrizG) {

		boolean isMutant = false;
		String[] horizontal = horizontal(matrizG);
		String[] vertical = vertical(matrizG);
		String[] diagonal = diagonal(matrizG);
		if ((vertical != null && diagonal != null) || (vertical != null && horizontal != null)
				|| (diagonal != null && horizontal != null)) {
			isMutant = true;
		}

		return isMutant;
	}

	private String[] horizontal(String[][] matriz) {
		boolean finalizar = false;
		String[] respuesta = null;
		int contadorRespuesta = 0;
		try {
			for (String[] matriz1 : matriz) {
				contadorRespuesta = 0;
				respuesta = new String[4];
				for (int contador = 0; contador < matriz1.length; contador++) {
					String pibote = matriz1[contador];
					if (matriz1.length - contador >= 3) {
						String pibote2 = matriz1[contador + 1];
						if (pibote.equals(pibote2)) {
							respuesta[contadorRespuesta] = pibote2;
							contadorRespuesta++;
							if (contadorRespuesta == 3) {
								respuesta[3] = pibote;
								finalizar = true;
								break;
							}

						}
					} else {
						contador = matriz1.length;
					}
				}
				if (finalizar) {
					break;
				}
			}
			if (contadorRespuesta < 3) {
				respuesta = null;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return respuesta;
	}

	private String[] vertical(String[][] matriz) {
		int contadorRespuesta = 0;
		String[] respuesta = null;
		int contador = 0;
		int contadorMatriz = 0;
		respuesta = new String[4];
		try {
			for (; contadorMatriz < matriz.length && matriz[contadorMatriz].length > contador;) {
				String pibote = matriz[contadorMatriz][contador];
				if (matriz.length - contadorMatriz >= 3) {
					String pibote2 = matriz[contadorMatriz + 1][contador];
					if (pibote.equals(pibote2)) {
						respuesta[contadorRespuesta] = pibote;
						contadorRespuesta++;
						contadorMatriz++;
						if (contadorRespuesta == 3) {
							respuesta[3] = pibote;
							break;

						}
					} else {
						contadorRespuesta = 0;
						contadorMatriz++;
					}
				} else {
					contadorMatriz = 0;
					contador++;
				}

			}
			if (contadorMatriz < 3) {
				respuesta = null;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return respuesta;
	}

	private String[] diagonal(String[][] matriz) {

		String[] respuesta = null;
		Integer ejeY = matriz.length;
		Integer ejeX = matriz[0].length;
		int vector = 0;
		String x = null;
		boolean termina = false;

		try {
			for (Integer diagonal = 1 - ejeX; diagonal <= ejeY - 1; diagonal += 1) {
				if (termina) {
					break;
				}
				respuesta = new String[4];
				vector = 0;
				for (Integer vertical = Math.max(0, diagonal), horizontal = -Math.min(0, diagonal); vertical < ejeY
						&& horizontal < ejeX; vertical += 1, horizontal += 1) {

					x = (matriz[vertical][horizontal]);
					if (vector == 0) {
						respuesta[vector] = x;
						vector++;
					} else if (respuesta[0] == x) {
						respuesta[vector] = x;
						vector++;
					} else {
						respuesta[0] = x;
						vector = 1;

					}
					if (vector == 4) {
						termina = true;
						break;
					}
				}

			}
			if (vector < 3) {
				respuesta = null;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return respuesta;
	}

	public String convertArraytoString(String[] adn) {

		StringBuffer cadenaADN = new StringBuffer();
		for (String x : adn) {
			cadenaADN = cadenaADN.append(x);

		}
		return cadenaADN.toString();

	}

}
