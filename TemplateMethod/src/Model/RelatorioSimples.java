package Model;

import java.util.List;

public class RelatorioSimples extends GeradorDeRelatorios{

	@Override
	protected String gerarConteudo(List<Produto> produtos) {
		double totalProduto = 0;
		StringBuilder conteudo = new StringBuilder();
		
		for(Produto produto : produtos) {
			totalProduto += produto.getPreco();
		}
		
		conteudo.append("QUANTIDADE VENDIDA:" + produtos.size());
		conteudo.append("\nTOTAL VENDIDO:" + totalProduto);
		
		return conteudo.toString();
	}


	protected void gerarVisualizacao(String cabecalho, String conteudo) {
		System.out.println(cabecalho);
		System.out.println(conteudo);
		
	}

}
