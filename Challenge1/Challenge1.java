package Challenge1;

import java.util.*;

public class Challenge1 {
	public static void main(String[]args){
		int longitud,tipo, cantidadCadenas;
		String numeros, A, cadena="";
		longitud = 8;
		A = "A";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Cuantas cadenas quiere generar:  ");
		cantidadCadenas = sc.nextInt();
		
		List<String> lista = new ArrayList<String>();
		for(int x = 0; x < cantidadCadenas; x++) {
			int num = x+1;
			System.out.print("Elija el tipo de cadena número " + num + " de texto: Tipo A = 1  o B = 2 ");
			tipo = sc.nextInt();

			if(tipo == 1) {
				cadena = "54";
				for(int i = 1; i<=longitud;i++) {
					numeros = String.valueOf(Double.valueOf(Math.random()*10).intValue());
					cadena += numeros;
				}
				lista.add(cadena);
			}else {
				cadena = "08";
				for(int i = 1; i<=longitud;i++) {
					numeros = String.valueOf(Double.valueOf(Math.random()*10).intValue());
					cadena += numeros;
				}
				lista.add(cadena);
			}
		}
		System.out.println("La lista es " + lista);
	}
	//metodo para ver si la cadena esta en la lista o no
//	public boolean lista(String lista) {
//		boolean existe = false;
//		if(lista == ) {
//			existe = true;
//		}
//		System.out.println("La cadena es: " + existe);
//		return existe;
//	}
}
