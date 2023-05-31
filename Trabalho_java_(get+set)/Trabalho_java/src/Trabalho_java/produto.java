package Trabalho_java;

import java.util.Scanner;

public class produto {
	String nome;
	private String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private double getPreco() {
		return preco;
	}

	private void setPreco(double preco) {
		this.preco = preco;
	}

	double preco;
	
	public void Cadastro() {
		Scanner Sc = new Scanner (System.in);	
	System.out.print("");		
	System.out.println("Nome");
	nome =Sc.next();
	System.out.println("");
	System.out.println("Telefone");
	preco =Sc.nextDouble();
	System.out.println("O funcionario "+nome);
	System.out.println("Que custa R$ "+preco);
	System.out.println("Foi cadastrado com Sucesso!");
	Sc.close();
	}
}
