package br.com.imobiliariamaximo.imobiliariamaximo.repository;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.imobiliariamaximo.imobiliariamaximo.model.Imovel;
import br.com.imobiliariamaximo.imobiliariamaximo.model.StatusImovel;

@Repository
public interface ImovelRepository extends JpaRepository<Imovel, Long>{

	@Cacheable("imoveis")
	List<Imovel> findByStatus(StatusImovel status);

	List<Imovel> findByDescricao(String descricao);
	
	@Transactional
	@Modifying
	@Query("UPDATE Imovel SET preco_compra = precoCompra, preco_aluguel = precoAluguel, status = status WHERE descricao = descricao")
	void atualizarImovel(@Param("precoCompra") String precoCompra, @Param("precoAluguel") String precoAluguel,
			@Param("status") String status, @Param("descricao") String descricao);
}
