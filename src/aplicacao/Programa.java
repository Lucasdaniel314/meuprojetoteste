package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tabuada
		Scanner sc = new Scanner(System.in);
		int resultado = 0;
		System.out.print("você que ver a tabuada de qual número? ");
		int num = sc.nextInt();
		for(int i = 0; i<=10; i++){
			resultado = num * i;
			System.out.println(num +" x "+ i + "= "+ resultado);
		}
		sc.close();
	}

}
