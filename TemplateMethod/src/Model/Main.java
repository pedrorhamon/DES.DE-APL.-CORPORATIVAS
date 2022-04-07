package Model;

import java.util.ArrayList;
import java.util.List;


public class Main {
		public static void main(String[]args) {
			
			List<Produto> produtos = new ArrayList<>();
			produtos.add(new Produto("Mouse", 10));
			produtos.add(new Produto("Notebook", 5000));
			produtos.add(new Produto("Fone de Ouvido", 250));
			
			GeradorDeRelatorios relatorioSimples = new RelatorioSimples();
			relatorioSimples.GeradordeRelatorios(produtos);
			
		}
}

