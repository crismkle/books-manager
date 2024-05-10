package com.aluracursos.booksManager.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

public record DatosLibro(
        @JsonAlias("results") List<Libro> resultado
//        @JsonAlias("id") int id,
//        @JsonAlias("title") String titulo,
//        @JsonAlias("subjects") List<String> temas,
//        @JsonAlias("bookshelves") List<String> estante,
//        @JsonAlias("languages") List<String> idiomas,
//        @JsonAlias("download_count") String descargas
) {
}
