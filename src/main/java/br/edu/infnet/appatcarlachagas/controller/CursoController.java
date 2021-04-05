package br.edu.infnet.appatcarlachagas.controller;

	

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.SessionAttribute;
	import br.edu.infnet.appatcarlachagas.model.negocio.Curso;
	import br.edu.infnet.appatcarlachagas.model.negocio.Usuario;
	import br.edu.infnet.appatcarlachagas.model.service.CursoService;
	import br.edu.infnet.appatcarlachagas.model.service.InstituicaoService;
	import br.edu.infnet.appatcarlachagas.model.service.UsuarioService;

	@Controller
	public class CursoController {

		@Autowired
		private CursoService cursoService;
		
		@Autowired
		private InstituicaoService instituicaoService;
		
		@GetMapping(value = "/curso")
		 public String showDetalhe(Model model, @SessionAttribute("user") Usuario usuario) {
			 
			 
			 model.addAttribute("lista",cursoService.obterLista(usuario));
			 model.addAttribute("allinstituicao", instituicaoService.obterLista());

		@Autowired
		private UsuarioService usuarioService;
		
		@GetMapping(value = "/curso")
		 public String showDetalhe(Model model) {
			 
			 
			 model.addAttribute("lista",cursoService.obterLista());
			 model.addAttribute("allinstituicao", instituicaoService.obterLista());
			 model.addAttribute("usuarios", usuarioService.obterLista());
			 
			 
			 return "curso/detalhe";
		 }
		 
		 @PostMapping(value = "/curso/incluir")
		 public String incluir(Curso curso, @SessionAttribute("user") Usuario usuario) {
			 
			 curso.setUsuario(usuario);
			 
			 cursoService.incluir(curso);
			 
			 return "redirect:/curso";
		 }
		 @GetMapping(value = "/curso/{id}/excluir")
			public String excluir(Model model, @PathVariable Integer id) {
				
				
	 			cursoService.excluir(id);
			public String excluir (@PathVariable Integer id) {
				
				
				cursoService.excluir(id);
				
				
				return "redirect:/curso"; 
			}
	}	 
		
