package br.edu.infnet.appatcarlachagas.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appatcarlachagas.model.negocio.Instituicao;
import br.edu.infnet.appatcarlachagas.model.repository.IInstituicaoRepository;

@Service
public class InstituicaoService {
	
	@Autowired
	private IInstituicaoRepository instituicaoRepository;
	
	//incluir
	public void incluir(Instituicao instituicao) {
		instituicaoRepository.save(instituicao);
	}
	//excluir
	public void excluir (Integer id) {
		instituicaoRepository.deleteById(id);
	}
	//obterlista
	public List<Instituicao> obterLista () {
		return (List<Instituicao>)instituicaoRepository.findAll();
	}

}
