package Trabalho_java;

import java.util.Scanner;

public class Lojas {
	public void Cadastro() {
		Scanner Sc = new Scanner (System.in);	
	System.out.print("");		
	System.out.println("Nome");
	String nome =Sc.next();
	System.out.println("");
	System.out.println("Telefone");
	long telefone =Sc.nextLong();
	System.out.println("Endereço");
	String endereco =Sc.next();
	System.out.println("O funcionario "+nome);
	System.out.println("Portador do Telefone "+telefone);
	System.out.println("Endereço : ");
	System.out.println("Foi cadastrado com Sucesso!");
	Sc.close();
	}
	}

