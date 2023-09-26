package com.example.demo.model;

import java.util.Calendar;

public class Profissional {
    private int id;
    private String nome;
    private String email;
    private int crm;
    private String especialidade;

    private Calendar dataCadastro;

    public Profissional() {

    }

    public Profissional(int id, String nome, String email, int crm, String especialidade, Calendar dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.crm = crm;
        this.especialidade = especialidade;
        this.dataCadastro = dataCadastro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Calendar getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Calendar dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return "Profissional{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", crm=" + crm +
                ", especialidade='" + especialidade + '\'' +
                ", dataCadastro=" + dataCadastro +
                '}';
    }
}
