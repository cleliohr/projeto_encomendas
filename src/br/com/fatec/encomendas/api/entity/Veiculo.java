package br.com.fatec.encomendas.api.entity;

public class Veiculo {

	public static final String TABLE = "USUARIO";
	public static final String COL_ID = "ID";
	public static final String COL_NOME = "NOME";
	public static final String COL_ZONA_ID = "ZONA_ID";
	
	private Long id;
	private String nome;
	private Zona zona;
	
	public Veiculo() {
	}
	
	public Veiculo(Long id, String nome, Zona zona) {
		this.id = id;
		this.nome = nome;
		this.zona = zona;
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

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}
	
}
