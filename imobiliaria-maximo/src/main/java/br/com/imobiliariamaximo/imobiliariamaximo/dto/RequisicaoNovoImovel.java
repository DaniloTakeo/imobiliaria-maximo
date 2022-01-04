package br.com.imobiliariamaximo.imobiliariamaximo.dto;

import javax.validation.constraints.NotBlank;

import br.com.imobiliariamaximo.imobiliariamaximo.model.Imovel;
import br.com.imobiliariamaximo.imobiliariamaximo.model.StatusImovel;

public class RequisicaoNovoImovel {
	
	@NotBlank
	private String descricaoImovel;
	@NotBlank
	private String enderecoImovel;
	private String numeroComodos;
	private String precoAluguel;
	private String precoVenda;
	private String tamanhoTerreno;
	@NotBlank
	private String urlImagem;

	public String getDescricaoImovel() {
		return descricaoImovel;
	}

	public void setDescricaoImovel(String descricaoImovel) {
		this.descricaoImovel = descricaoImovel;
	}

	public String getEnderecoImovel() {
		return enderecoImovel;
	}

	public void setEnderecoImovel(String enderecoImovel) {
		this.enderecoImovel = enderecoImovel;
	}

	public String getNumeroComodos() {
		return numeroComodos;
	}

	public void setNumeroComodos(String numeroComodos) {
		this.numeroComodos = numeroComodos;
	}

	public String getPrecoAluguel() {
		return precoAluguel;
	}

	public void setPrecoAluguel(String precoAluguel) {
		this.precoAluguel = precoAluguel;
	}

	public String getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(String precoVenda) {
		this.precoVenda = precoVenda;
	}

	public String getTamanhoTerreno() {
		return tamanhoTerreno;
	}

	public void setTamanhoTerreno(String tamanhoTerreno) {
		this.tamanhoTerreno = tamanhoTerreno;
	}

	public String getUrlImagem() {
		return urlImagem;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}

	public Imovel toImovel() {
		Imovel imovel = new Imovel();
		imovel.setDescricao(descricaoImovel);
		imovel.setEndereco(enderecoImovel);
		imovel.setNumeroDeComodos(numeroComodos);
		imovel.setPrecoAluguel(precoAluguel);
		imovel.setPrecoCompra(precoVenda);
		imovel.setTamanhoDoTerreno(tamanhoTerreno);
		imovel.setUrlImagem(urlImagem);
		imovel.setStatus(StatusImovel.DISPONIVEL);
		
		return imovel;
	}
}
