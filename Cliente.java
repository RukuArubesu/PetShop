package Modelo;


public class Cliente {
	private String CPF;
	private String nome;
	private Long Id;
	private Animal Louro;
	
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public Animal getLouro() {
		return Louro;
	}
	public void setLouro(Animal louro) {
		Louro = louro;
	}

}
