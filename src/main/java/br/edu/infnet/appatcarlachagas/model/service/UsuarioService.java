package br.edu.infnet.appatcarlachagas.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.appatcarlachagas.model.negocio.Instituicao;
import br.edu.infnet.appatcarlachagas.model.negocio.Usuario;
import br.edu.infnet.appatcarlachagas.model.repository.IUsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private IUsuarioRepository usuarioRepository;
	
	public Usuario autenticacao(String email, String senha) {
		return usuarioRepository.autenticacao(email, senha);
	}

	public List<Usuario> obterLista() {
		
		return (List<Usuario>)usuarioRepository.findAll();
	}

	public void incluir(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	//excluir
	public void excluir (Integer id) {
		usuarioRepository.deleteById(id);
	}

}