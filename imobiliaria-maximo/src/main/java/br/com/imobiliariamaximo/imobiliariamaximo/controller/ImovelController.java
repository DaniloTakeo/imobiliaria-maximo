package br.com.imobiliariamaximo.imobiliariamaximo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.imobiliariamaximo.imobiliariamaximo.dto.RequisicaoAlterarImovel;
import br.com.imobiliariamaximo.imobiliariamaximo.dto.RequisicaoNovoImovel;
import br.com.imobiliariamaximo.imobiliariamaximo.model.Imovel;
import br.com.imobiliariamaximo.imobiliariamaximo.repository.ImovelRepository;

@Controller
@RequestMapping("imovel")
public class ImovelController {
	
	@Autowired
	private ImovelRepository imovelRepository;
	
	@GetMapping("formulario")
	public String formulario(RequisicaoNovoImovel requisicao) {
		
		return "imovel/formulario";
	}
	
	@PostMapping("novo")
	public String novo(@Valid RequisicaoNovoImovel requisicao, BindingResult result) {
		
		if(result.hasErrors()) {
			return  "imovel/formulario";
		}
		
		Imovel imovel = requisicao.toImovel();
		imovelRepository.save(imovel);
		
		return "redirect:/home";
	}
	
	@PostMapping("gerenciar")
	public String gerenciar(String imovel, Model model) {
		List<Imovel> listaImoveis = imovelRepository.findByDescricao(imovel);
		
		model.addAttribute("imoveis", listaImoveis);
		
		return "imovel/gerenciar";
	}
	
	@PostMapping("atualizar")
	public String atualizar(@Valid RequisicaoAlterarImovel requisicao, BindingResult result) {
		Imovel imovel = requisicao.toImovel();
		
		imovelRepository.atualizarImovel(imovel.getPrecoCompra(), imovel.getPrecoAluguel(), imovel.getStatus().toString(), imovel.getDescricao());
		
		return "redirect:/home";
	}
}
