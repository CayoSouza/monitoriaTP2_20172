package aula8.exercicio5;

import java.time.LocalDate;

public class Aluno extends Pessoa {
	private String matriculaUnirio;
	private String curso;
	private int periodoEntrada;
	private Professor orientador;

	public Aluno(String nome, String login, LocalDate dataNascimento, String matriculaUnirio, String curso,
			int periodoEntrada, Professor orientador) {
		super(nome, login, dataNascimento);
		this.matriculaUnirio = matriculaUnirio;
		this.curso = curso;
		this.periodoEntrada = periodoEntrada;
		this.setOrientador(orientador);
	}

	public String getMatriculaUnirio() {
		return matriculaUnirio;
	}

	public void setMatriculaUnirio(String matriculaUnirio) {
		this.matriculaUnirio = matriculaUnirio;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getPeriodoEntrada() {
		return periodoEntrada;
	}

	public void setPeriodoEntrada(int periodoEntrada) {
		this.periodoEntrada = periodoEntrada;
	}

	public Professor getOrientador() {
		return orientador;
	}

	public void setOrientador(Professor orientador) {
		this.orientador = orientador;
	}

}
