package br.com.fatec.encomendas.api.dao;

import java.util.List;

import br.com.fatec.encomendas.api.entity.Ocorrencia;

public interface OcorrenciaDAO {
	
	Long save (Ocorrencia ocorrencia);
	
	void upadate (Ocorrencia ocorrencia);
	
	void delete (Long id);
	
	Ocorrencia findById (Long id);

	List<Ocorrencia> findAll();
}