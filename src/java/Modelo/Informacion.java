/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Calendar;

/**
 *
 * @author Johan Sánchez
 */
class Informacion {
    private String nombre,categoria;
    private Object contenido;
    private Calendar fecha; 
    private PC unPc;

    public Informacion(String nombre, String categoria, Object contenido, Calendar fecha, PC unPc) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.contenido = contenido;
        this.fecha = fecha;
        this.unPc = unPc;
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

    public Object getContenido() {
        return contenido;
    }

    public void setContenido(Object contenido) {
        this.contenido = contenido;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public PC getUnPc() {
        return unPc;
    }

    public void setUnPc(PC unPc) {
        this.unPc = unPc;
    }
    
    
}
