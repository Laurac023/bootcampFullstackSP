package Challenge1;

import java.util.*;

public class Challenge1 {
	//Variables static que crean el scanner y la lista
	static Scanner sc = new Scanner(System.in);
	static List<String> lista = new ArrayList<String>();	
	
	//Metodo main
	public static void main(String[]args){
		int length = 8;			
	}
	//Metodo que crea cierto número de cadenas y las va agregando a una lista
	public static String crearCadena(int length,int type) {
		String numbers, cadena="";
			if(type == 1) {
				cadena = "54";
			}else {
				cadena = "08";
			}
			for(int i = 1; i<=length;i++) {
				numbers = String.valueOf(Double.valueOf(Math.random()*10).intValue());
				cadena += numbers;
			}
		return cadena;
	}

	//metodo para ver si la cadena esta en la lista o no
	public static boolean verify(String str, List<String>lista) {
		boolean existe = false;
		String posicion;
		int size = lista.size();
		for (int y =0; y < size; y++) {
			posicion = lista.get(y);
			if(str.equals(posicion)){
				existe = false;
			}else {
				existe = true;
			}
		}
		return existe;
	}
}
