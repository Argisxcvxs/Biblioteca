/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bibliotecaa;

/**
 *
 * @author augus
 */
import java.util.*;

public class Bibliotecaa {

    public static void main(String[] args) {
        // Crear un bibliotecario
        Bibliotecario bibliotecario = new Bibliotecario(1, "Juan Perez", "juan.perez@biblioteca.com");

        // Registrar nuevos usuarios
        Usuario usuario1 = bibliotecario.registrarUsuario(1, "Ana Gomez", "ana.gomez@correo.com");
        Usuario usuario2 = bibliotecario.registrarUsuario(2, "Carlos Ruiz", "carlos.ruiz@correo.com");

        // Agregar nuevos libros
        Libro libro1 = bibliotecario.agregarLibro(1, "El Quijote", "Miguel de Cervantes");
        Libro libro2 = bibliotecario.agregarLibro(2, "Cien Años de Soledad", "Gabriel Garcia Marquez");

        // Consultar información de los libros
        System.out.println(libro1.getInfo());
        System.out.println(libro2.getInfo());

        // Registrar préstamo de un libro
        bibliotecario.registrarPrestamo(libro1, usuario1);

        // Consultar disponibilidad del libro después del préstamo
        System.out.println("Disponibilidad de 'El Quijote': " + libro1.isDisponible());

        // Intentar prestar el mismo libro de nuevo
        bibliotecario.registrarPrestamo(libro1, usuario2);

        // Registrar devolución del libro
        bibliotecario.registrarDevolucion(libro1);

        // Consultar disponibilidad del libro después de la devolución
        System.out.println("Disponibilidad de 'El Quijote' despues de la devolucion: " + libro1.isDisponible());

        // Consultar el historial de préstamos de un usuario
        List<Prestamo> historial = usuario1.verHistorial();
        System.out.println("Historial de prestamos de Ana Gomez:");
        for (Prestamo prestamo : historial) {
            System.out.println("Libro: " + prestamo.getLibro().getInfo() + ", Fecha de prestamo: " + prestamo.getFechaPrestamo());
        }

        // Actualizar la información de un libro
        bibliotecario.actualizarLibro(libro2, "Cien Años de Soledad (Edicion Aniversario)", "Gabriel Garcia Marquez");
        System.out.println("Informacion actualizada de 'Cien Años de Soledad': " + libro2.getInfo());
    }
}

