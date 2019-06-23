package br.unisul.pweb.jlc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.unisul.pweb.jlc.domain.Emprestimo;
import br.unisul.pweb.jlc.repository.EmprestimoRepository;

public class EmprestimoService {

	@Autowired
	private EmprestimoRepository emprestimoRepository;
	
	
	//INSERIR
	public Emprestimo insert (Emprestimo obj) {
		obj.setId(null);
		return emprestimoRepository.save(obj);
	}
			
			
	//LISTAR TODAS
	public List<Emprestimo> findAll(){
		return emprestimoRepository.findAll();
	}		
	
}
