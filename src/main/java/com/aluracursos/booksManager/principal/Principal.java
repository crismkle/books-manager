package com.aluracursos.booksManager.principal;

import com.aluracursos.booksManager.model.DatosLibro;
import com.aluracursos.booksManager.service.ConsumoAPI;
import com.aluracursos.booksManager.service.ConvierteDatos;

import java.util.Scanner;

public class Principal {

    private Scanner teclado = new Scanner(System.in);
    private final String URL_BASE = "https://gutendex.com/books/?search=world";
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos conversor = new ConvierteDatos();

    public void mostrarMenu(){

        var json = consumoAPI.obtenerDatos(URL_BASE);
        var datos = conversor.obtenerDatos(json, DatosLibro.class);
        System.out.println(json);
        System.out.println(datos);
    }
}
