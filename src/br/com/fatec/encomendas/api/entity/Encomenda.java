package br.com.fatec.encomendas.api.entity;

public class Encomenda {

	public static final String TABLE = "ENCOMENDA";
	public static final String COL_ID = "ID";
	public static final String COL_USUARIO_ID = "USUARIO_ID";
	public static final String COL_STATUS = "STATUS";

	private Long id;
	private Usuario usuario;
	private String status;
	
	public Encomenda() {
	}
	
	public Encomenda(Long id, Usuario usuario, String status) {
		this.id = id;
		this.usuario = usuario;
		this.status = status;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
