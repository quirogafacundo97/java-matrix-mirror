package espejo;

public class Matriz {
	private char[][] matriz;
	private int filas, columnas;
	
	public Matriz(int m, int n) {
		matriz = new char[m][n];
		this.filas = m;
		this.columnas = n;
	}
	
	public int getFilas() {
		return filas;
	}
	
	public int getColumnas() {
		return columnas;
	}
	
	public void setValor(int x, int y, char valor) {
		if(x >= 0 && x < getFilas() && y >= 0 && y < getColumnas()) {
			matriz[x][y] = valor;
		}
	}
	
	public char getValor(int x, int y) {
		char valor = ' ';
		if(x >=0 && x < getFilas() && y >= 0 && y < getColumnas()) {
			valor = matriz[x][y];
		}
		else {
			System.out.println("error, valor fuera de rango");
		}
		
		return valor;
	}
	
	@Override
	public String toString() {
		String resultado = "";
		for(int i=0; i<getFilas(); i++) {
			for(int j=0; j<getColumnas(); j++) {
				resultado+= matriz[i][j] + "\t";
			}
			resultado+= "\n";
		}
		return resultado;
	}
}
