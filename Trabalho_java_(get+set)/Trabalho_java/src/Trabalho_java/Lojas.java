package Trabalho_java;

import java.util.Scanner;

public class Lojas {
	String nome,endereco;
	long telefone;
	private String getNome() {
		return nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	private String getEndereco() {
		return endereco;
	}
	private void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	private long getTelefone() {
		return telefone;
	}
	private void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	public void Cadastro() {
		Scanner Sc = new Scanner (System.in);	
	System.out.print("");		
	System.out.println("Nome");
	nome =Sc.next();
	System.out.println("");
	System.out.println("Telefone");
	telefone =Sc.nextLong();
	System.out.println("Endereço");
	endereco =Sc.next();
	System.out.println("O funcionario "+nome);
	System.out.println("Portador do Telefone "+telefone);
	System.out.println("Endereço : ");
	System.out.println("Foi cadastrado com Sucesso!");
	Sc.close();
	}
	}

