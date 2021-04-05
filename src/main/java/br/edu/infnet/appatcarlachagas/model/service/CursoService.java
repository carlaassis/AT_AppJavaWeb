package br.edu.infnet.appatcarlachagas.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.appatcarlachagas.model.negocio.Curso;
import br.edu.infnet.appatcarlachagas.model.negocio.Usuario;
import br.edu.infnet.appatcarlachagas.model.repository.ICursoRepository;

@Service
public class CursoService {
	
	@Autowired
	private ICursoRepository cursoRepository;

	public List<Curso> obterLista(Usuario usuario) {
		
		return (List<Curso>)cursoRepository.obterLista(usuario.getId(), 
				Sort.by(Sort.Direction.ASC, "descricao"));
	}

	public List<Curso> obterLista() {
		
		return (List<Curso>)cursoRepository.findAll();
	}
	public void incluir(Curso curso) {
		cursoRepository.save(curso);
	}
	
	public void excluir (Integer id) {
		cursoRepository.deleteById(id);
	}
	
	
}
