package view;

import model.Cliente;

public class Main {

	public static void main(String[]args) {
		var cliente = Cliente.builder()
				.nome("Marcos")
				.endereco("Rua projetada")
				.estadoCivil("Solteiro")
				.profissao("Contador");
		
		System.out.println(cliente);
	}
}
	