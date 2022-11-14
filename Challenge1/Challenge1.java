package Challenge1;

import java.util.*;

public class Challenge1 {
	static Scanner sc = new Scanner(System.in);
	static List<String> lista = new ArrayList<String>();	
	static boolean existe = verificar();
	public static void main(String[]args){

		int longitud,tipo, cantidadCadenas;
		String numeros, cadena="";
		longitud = 8;		
		System.out.print("Cuantas cadenas quiere generar:  ");
		cantidadCadenas = sc.nextInt();
		System.out.println("La cadena es: " + existe);
		System.out.println("La lista es " + lista);
		
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
	}
	//metodo para ver si la cadena esta en la lista o no
	public static boolean verificar() {
		String insert, posicion;
		int size = lista.size();
		System.out.print("Ingrese su cadena de 10 digitos: ");
		insert = sc.nextLine();
		for (int y =0; y < size; y++) {
			posicion = lista.get(y);
			if(insert.equals(posicion)){
				existe = false;
			}else {
				existe = true;
			}
		}
		return existe;
	}
}
