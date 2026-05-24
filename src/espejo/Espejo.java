package espejo;

public class Espejo extends Matriz{
	
	
	public Espejo(int m, int n) {
		super(m, n);
	}
	
	
	//Metodo para armar la matriz espejo de otra
	public void matrizEspejo(Matriz original, Matriz espejo) {

		for(int i=0; i<getFilas(); i++) {
			for(int j=0; j<getColumnas(); j++) {
				char valor = original.getValor(i, j);
				espejo.setValor(i, getColumnas()-1-j, valor);
			}
		}
	}
	

}
