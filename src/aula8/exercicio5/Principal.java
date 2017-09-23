package aula8.exercicio5;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		//Cadastrar um novo aluno, professor ou disciplina
		ArrayList<Aluno> alunos = new ArrayList<>();
		ArrayList<Professor> professores = new ArrayList<>();
		ArrayList<Disciplina> disciplinas = new ArrayList<>();
		//polimorfismo
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		
		Professor luzia = new Professor("Luzia",
				"luzia_tonton", LocalDate.of(1960, 10, 15), 
				"2005101010", "MATEMATICA");
		
		Professor flavia = new Professor("Flavia",
				"flavia_linda", LocalDate.of(1990, Month.DECEMBER, 30), 
				"2003202200", "INFORMATICA");
		
		Disciplina matematica = new Disciplina("Matematica",
				"MAT101", "sadasd", 4, luzia);
		
		disciplinas.add(matematica);
		professores.add(luzia);
		professores.add(flavia);
		pessoas.add(luzia);
		pessoas.add(flavia);
		
		Aluno bia = new Aluno("Beatriz", "bia_fofinha",
				LocalDate.of(2000, 10, 11), "20171210017", 
				"BSI", 20171, luzia);
		
		Aluno bianca = new Aluno("Beatrizanca", "bianca_fofinha",
				LocalDate.of(2001, 9, 20), "20172000017", 
				"BSI", 20172, luzia);
		
		Aluno bianca2 = new Aluno("Beatrizanca", "bianca_fofinha",
				LocalDate.of(2002, 9, 21), "20172000017", 
				"BSI", 20172, luzia);
		
		alunos.add(bianca2);
		alunos.add(bia);
		alunos.add(bianca);
		pessoas.add(bia);
		
		//Imprimir lista de alunos e seus e-mails
		for(int i = 0; i<alunos.size(); i++)
			System.out.println(alunos.get(i).getEmail());
		
		//Imprimir lista de professores e suas matrículas
		//SIAPE
		for(Professor p : professores)
			System.out.println(p.getNome()+ " " +
							p.getMatriculaSiape());		
	
	
	//I Imprimir lista de aniversários de todas as pessoas,
	//em ordem cronológica
	//pessoas aniversarios
		
	ordenarListaPessoasPorDataNascimento(pessoas);
	for(Pessoa a : pessoas)
		System.out.println(a.getDataNascimento());
		
	
	// Imprimir lista de disciplinas e seus responsáveis
	for(Disciplina disc : disciplinas)
		System.out.println(disc.getNome() + " " +
						disc.getResponsavel().getNome());
		
	
}
	public static void ordenarListaPessoasPorDataNascimento(ArrayList<Pessoa> pessoas) {	
		for(int j=0; j<pessoas.size(); j++)
			//compara duas pessoas por vez, o -j no final garante que nao facamos loops desnecessarios
			//conferindo as datas mais à direita que já são as maiores
			for(int i = 0; i<pessoas.size()-1-j; i++){
				Pessoa pessoaAEsquerda = pessoas.get(i);
				Pessoa pessoaADireita = pessoas.get(i+1);
				if(pessoaAEsquerda.getDataNascimento().compareTo(pessoaADireita.getDataNascimento()) > 0) {
					//troco de lugar, pessoaAEsquerda vai para direita; pessoaADireita vai para a esquerda
					pessoas.set(i+1, pessoaAEsquerda);
					pessoas.set(i, pessoaADireita);
				}
			}
	}
	
}
