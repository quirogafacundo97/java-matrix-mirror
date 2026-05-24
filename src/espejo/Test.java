package espejo;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Matriz matrizOrig = new Matriz(4,5);
		Espejo espejo = new Espejo(4,5);
		 
		for(int i= 0; i<matrizOrig.getFilas(); i++) {
			for(int j=0; j<matrizOrig.getColumnas(); j++) {
				System.out.println("Ingrese valor m[" + i + "][" + j + "]");
				char c = scan.next().charAt(0);
				matrizOrig.setValor(i, j, c);
			}
		}
		System.out.println(matrizOrig);
		
		espejo.matrizEspejo(matrizOrig,espejo);
		
		System.out.println(espejo);
		
	}

}
