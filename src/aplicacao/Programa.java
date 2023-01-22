package aplicacao;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//comparador de ano bissexto
		Scanner sc = new Scanner(System.in);
		System.out.print("digite um ano: ");
		int ano = sc.nextInt();
		if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)){
			System.out.println("o ano é bisexto");
		} else {
			System.out.println("o ano não é bisexto");
		}
		sc.close();
	}

}
