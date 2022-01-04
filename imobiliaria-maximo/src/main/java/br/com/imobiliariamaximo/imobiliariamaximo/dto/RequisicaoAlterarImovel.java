package br.com.imobiliariamaximo.imobiliariamaximo.dto;

import br.com.imobiliariamaximo.imobiliariamaximo.model.Imovel;
import br.com.imobiliariamaximo.imobiliariamaximo.model.StatusImovel;

public class RequisicaoAlterarImovel {
	private String descricao;
	private String precoAluguel;
	private String precoVenda;
	private String status;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Imovel toImovel() {
		Imovel imovel = new Imovel();
		imovel.setDescricao(descricao);
		imovel.setPrecoAluguel(precoAluguel);
		imovel.setPrecoCompra(precoVenda);
		imovel.setStatus(StatusImovel.valueOf(status.toUpperCase()));
		
		return imovel;
	}
}
