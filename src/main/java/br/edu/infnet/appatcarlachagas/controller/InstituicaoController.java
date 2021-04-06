package br.edu.infnet.appatcarlachagas.controller;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import br.edu.infnet.appatcarlachagas.model.negocio.Instituicao;
	import br.edu.infnet.appatcarlachagas.model.service.InstituicaoService;

	@Controller
	public class InstituicaoController {
		
		@Autowired
		private InstituicaoService instituicaoService;
	 
		@GetMapping(value = "/instituicao")
		 public String showDetalhe(Model model) {
			
			model.addAttribute("lista", instituicaoService.obterLista());

			 return "instituicao/detalhe";
	}
		
		@PostMapping(value = "/instituicao/incluir")
		public String incluir(Instituicao instituicao) {

			instituicaoService.incluir(instituicao);
			
			return "redirect:/instituicao";
		}
			
		@GetMapping(value = "/instituicao/{id}/excluir")
		public String excluir (Model model, @PathVariable Integer id) {
			try {
				 instituicaoService.excluir(id);

			} catch (Exception e) {
				model.addAttribute("mensagem", "A Instituição não pode ser excluída: " + e.getMessage());
				return showDetalhe(model);
			}	
			instituicaoService.excluir(id);
			
			return "redirect:/instituicao";
		}
		
	}

