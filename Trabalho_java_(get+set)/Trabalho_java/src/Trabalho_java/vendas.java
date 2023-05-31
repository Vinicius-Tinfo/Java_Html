package Trabalho_java;
import java.util.Scanner;

public class vendas {
	String data;
	private String getData() {
		return data;
	}
	private void setData(String data) {
		this.data = data;
	}
	public void Cadastro() {
		Scanner Sc = new Scanner (System.in);	
	System.out.print("");		
	System.out.println("data");
	data =Sc.next();
	System.out.println("Venda na data"+data+"Confirmada!");
	Sc.close();
	}
}
