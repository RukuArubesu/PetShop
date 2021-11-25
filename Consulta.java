package Modelo;

import java.util.Date;

public class Consulta {
	private Date data_entrada;
	private Date hora;
	private Medico m_1;
	public Date getData_entrada() {
		return data_entrada;
	}
	public void setData_entrada(Date data_entrada) {
		this.data_entrada = data_entrada;
	}
	public Date getHora() {
		return hora;
	}
	public void setHora(Date hora) {
		this.hora = hora;
	}
	public Medico getM_1() {
		return m_1;
	}
	public void setM_1(Medico m_1) {
		this.m_1 = m_1;
	}
}
