package br.com.fatec.encomendas.api.dao;

import java.util.List;

import br.com.fatec.encomendas.api.entity.Usuario;

public interface UsuarioDAO {
	
	Long save (Usuario usuario);
	
	void upadate (Usuario usuario);
	
	void delete (Long id);
	
	Usuario findById (Long id);

	List<Usuario> findAll();
}