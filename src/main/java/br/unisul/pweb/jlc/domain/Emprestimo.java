package br.unisul.pweb.jlc.domain;

import java.io.Serializable;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Emprestimo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="usuario_id")
	private Usuario user;
	
	
	@ManyToOne
	@JoinColumn(name="livro_id")
	@ElementCollection
	@CollectionTable(name="LIVROS")
	private Set<Livro> livros = new HashSet<>();
	
	private String dataAtual;
	private String dataDevolucao;// Calculos no service
	
	
	public Emprestimo() {
		
	}
	
	public Emprestimo (Integer id, Usuario user, String dataAtual, String dataDevolucao, Livro livro1, Livro livro2, Livro livro3) { 
		this.id = id;
		this.setUser(user);
		this.dataAtual = dataAtual;
		this.dataDevolucao = dataDevolucao;
		this.livros.add(livro1);
		this.livros.add(livro2);
		this.livros.add(livro3);
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Usuario getUser() {
		return user;
	}
	public void setUser(Usuario user) {
		this.user = user;
	}
	public Set<Livro> getLivros() {
		return livros;
	}
	public void setLivros(Set<Livro> livros) {
		this.livros = livros;
	}
	public String getDataAtual() {
		return dataAtual;
	}
	public void setDataAtual(String dataAtual) {
		this.dataAtual = dataAtual;
	}
	public String getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	
	
	
}
