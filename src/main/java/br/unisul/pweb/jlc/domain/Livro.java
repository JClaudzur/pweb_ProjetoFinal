package br.unisul.pweb.jlc.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Livro implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String titulo;
	private String areaConhecimento;
	private Integer numExemplares;
	private String localBiblioteca;
	
	public Livro() {
		
	}
	
	public Livro(Integer id, String titulo, String areaConhecimento, Integer numExemplares, String localBibliteca) {
		this.id = id;
		this.areaConhecimento = areaConhecimento;
		this.numExemplares = numExemplares;
		this.localBiblioteca = localBibliteca;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getNumExemplares() {
		return numExemplares;
	}

	public void setNumExemplares(Integer numExemplares) {
		this.numExemplares = numExemplares;
	}

	public String getLocalBiblioteca() {
		return localBiblioteca;
	}

	public void setLocalBiblioteca(String localBiblioteca) {
		this.localBiblioteca = localBiblioteca;
	}
	
	
	
	
}
