package br.unisul.pweb.jlc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.unisul.pweb.jlc.domain.Usuario;
import br.unisul.pweb.jlc.repository.UsuarioRepository;

public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	//INSERIR
	public Usuario insert (Usuario obj) {
		obj.setId(null);
		return usuarioRepository.save(obj);
	}
			
			
	//LISTAR TODAS
	public List<Usuario> findAll(){
		return usuarioRepository.findAll();
	}		
	
}
