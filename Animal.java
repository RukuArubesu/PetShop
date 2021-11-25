package Modelo;

import java.util.Date;
import java.util.List;

public class Animal {
	private String nome;
	private Long id;
	private Date entrada;
	private List<String> exames;
	private int idade;
	private Consulta c_0;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {	
		this.id = id;
	}
	public List<String> getExames() {
		return exames;
	}
	public void setExames(List<String> exames) {
		this.exames = exames;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Date getEntrada() {
		return entrada;
	}
	public void setEntrada(Date entrada) {
		this.entrada = entrada;
	}
	public Consulta getC_0() {
		return c_0;
	}
	public void setC_0(Consulta c_0) {
		this.c_0 = c_0;
	}
	
}
