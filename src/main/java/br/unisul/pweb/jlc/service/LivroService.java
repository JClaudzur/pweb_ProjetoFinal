package br.unisul.pweb.jlc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.unisul.pweb.jlc.domain.Livro;
import br.unisul.pweb.jlc.repository.LivroRepository;


public class LivroService {

	@Autowired
	private LivroRepository livroRepository;
	
	
	//INSERIR
	public Livro insert (Livro obj) {
		obj.setId(null);
		return livroRepository.save(obj);
	}
			
			
	//LISTAR TODAS
	public List<Livro> findAll(){
		return livroRepository.findAll();
	}		
	
	
}
