package com.infoa.ManutencaoMaquinas.Models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ocorrencia")
public class Ocorrencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name="id")
    private Integer id;

     @Column(name="data")
    private LocalDate data;

     @Column(name="gravidade")
    private String gravidade;

     @Column(name="solucao")
    private String solucao;

     @Column(name="tempopararesolucao")
    private int tempoParaResolucao;

    public Ocorrencia() {}

    public Ocorrencia(LocalDate data, String gravidade, String solucao, int tempoParaResolucao, Integer id) {
        this.data = data;
        this.gravidade = gravidade;
        this.solucao = solucao;
        this.tempoParaResolucao = tempoParaResolucao;
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getGravidade() {
        return gravidade;
    }

    public void setGravidade(String gravidade) {
        this.gravidade = gravidade;
    }

    public String getSolucao() {
        return solucao;
    }

    public void setSolucao(String solucao) {
        this.solucao = solucao;
    }

    public int getTempoParaResolucao() {
        return tempoParaResolucao;
    }

    public void setTempoParaResolucao(int tempoParaResolucao) {
        this.tempoParaResolucao = tempoParaResolucao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
}
