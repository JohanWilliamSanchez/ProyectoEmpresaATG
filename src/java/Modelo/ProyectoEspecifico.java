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
class ProyectoEspecifico {
    private String nombreProyectoEspecifico, empresa, categoria;
    private int año;
    private PC unPC;
    private ArrayList<Informacion> listaInformacion;

    public String getNombreProyectoEspecifico() {
        return nombreProyectoEspecifico;
    }

    public void setNombreProyectoEspecifico(String nombreProyectoEspecifico) {
        this.nombreProyectoEspecifico = nombreProyectoEspecifico;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public PC getUnPC() {
        return unPC;
    }

    public void setUnPC(PC unPC) {
        this.unPC = unPC;
    }

    public ArrayList<Informacion> getListaInformacion() {
        return listaInformacion;
    }

    public void setListaInformacion(ArrayList<Informacion> listaInformacion) {
        this.listaInformacion = listaInformacion;
    }

    public ProyectoEspecifico(String nombreProyectoEspecifico, String empresa, String categoria, int año, PC unPC, ArrayList<Informacion> listaInformacion) {
        this.nombreProyectoEspecifico = nombreProyectoEspecifico;
        this.empresa = empresa;
        this.categoria = categoria;
        this.año = año;
        this.unPC = unPC;
        this.listaInformacion = listaInformacion;
    }
    
    
}
