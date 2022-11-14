package Challenge1;

import java.util.*;

public class Challenge1 {
	
	static Scanner sc = new Scanner(System.in);
	static List<String> lista = new ArrayList<String>();	
	public static void main(String[]args){
		int length,type,amountCadenas;
		String numbers, cadena="";
		length = 8;		
		System.out.print("Cuantas cadenas quiere generar:  ");
		amountCadenas = sc.nextInt();
		

		for(int x = 0; x < amountCadenas; x++) {
			int num = x+1;
			System.out.print("Elija el tipo de la cadena número " + num + " de texto: Tipo A = 1  o B = 2 ");
			type = sc.nextInt();

			if(type == 1) {
				cadena = "54";
				for(int i = 1; i<=length;i++) {
					numbers = String.valueOf(Double.valueOf(Math.random()*10).intValue());
					cadena += numbers;
				}
				lista.add(cadena);
			}else {
				cadena = "08";
				for(int i = 1; i<=length;i++) {
					numbers = String.valueOf(Double.valueOf(Math.random()*10).intValue());
					cadena += numbers;
				}
				lista.add(cadena);
			}
		}
		System.out.println("La lista es " + lista);
		System.out.println("La lista es " + lista.get(1));
	}
	//metodo para ver si la cadena esta en la lista o no
	public boolean verify() {
		boolean existe = false;
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
		System.out.println("La cadena es: " + existe);
		return existe;
	}
}
