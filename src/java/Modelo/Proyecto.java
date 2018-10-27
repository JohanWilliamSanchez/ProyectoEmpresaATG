/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Johan Sánchez
 */
public class Proyecto {
    private String nombre,categoria;
    private ArrayList<ProyectoEspecifico> listaProyectosEspecificos;

    public Proyecto(String nombre, String categoria, ArrayList<ProyectoEspecifico> listaProyectosEspecificos) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.listaProyectosEspecificos = listaProyectosEspecificos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<ProyectoEspecifico> getListaProyectosEspecificos() {
        return listaProyectosEspecificos;
    }

    public void setListaProyectosEspecificos(ArrayList<ProyectoEspecifico> listaProyectosEspecificos) {
        this.listaProyectosEspecificos = listaProyectosEspecificos;
    }
    
    
}
