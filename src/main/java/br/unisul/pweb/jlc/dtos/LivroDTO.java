package br.unisul.pweb.jlc.dtos;

import java.io.Serializable;

import br.unisul.pweb.jlc.domain.Livro;

public class LivroDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer codigoLivro;
	private String titulo;
	private String areaConhecimento;
	private Integer numeroExemplares;
	private String localBiblioteca;
	
	public LivroDTO() {
		
	}
	
	public LivroDTO(Livro livro) {
		this.codigoLivro = livro.getId();
		this.titulo = livro.getTitulo();
		this.areaConhecimento = livro.getAreaConhecimento();
		this.numeroExemplares = livro.getNumExemplares();
		this.localBiblioteca = livro.getLocalBiblioteca();
	}
	
	
	public Integer getCodigoLivro() {
		return codigoLivro;
	}
	public void setCodigoLivro(Integer codigoLivro) {
		this.codigoLivro = codigoLivro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAreaConhecimento() {
		return areaConhecimento;
	}
	public void setAreaConhecimento(String areaConhecimento) {
		this.areaConhecimento = areaConhecimento;
	}
	public Integer getNumeroExemplares() {
		return numeroExemplares;
	}
	public void setNumeroExemplares(Integer numeroExemplares) {
		this.numeroExemplares = numeroExemplares;
	}
	public String getLocalBiblioteca() {
		return localBiblioteca;
	}
	public void setLocalBiblioteca(String localBiblioteca) {
		this.localBiblioteca = localBiblioteca;
	}
	
	
	
	
	
}
