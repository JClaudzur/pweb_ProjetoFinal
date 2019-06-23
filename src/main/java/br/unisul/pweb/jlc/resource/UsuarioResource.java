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

import br.unisul.pweb.jlc.domain.Usuario;
import br.unisul.pweb.jlc.service.UsuarioService;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioResource {

	
	@Autowired
	private UsuarioService usuarioService;

	
	//INSERIR
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void>insert(@RequestBody Usuario obj){
		obj = usuarioService.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
				path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	//LISTAR TODAS
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Usuario>> findAll() {
		List<Usuario> lista = usuarioService.findAll(); 
		List<Usuario> listaUsuario = new ArrayList<Usuario>();
		for (Usuario u : lista) {
			listaUsuario.add(u);
		}
		
		return ResponseEntity.ok().body(listaUsuario);
	}
	
	
}
