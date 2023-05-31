package Trabalho_java;

import java.util.Scanner;

public class produto {
	public void Cadastro() {
		Scanner Sc = new Scanner (System.in);	
	System.out.print("");		
	System.out.println("Nome");
	String nome =Sc.next();
	System.out.println("");
	System.out.println("Telefone");
	double preco =Sc.nextDouble();
	System.out.println("O funcionario "+nome);
	System.out.println("Que custa R$ "+preco);
	System.out.println("Foi cadastrado com Sucesso!");
	Sc.close();
	}
}
