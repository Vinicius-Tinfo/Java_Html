package Trabalho_java;

import java.util.Scanner;

public class fornecedor {

	public void Cadastro() {
		Scanner Sc = new Scanner (System.in);	
	System.out.print("");		
	System.out.println("Nome");
	String nome =Sc.next();
	System.out.println("");
	System.out.println("Telefone");
	Long telefone =Sc.nextLong();
	System.out.println("O Fornecedor"+nome+"foi cadastrado");
	Sc.close();
	}
}

