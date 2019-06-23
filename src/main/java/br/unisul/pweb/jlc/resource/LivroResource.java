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

import br.unisul.pweb.jlc.domain.Livro;
import br.unisul.pweb.jlc.service.LivroService;

@RestController
@RequestMapping(value="/livro")
public class LivroResource {
		
	@Autowired
	private LivroService livroService;
	
	//INSERIR
			@RequestMapping(method=RequestMethod.POST)
			public ResponseEntity<Void>insert(@RequestBody Livro obj){
				obj = livroService.insert(obj);
				URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
						path("/{id}").buildAndExpand(obj.getId()).toUri();
				return ResponseEntity.created(uri).build();
			}
			
			//LISTAR TODAS
			@RequestMapping(method=RequestMethod.GET)
			public ResponseEntity<List<Livro>> findAll() {
				List<Livro> lista = livroService.findAll(); 
				List<Livro> listaLivro = new ArrayList<Livro>();
				for (Livro l : lista) {
					listaLivro.add(l);
				}
				
				return ResponseEntity.ok().body(listaLivro);
			}
}
