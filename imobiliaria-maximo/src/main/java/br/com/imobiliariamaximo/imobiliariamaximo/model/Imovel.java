package br.com.imobiliariamaximo.imobiliariamaximo.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Imovel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String descricao;
	private String numeroDeComodos;
	private String endereco;
	private String tamanhoDoTerreno;
	private String precoCompra;
	private String precoAluguel;
	private String urlImagem;

	@Enumerated(EnumType.STRING)
	private StatusImovel status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public StatusImovel getStatus() {
		return status;
	}

	public void setStatus(StatusImovel status) {
		this.status = status;
	}

	public String getUrlImagem() {
		return urlImagem;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNumeroDeComodos() {
		return numeroDeComodos;
	}

	public void setNumeroDeComodos(String numeroDeComodos) {
		this.numeroDeComodos = numeroDeComodos;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTamanhoDoTerreno() {
		return tamanhoDoTerreno;
	}

	public void setTamanhoDoTerreno(String tamanhoDoTerreno) {
		this.tamanhoDoTerreno = tamanhoDoTerreno;
	}

	public String getPrecoCompra() {
		return precoCompra;
	}

	public void setPrecoCompra(String precoCompra) {
		this.precoCompra = precoCompra;
	}

	public String getPrecoAluguel() {
		return precoAluguel;
	}

	public void setPrecoAluguel(String precoAluguel) {
		this.precoAluguel = precoAluguel;
	}

}
