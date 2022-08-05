import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev01= new Dev();
        dev01.setNome("Elaine");
        dev01.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + dev01.getConteudosInscritos());
        dev01.progredir();
        dev01.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + dev01.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + dev01.getConteudosConcluidos());
        System.out.println("XP:" + dev01.calcularTotalXp());

        System.out.println("-------");

        Dev dev02 = new Dev();
        dev02.setNome("Pedro");
        dev02.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + dev02.getConteudosInscritos());
        dev02.progredir();
        dev02.progredir();
        dev02.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + dev02.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + dev02.getConteudosConcluidos());
        System.out.println("XP:" + dev02.calcularTotalXp());

    }

}
