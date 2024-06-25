/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecaa;

/**
 *
 * @author augus
 */
public class Bibliotecario {
    private int id;
    private String nombre;
    private String email;

    public Bibliotecario(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public Usuario registrarUsuario(int id, String nombre, String email) {
        return new Usuario(id, nombre, email);
    }

    public Libro agregarLibro(int id, String titulo, String autor) {
        return new Libro(id, titulo, autor);
    }

    public void registrarPrestamo(Libro libro, Usuario usuario) {
        if (libro.isDisponible()) {
            libro.prestar();
            usuario.agregarPrestamo(new Prestamo(libro));
        } else {
            System.out.println("Libro no disponible");
        }
    }

    public void registrarDevolucion(Libro libro) {
        libro.devolver();
    }

    public void actualizarLibro(Libro libro, String nuevoTitulo, String nuevoAutor) {
        libro.setTitulo(nuevoTitulo);
        libro.setAutor(nuevoAutor);
    }
}
