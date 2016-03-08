package br.com.fatec.encomendas.api.entity;

public class Cidade {

	public static final String TABLE = "CIDADE";
	public static final String COL_ID = "ID";
	public static final String COL_NOME = "NOME";
	public static final String COL_ESTADO_ID = "ESTADO_ID";

	private Long id;
	private String nome;
	private Estado estado;
	
	public Cidade() {
	}
	
	public Cidade(Long id, String nome, Estado estado) {
		this.id = id;
		this.nome = nome;
		this.estado = estado;
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

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
}
