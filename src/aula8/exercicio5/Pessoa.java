package aula8.exercicio5;

import java.time.LocalDate;

public class Pessoa {
	private String nome;
	private LocalDate dataNascimento;
	private String login;
	public static final String SUFIXO = "@uniriotec.br";
	
	public Pessoa(String nome, String login,
			LocalDate dataNascimento){
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.login = login;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getLogin() {
		return login;
	}
	public String getEmail() {
		return login+SUFIXO;
	}
	public void setLogin(String login) {
		this.login = login;
	}
}

