package br.com.fatec.encomendas.api.entity;

import java.sql.Date;
import java.sql.Time;

public class Viagem {

	public static final String TABLE = "USUARIO";
	public static final String COL_ID = "ID";
	public static final String COL_VEICULO_ID = "VEICULO_ID";
	public static final String COL_HORA_INICIO = "HORA_INICIO";
	public static final String COL_HORA_FIM = "HORA_FIM";
	public static final String COL_DATA = "DATA";
	
	private Long id;
	private Veiculo veiculo;
	private Time horaInicio;
	private Time horaFim;
	private Date data;
	
	public Viagem() {
	}
	
	public Viagem(Long id, Veiculo veiculo, Time horaInicio, Time horaFim, Date data) {
		this.id = id;
		this.veiculo = veiculo;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
		this.data = data;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Time getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Time horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Time getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(Time horaFim) {
		this.horaFim = horaFim;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
}
