/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecaa;

import java.util.*;

public class Usuario {
    private int id;
    private String nombre;
    private String email;
    private List<Prestamo> historial;

    public Usuario(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.historial = new ArrayList<>();
    }

    public void agregarPrestamo(Prestamo prestamo) {
        historial.add(prestamo);
    }

    public List<Prestamo> verHistorial() {
        return historial;
    }

    public String getInfo() {
        return "ID: " + id + ", Nombre: " + nombre + ", Email: " + email;
    }
}
