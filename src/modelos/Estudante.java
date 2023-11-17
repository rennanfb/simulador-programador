package modelos;

import java.util.ArrayList;
import java.util.List;

public class Estudante {
    String nome;
    String direcionamento;
    String curso;
    List<String> tecnologias;

    public Estudante() {
        this.nome = nome;
        this.direcionamento = direcionamento;
        this.curso = curso;
        this.tecnologias = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDirecionamento() {
        return this.direcionamento;
    }

    public void setDirecionamento(String direcionamento) {
        this.direcionamento = direcionamento;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public List<String> getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(List<String> tecnologias) {
        this.tecnologias = tecnologias;
    }
}
