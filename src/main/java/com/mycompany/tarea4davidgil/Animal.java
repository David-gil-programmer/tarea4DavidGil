/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea4davidgil;

/**
 *
 * @author david
 */
public class Animal {
    private int numpatas;
    private String nombre;
    private String tipo;

    public Animal() {
        this.numpatas = 4;
        this.nombre = "KIRA";
        this.tipo = "PERRO";
    }

    public Animal(int numpatas, String nombre, String tipo) {
        this.numpatas = numpatas;
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
}
