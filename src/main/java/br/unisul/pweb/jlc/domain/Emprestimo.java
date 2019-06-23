package br.unisul.pweb.jlc.domain;

import java.io.Serializable;

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
	@JoinColumn(name="livro1_id")
	private Livro livro1;
	
	@ManyToOne
	@JoinColumn(name="livro2_id")
	private Livro livro2;
	
	@ManyToOne
	@JoinColumn(name="livro3_id")
	private Livro livro3;
	
	private String dataAtual;
	private String dataDevolucao;// Calculos no service
	
	
	public Emprestimo() {
		
	}
	
	public Emprestimo (Integer id, Usuario user, String dataAtual, String dataDevolucao, Livro livro1, Livro livro2, Livro livro3) { 
		this.id = id;
		this.setUser(user);
		this.dataAtual = dataAtual;
		this.dataDevolucao = dataDevolucao;
		this.livro1 = livro1;
		this.livro2 = livro2;
		this.livro3 = livro3;
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
	
	public Livro getLivro1() {
		return livro1;
	}

	public void setLivro1(Livro livro1) {
		this.livro1 = livro1;
	}

	public Livro getLivro2() {
		return livro2;
	}

	public void setLivro2(Livro livro2) {
		this.livro2 = livro2;
	}

	public Livro getLivro3() {
		return livro3;
	}

	public void setLivro3(Livro livro3) {
		this.livro3 = livro3;
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
