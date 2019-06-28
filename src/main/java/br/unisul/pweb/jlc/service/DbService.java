package br.unisul.pweb.jlc.service;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;

import br.unisul.pweb.jlc.domain.Emprestimo;
import br.unisul.pweb.jlc.domain.Livro;
import br.unisul.pweb.jlc.domain.Usuario;
import br.unisul.pweb.jlc.repository.EmprestimoRepository;
import br.unisul.pweb.jlc.repository.LivroRepository;
import br.unisul.pweb.jlc.repository.UsuarioRepository;

public class DbService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private LivroRepository livroRepository;
	
	@Autowired
	private EmprestimoRepository emprestimoRepository;
	
	
	public void inicializaBancoDeDados() throws ParseException {
		
		Usuario user1 = new Usuario(null, "Julia", "Professor", "Fem", 19);
		Usuario user2 = new Usuario(null, "Ezra", "Aluno", "Mas", 19);
		
		Livro l1 = new Livro();
		Livro l2 = new Livro();
		Livro l3 = new Livro();
		
		Emprestimo e1 = new Emprestimo();
		Emprestimo e2 = new Emprestimo();
		
	}
	
}
