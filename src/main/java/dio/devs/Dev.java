package dio.devs;

import dio.cursos.Curso;
import dio.mentorias.Mentoria;

import java.util.ArrayList;
import java.util.List;

public class Dev {
    private String nome;
    private List<Curso> cursos;
    private List<Mentoria> mentorias = new ArrayList<>();

    public Dev(String nome, List<Curso> cursos, List<Mentoria> mentorias) {
        this.nome = nome;
        this.cursos = cursos;
        this.mentorias = mentorias;
    }

    public String getNome() {
        return nome;
    }

    public List<Curso> getAtividades() {
        return cursos;
    }

    public List<Mentoria> getMentorias() {
        return mentorias;
    }

    public void inscreverNoBootcamp() {

    }

    public void progredir() {

    }

    public void calculaTotalXP() {

    }

    public void exibirCursos() {

    }


}
