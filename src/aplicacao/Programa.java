package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("como vai seu dia? ");
		String estar = sc.nextLine();
		if (estar.equals("bem")){
			System.out.println("tenha um bom dia!");
		} else if(estar.equals("mal")){
			System.out.println("que pena");
		}
		sc.close();
	}

}
