package br.unisul.pweb.jlc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.unisul.pweb.jlc.domain.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
