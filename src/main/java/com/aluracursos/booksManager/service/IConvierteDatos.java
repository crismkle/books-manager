package com.aluracursos.booksManager.service;

public interface IConvierteDatos {

    <T> T obtenerDatos(String json, Class<T> clase);
}
