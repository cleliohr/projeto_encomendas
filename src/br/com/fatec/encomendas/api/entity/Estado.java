package br.com.fatec.encomendas.api.entity;

public class Estado {

	public static final String TABLE = "ESTADO";
	public static final String COL_ID = "ID";
	public static final String COL_CEP = "NOME";

	private Long id;
	private String nome;
	
	public Estado() {
	}
	
	public Estado(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
