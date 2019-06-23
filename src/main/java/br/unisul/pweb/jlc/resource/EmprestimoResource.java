package br.unisul.pweb.jlc.resource;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.unisul.pweb.jlc.domain.Emprestimo;
import br.unisul.pweb.jlc.service.EmprestimoService;

@RestController
@RequestMapping(value= "/emprestimo")
public class EmprestimoResource {

	@Autowired
	private EmprestimoService emprestimoService;

	
	//INSERIR
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void>insert(@RequestBody Emprestimo obj){
		obj = emprestimoService.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
				path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	//LISTAR TODAS
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Emprestimo>> findAll() {
		List<Emprestimo> lista = emprestimoService.findAll(); 
		List<Emprestimo> listaEmprestimo = new ArrayList<Emprestimo>();
		for (Emprestimo e : lista) {
			listaEmprestimo.add(e);
		}
		
		return ResponseEntity.ok().body(listaEmprestimo);
	}
	
	
}
