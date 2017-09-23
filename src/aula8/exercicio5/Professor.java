package aula8.exercicio5;

import java.time.LocalDate;

public class Professor extends Pessoa {
	private String matriculaSiape;
	private String departamento;
	
	public Professor(String nome, String login, LocalDate dataNascimento, String matriculaSiape, String departamento) {
		super(nome, login, dataNascimento);
		this.matriculaSiape = matriculaSiape;
		this.departamento = departamento;
	}

	public String getMatriculaSiape() {
		return matriculaSiape;
	}


	public void setMatriculaSiape(String matriculaSiape) {
		this.matriculaSiape = matriculaSiape;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}	
}
