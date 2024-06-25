/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecaa;

/**
 *
 * @author augus
 */
import java.util.*;

public class Prestamo {
    private Libro libro;
    private Date fechaPrestamo;

    public Prestamo(Libro libro) {
        this.libro = libro;
        this.fechaPrestamo = new Date();
    }

    public Libro getLibro() {
        return libro;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }
}

