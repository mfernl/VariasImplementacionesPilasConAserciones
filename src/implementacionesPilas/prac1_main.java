package implementacionesPilas;

import java.util.Scanner;

public class prac1_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Pila<Integer> numeros = new Pila<Integer>();
		int numero;
		numero = sc.nextInt();
		numeros.apilar(numero);
		while(sc.hasNextInt()) {
			numero = sc.nextInt();
			numeros.apilar(numero);
		}
		while(!numeros.esVacia()) {
			System.out.println(numeros.cima());
			numeros.desapilar();
		}
		sc.close();
	}
}
