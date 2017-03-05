/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Saul
 */
public class Clasificacion {
    private int idclasificacion;
    private int id_clasificacion_dep;
    private String descripcion;
    private int nivelclasificacion;

    /**
     * @return the idclasificacion
     */
    public int getIdclasificacion() {
        return idclasificacion;
    }

    /**
     * @param idclasificacion the idclasificacion to set
     */
    public void setIdclasificacion(int idclasificacion) {
        this.idclasificacion = idclasificacion;
    }

    /**
     * @return the id_clasificacion_dep
     */
    public int getId_clasificacion_dep() {
        return id_clasificacion_dep;
    }

    /**
     * @param id_clasificacion_dep the id_clasificacion_dep to set
     */
    public void setId_clasificacion_dep(int id_clasificacion_dep) {
        this.id_clasificacion_dep = id_clasificacion_dep;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the nivelclasificacion
     */
    public int getNivelclasificacion() {
        return nivelclasificacion;
    }

    /**
     * @param nivelclasificacion the nivelclasificacion to set
     */
    public void setNivelclasificacion(int nivelclasificacion) {
        this.nivelclasificacion = nivelclasificacion;
    }
}
