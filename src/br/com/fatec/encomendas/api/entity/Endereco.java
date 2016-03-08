package br.com.fatec.encomendas.api.entity;

public class Endereco {

	public static final String TABLE = "ENDERECO";
	public static final String COL_ID = "ID";
	public static final String COL_CEP = "CEP";
	public static final String COL_CIDADE_ID = "CIDADE_ID";
	public static final String COL_LOGRADOURO = "LOGRADOURO";
	public static final String COL_BAIRRO = "BAIRRO";
	public static final String COL_ZONA_ID = "ZONA_ID";

	private Long id;
	private String cep;
	private Cidade cidade;
	private String logradouro;
	private String bairro;
	private Zona zona;
	
	public Endereco() {
	}
	
	public Endereco(Long id, String cep, Cidade cidade, String logradouro, String bairro, Zona zona) {
		this.id = id;
		this.cep = cep;
		this.cidade = cidade;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.zona = zona;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}

}
