package desafio.poo.dio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descricao curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Descricao curso JS");
		curso2.setCargaHoraria(8);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descricao mentoria Java");
		mentoria.setData(LocalDate.now());
		
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devAna = new Dev();
		devAna.setNome("Ana");
		devAna.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos" + devAna.getConteudosInscritos());
		devAna.progredir();
		System.out.println("-"); 
		System.out.println("Conteúdos Inscritos" + devAna.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos" + devAna.getConteudosConcluidos());
		System.out.println("XP: " + devAna.calcularTotalXp());
		
		
		System.out.println("------");
		
		
		Dev devJoao = new Dev();
		devJoao.setNome("Joao");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos" + devJoao.getConteudosInscritos());
		devJoao.progredir();
		System.out.println("-"); 
		System.out.println("Conteúdos Inscritos" + devJoao.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos" + devJoao.getConteudosConcluidos());
		System.out.println("XP: " + devJoao.calcularTotalXp());
	
	}
}
