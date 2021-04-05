package br.edu.infnet.appatcarlachagas.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appatcarlachagas.model.negocio.Instituicao;

@Repository
public interface IInstituicaoRepository extends CrudRepository<Instituicao, Integer>{

}
