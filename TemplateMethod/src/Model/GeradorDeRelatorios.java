package Model;

import java.util.List;

public abstract class GeradorDeRelatorios{
	

	public final void GeradordeRelatorios(List <Produto> produtos) {
		
			String cabecalho = this.gerarCabecalho();
			String conteudo = this.gerarConteudo(produtos);
			this.gerarVisualizacao(cabecalho, conteudo);
	}
	
	protected String gerarCabecalho() {
		return new String(
				"JAVA BÁSICO CORPORATION LTDA \n"+
				
				"RELATORIO DE PRODUTOS VENDIDOS\n"
				
				);
	}
	
    protected abstract String gerarConteudo(List<Produto> produtos);
    protected abstract void gerarVisualizacao(String cabecalho, String conteudo);
	
}
