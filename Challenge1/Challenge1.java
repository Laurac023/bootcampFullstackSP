package Challenge1;

import java.util.*;

public class Challenge1 {
	static Scanner sc = new Scanner(System.in);
	static List<String> lista = new ArrayList<String>();	
	public static void main(String[]args){
		int longitud,tipo, cantidadCadenas;
		String numeros, cadena="";
		longitud = 8;		
		System.out.print("Cuantas cadenas quiere generar:  ");
		cantidadCadenas = sc.nextInt();
		

		for(int x = 0; x < cantidadCadenas; x++) {
			int num = x+1;
			System.out.print("Elija el tipo de la cadena número " + num + " de texto: Tipo A = 1  o B = 2 ");
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
		int size = lista.size();
		System.out.println("La lista es " + lista);
		System.out.println("La lista es " + size);
	}
	//metodo para ver si la cadena esta en la lista o no
//	public boolean verificar() {
//		boolean existe;
//		String insert, posicion;
//		System.out.print("Ingrese su cadena de 10 digitos: ");
//		insert = sc.nextLine();
//		for (int y = 1; y < lista.length(); y++) {
//			posicion = lista[i];
//			if(insert.equals(posicion){
//				existe = false;
//			}else {
//				existe = true;
//			}
//		}
//		System.out.println("La cadena es: " + existe);
//		return existe;
//	}
}
