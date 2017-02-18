/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bernardo
 */

public class Equipos {
    private String nombre;
    private List<Jugadores> lstJuga;

    //Metodos get and set de cada atributo de la clase    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List getLstJuga() {
        return lstJuga;
    }

    public void setLstJuga(Jugadores jugador) {
        this.lstJuga.add(jugador);
    }
    
    //En el constructor se inicializa la lista
    public Equipos(){
        this.lstJuga = new ArrayList<>();
    }
}
