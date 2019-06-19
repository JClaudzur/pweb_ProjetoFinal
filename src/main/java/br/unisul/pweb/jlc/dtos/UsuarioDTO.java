package br.unisul.pweb.jlc.dtos;

import java.io.Serializable;

import br.unisul.pweb.jlc.domain.Usuario;

public class UsuarioDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer codigo;
	private String nome;
	private String tipo;
	private String sexo;
	private Integer idade;
	
	
	public UsuarioDTO() {
		
	}
	
	public UsuarioDTO(Usuario user) {
		this.codigo = user.getId();
		this.idade = user.getIdade();
		this.nome = user.getNome();
		this.sexo = user.getSexo();
		this.tipo = user.getTipo();

	}
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	
	
	
}
