package br.com.fatec.encomendas.api.entity;

public class Ocorrencia {

	public static final String TABLE = "OCORRENCIA";
	public static final String COL_ID = "ID";
	public static final String COL_ENCOMENDA_ID = "ENCOMENDA_ID";
	public static final String COL_VIAGEM_ID = "VIAGEM_ID";
	public static final String COL_DESCRICAO = "DESCRICAO";
	public static final String COL_DATA_HORA = "DATA_HORA";
	public static final String COL_TIPO_OCORRENCIA = "TIPO_OCORRENCIA";

	private Long id;
	private String nome;
	
}
