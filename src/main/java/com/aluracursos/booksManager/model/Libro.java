package com.aluracursos.booksManager.model;

import java.lang.reflect.Array;
import java.util.List;

public class Libro {
    private int id;
    private String titulo;
    private List<String> temas;
    private List<String> estante;
    private List<String> idiomas;
    private int descargas;

    public Libro(int id, String titulo, List<String> temas, List<String> estante, List<String> idiomas, int descargas) {
        this.id = id;
        this.titulo = titulo;
        this.temas = temas;
        this.estante = estante;
        this.idiomas = idiomas;
        this.descargas = descargas;
    }

    public List<String> getTemas() {
        return temas;
    }

    public void setTemas(List<String> temas) {
        this.temas = temas;
    }

    public List<String> getEstante() {
        return estante;
    }

    public void setEstante(List<String> estante) {
        this.estante = estante;
    }

    public List<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(List<String> idiomas) {
        this.idiomas = idiomas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDescargas() {
        return descargas;
    }

    public void setDescargas(int descargas) {
        this.descargas = descargas;
    }
}
