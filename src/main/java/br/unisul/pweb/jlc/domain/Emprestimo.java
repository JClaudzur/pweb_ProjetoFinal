package br.unisul.pweb.jlc.domain;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;


@Entity
public class Emprestimo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private Usuario usuario;
	Date dtAtual = new Date();
	SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy");
	
}
