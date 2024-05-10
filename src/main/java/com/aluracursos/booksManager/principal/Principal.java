package com.aluracursos.booksManager.principal;

import com.aluracursos.booksManager.model.Datos;
import com.aluracursos.booksManager.model.DatosLibro;
import com.aluracursos.booksManager.service.ConsumoAPI;
import com.aluracursos.booksManager.service.ConvierteDatos;

import java.util.Comparator;
import java.util.Scanner;

public class Principal {

    private Scanner teclado = new Scanner(System.in);
    private final String URL_BASE = "https://gutendex.com/books/";
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos conversor = new ConvierteDatos();

    public void mostrarMenu(){

        var json = consumoAPI.obtenerDatos(URL_BASE);
        System.out.println(json);
        var datos = conversor.obtenerDatos(json, Datos.class);
        System.out.println(datos);

        // TOP 10 Libros más descargados
        System.out.println("Top 10 de libros más descargados");
        datos.resultados().stream()
                .sorted(Comparator.comparing(DatosLibro::descargas).reversed())
                .limit(10)
                .map(l -> l.titulo().toUpperCase())
                .forEach(System.out::println);

        

    }
}
