/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Johan Sánchez
 */
public class Encargado {
    private String correoElectronico;
    private ProyectoEspecifico especifico;
    private Informacion informacion;

    public Encargado(String correoElectronico, ProyectoEspecifico especifico, Informacion informacion) {
        this.correoElectronico = correoElectronico;
        this.especifico = especifico;
        this.informacion = informacion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public ProyectoEspecifico getEspecifico() {
        return especifico;
    }

    public void setEspecifico(ProyectoEspecifico especifico) {
        this.especifico = especifico;
    }

    public Informacion getInformacion() {
        return informacion;
    }

    public void setInformacion(Informacion informacion) {
        this.informacion = informacion;
    }
    
    
}
