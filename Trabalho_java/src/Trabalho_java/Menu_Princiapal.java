package Trabalho_java;
import java.util.Scanner;

public class Menu_Princiapal {

	public static void main(String[] args) {
		funcionarios funcionario = new funcionarios();
		fornecedor fornecedor = new fornecedor();
		produto produto = new produto();
		Lojas Lojas = new Lojas();
		vendas vendas = new vendas();
		
		Scanner Sc = new Scanner (System.in);	

		System.out.print("");		
		System.out.println("Bem vindo ao menu");
		System.out.println("");
		System.out.println("1 - Cadastro de Funcionarios");
		System.out.println("2 - Cadastro de Forncedores");
		System.out.println("3 - Cadastro de Produtos");
		System.out.println("4 - Cadastro de Lojas");
		System.out.println("5 - Cadastro de Vendas");
		int op_menu =Sc.nextInt();
		switch(op_menu)
		{
		case 1:
		  funcionario.Cadastro();	
		break;
			case 2:
			  fornecedor.Cadastro();	
			break;
			case 3:
				  produto.Cadastro();	
				break;
			case 4:
				  Lojas.Cadastro();	
				break;
			case 5:
				  vendas.Cadastro();	
				break;
											
			}
		Sc.close();
	}	
		

	}
		