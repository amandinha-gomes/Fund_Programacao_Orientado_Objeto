package br.com.projeto;

import br.com.classes.Cliente;
import br.com.classes.Diarista;

public class App {

	public static void main(String[] args) {
		
		Diarista diarista = new Diarista();
		
		diarista.nome  = "Joana";
		diarista.telefone = "(11) 9002-8922";
		diarista.endereço = "Av Cajamar, N 111";
		diarista.chavepix = "123";
		
		System.out.println("Nome Diarista: " + diarista.nome);
		System.out.println("Telefone: " + diarista.telefone);
		System.out.println("Endereço: " + diarista.endereço);
		System.out.println("Chave Pix Diarista: " + diarista.chavepix);
		diarista.atender("Daniel");
		
		System.out.println("=============================================");
		
		Cliente cliente = new Cliente();
		
		cliente.nome = "Daniel";
		cliente.telefone = "(11) 99875-7857";
		cliente.endereço = "Portal dos Ipes, N 35";
		cliente.saldo = 100.00;
		
		System.out.println("Nome Cliente: " + cliente.nome);
		System.out.println("Telefone: " + cliente.telefone);
		System.out.println("Endereço: " + cliente.endereço);
		System.out.println("Saldo Cliente: " + cliente.saldo);
		
	}
}
