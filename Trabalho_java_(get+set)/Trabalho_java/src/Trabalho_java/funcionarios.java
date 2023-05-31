package Trabalho_java;

import java.util.Scanner;

public class funcionarios {
String nome;
long cpf;


private String getNome() {
	return nome;
}


private void setNome(String nome) {
	this.nome = nome;
}


private long getCpf() {
	return cpf;
}


private void setCpf(long cpf) {
	this.cpf = cpf;
}


public void Cadastro() 
{
	Scanner Sc = new Scanner (System.in);	
System.out.print("");		
System.out.println("Nome");
nome =Sc.next();
System.out.println("");
System.out.println("CPF");
cpf =Sc.nextLong();
System.out.println("O funcionario"+nome);
System.out.println("Portador do CPF"+cpf);
System.out.println("Foi cadastrado com Sucesso!");
Sc.close();
}
}
