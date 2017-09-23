package aula8.exercicio5;

public class Disciplina {
	private String nome;
	private String codigo;
	private String ementa;
	private int cargaHorariaSemanal;
	private Professor responsavel;
	
	public Disciplina(String nome, String codigo, String ementa, int cargaHorariaSemanal, Professor responsavel) {
		this.nome = nome;
		this.codigo = codigo;
		this.ementa = ementa;
		this.cargaHorariaSemanal = cargaHorariaSemanal;
		this.responsavel = responsavel;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getEmenta() {
		return ementa;
	}
	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}
	public int getCargaHorariaSemanal() {
		return cargaHorariaSemanal;
	}
	public void setCargaHorariaSemanal(int cargaHorariaSemanal) {
		this.cargaHorariaSemanal = cargaHorariaSemanal;
	}
	public Professor getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Professor responsavel) {
		this.responsavel = responsavel;
	}
}
