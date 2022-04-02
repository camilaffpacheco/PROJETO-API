package com.dev.ecommerce.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dev.ecommerce.repositorios.ProdutoRepositorio;

@Controller
public class PromocoesControle {

	@Autowired
	private ProdutoRepositorio produtoRepositorio;
	
	@GetMapping("/administrativo/promocoes")
	public String acessarPromocoes() {
		return "administrativo/promocoes/selecao";
		
	}
	
	@GetMapping("/administrativo/promocoes/progressivo/listar")
	public ModelAndView listarProdutosProgressivo() {
		ModelAndView mv = new ModelAndView("administrativo/promocoes/progressivo/lista");
		mv.addObject("listaProdutosProgressivo", produtoRepositorio.findAll());
		return mv;
	}
}
