import dio.cursos.Curso;
import dio.devs.Dev;
import dio.mentorias.Mentoria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bootcamp {

    private String nome;
    private String descricao;
    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private List<Curso> cursos = new ArrayList<>();
    private List<Dev> devs = new ArrayList<>();
    private List<Mentoria> mentorias = new ArrayList<>();

    public Bootcamp(String nome, String descricao, LocalDate dataInicial, LocalDate dataFinal, List<Curso> cursos, List<Dev> devs, List<Mentoria> mentorias) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.cursos = cursos;
        this.devs = devs;
        this.mentorias = mentorias;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public List<Dev> getDevs() {
        return devs;
    }

    public List<Mentoria> getMentorias() {
        return mentorias;
    }
}
