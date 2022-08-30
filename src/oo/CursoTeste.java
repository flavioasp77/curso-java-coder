package oo;

public class CursoTeste {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");
		
		Curso curso1 = new Curso("Java Avançado");
		Curso curso2 = new Curso("web 2023");
		Curso curso3 = new Curso("React Native");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adcionarCurso(curso3);
		aluno2.adcionarCurso(curso3);
		aluno3.adcionarCurso(curso3);
		
		for (Aluno aluno : curso2.alunos) {
			System.out.printf("Sou o %s e estou matriculado no curso %s.\n", aluno.nome, curso2.nome);
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Avançado");
		
		if (cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}
}
