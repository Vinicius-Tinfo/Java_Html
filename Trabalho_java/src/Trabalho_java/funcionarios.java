package Trabalho_java;

import java.util.Scanner;

public class funcionarios {

public void Cadastro() 
{
	Scanner Sc = new Scanner (System.in);	
System.out.print("");		
System.out.println("Nome");
String nome =Sc.next();
System.out.println("");
System.out.println("CPF");
long cpf =Sc.nextLong();
System.out.println("O funcionario"+nome);
System.out.println("Portador do CPF"+cpf);
System.out.println("Foi cadastrado com Sucesso!");
Sc.close();
}
}
