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
public class Proveedor {
    private int idproveedor;
    private String rfc;
    private String razonsocial;
    private String direccion;
    private String nombrecontacto;
    private String telefonoprincipal;
    private String telefonomovil;
    private String email;
    private String estatus;

    /**
     * @return the idproveedor
     */
    public int getIdproveedor() {
        return idproveedor;
    }

    /**
     * @param idproveedor the idproveedor to set
     */
    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }

    /**
     * @return the rfc
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * @param rfc the rfc to set
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * @return the razonsocial
     */
    public String getRazonsocial() {
        return razonsocial;
    }

    /**
     * @param razonsocial the razonsocial to set
     */
    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the nombrecontacto
     */
    public String getNombrecontacto() {
        return nombrecontacto;
    }

    /**
     * @param nombrecontacto the nombrecontacto to set
     */
    public void setNombrecontacto(String nombrecontacto) {
        this.nombrecontacto = nombrecontacto;
    }

    /**
     * @return the telefonoprincipal
     */
    public String getTelefonoprincipal() {
        return telefonoprincipal;
    }

    /**
     * @param telefonoprincipal the telefonoprincipal to set
     */
    public void setTelefonoprincipal(String telefonoprincipal) {
        this.telefonoprincipal = telefonoprincipal;
    }

    /**
     * @return the telefonomovil
     */
    public String getTelefonomovil() {
        return telefonomovil;
    }

    /**
     * @param telefonomovil the telefonomovil to set
     */
    public void setTelefonomovil(String telefonomovil) {
        this.telefonomovil = telefonomovil;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the estatus
     */
    public String getEstatus() {
        return estatus;
    }

    /**
     * @param estatus the estatus to set
     */
    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
}
