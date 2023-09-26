package com.example.demo.model;

import java.util.Calendar;

public class Consulta {
    private int id;
    private Calendar dataHoraConsulta;

    private String motivoConsulta;

    public Consulta(){

    }
    public Consulta(int id, Calendar dataHoraConsulta, String motivoConsulta) {
        this.id = id;
        this.dataHoraConsulta = dataHoraConsulta;
        this.motivoConsulta = motivoConsulta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getDataHoraConsulta() {
        return dataHoraConsulta;
    }

    public void setDataHoraConsulta(Calendar dataHoraConsulta) {
        this.dataHoraConsulta = dataHoraConsulta;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "id=" + id +
                ", dataHoraConsulta=" + dataHoraConsulta +
                ", motivoConsulta='" + motivoConsulta + '\'' +
                '}';
    }
}
