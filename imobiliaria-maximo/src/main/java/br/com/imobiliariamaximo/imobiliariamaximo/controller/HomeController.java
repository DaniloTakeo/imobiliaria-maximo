package br.com.imobiliariamaximo.imobiliariamaximo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.imobiliariamaximo.imobiliariamaximo.model.Imovel;
import br.com.imobiliariamaximo.imobiliariamaximo.model.StatusImovel;
import br.com.imobiliariamaximo.imobiliariamaximo.repository.ImovelRepository;

@Controller
@RequestMapping("home")
public class HomeController {
	
	@Autowired
	private ImovelRepository imovelRepository;
	
	@GetMapping
	public String home(Model model) {
		List<Imovel> listaImoveis = imovelRepository.findAll();
		
		model.addAttribute("imoveis", listaImoveis);
		
		return "home";
	}
	
	@GetMapping("/{status}")
	public String disponivel(@PathVariable("status") String status, Model model) {
		List<Imovel> listaImoveis = imovelRepository.findByStatus(StatusImovel.valueOf(status.toUpperCase()));
		
		model.addAttribute("imoveis", listaImoveis);
		model.addAttribute("status", status);
		
		return "home";
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	public String onError() {
		return "redirect:/home";
	}
}
