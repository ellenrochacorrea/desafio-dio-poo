import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEllen = new Dev();
        devEllen.setNome("Ellen");
        devEllen.incscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + devEllen.getNome() + devEllen.getConteudosInscritos());
        devEllen.progredir();
        devEllen.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos " + devEllen.getNome() + devEllen.getConteudosInscritos());
        System.out.println("Conteúdos concluidos " + devEllen.getNome() + devEllen.getConteudosConcluidos());
        System.out.println("XP: " + devEllen.calcularTotalXP());


        System.out.println("--------");

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.incscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + devGabriel.getNome() + devGabriel.getConteudosInscritos());
        devGabriel.progredir();
        devGabriel.progredir();
        devGabriel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos " + devGabriel.getNome() + devGabriel.getConteudosInscritos());
        System.out.println("Conteúdos concluidos " + devGabriel.getNome() + devGabriel.getConteudosConcluidos());
        System.out.println("XP: " + devGabriel.calcularTotalXP());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);
    }
}