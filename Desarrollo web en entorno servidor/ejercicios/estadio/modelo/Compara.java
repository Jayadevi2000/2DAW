package modelo;

public class Compara {

	public static boolean focosX(int x, int y) {
		boolean resultado = (x == 4 && y == 0) || (x == 4 && y == 8);
		return resultado;
	}

	public static boolean focosY(int x, int y) {
		boolean resultado = (x == 0 && y == 4) || (x == 8 && y == 4);
		return resultado;
	}

	public static boolean circulos(int x, int y) {
		boolean resultado = !((y > 1) && (y < 7) && (x > 1) && (x < 7)) && (y > 0) && (x > 0) && (y < 8) && (x < 8);
		return resultado;
	}

	public static boolean rectangulosX(int x, int y) {
		boolean resultado = (y == 4 && x > 1 && x < 7);
		return resultado;
	}

	public static boolean rectangulosY(int x, int y) {
		boolean resultado = (x == 4 && y > 1 && y < 7);
		return resultado;
	}

}
