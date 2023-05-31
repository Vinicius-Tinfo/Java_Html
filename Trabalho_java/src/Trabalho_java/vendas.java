package Trabalho_java;
import java.util.Scanner;

public class vendas {
	public void Cadastro() {
		Scanner Sc = new Scanner (System.in);	
	System.out.print("");		
	System.out.println("data");
	String data =Sc.next();
	System.out.println("Venda na data"+data+"Confirmada!");
	Sc.close();
	}
}
