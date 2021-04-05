package br.edu.infnet.appatcarlachagas.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appatcarlachagas.model.negocio.Curso;

@Repository
public interface ICursoRepository extends CrudRepository<Curso, Integer>{

	
	@Query("from Curso c where c.usuario.id=:id")
	List<Curso> obterLista(Integer id, Sort by);
}
