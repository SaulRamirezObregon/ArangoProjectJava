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
public class Articulo {
    private String cod_barras;
    private String codbarras;
    private String codasociados;
    private Clasificacion clasificacion;
    private String codinterno;
    private String descripcion;
    private String descripcioncorta;
    private float  cantidad_um;
    private UnidadMedida unidadmedida;
    private Proveedor proveedor;
    private float precio_compra;
    private float utilidad;
    private float precio_venta;
    private String tipo_articulo;
    private float stock;
    private float stock_min;
    private float stock_max;
    private float iva;
    private String kit_fecha_ini;
    private String kit_fecha_fin;
    private int articulo_disponible;
    private boolean kit;
    private String fecha_registro;
    

    /**
     * @return the cod_barras
     */
    public String getCod_barras() {
        return cod_barras;
    }

    /**
     * @param cod_barras the cod_barras to set
     */
    public void setCod_barras(String cod_barras) {
        this.cod_barras = cod_barras;
    }

    /**
     * @return the codbarras
     */
    public String getCodbarras() {
        return codbarras;
    }

    /**
     * @param codbarras the codbarras to set
     */
    public void setCodbarras(String codbarras) {
        this.codbarras = codbarras;
    }

    /**
     * @return the codasociados
     */
    public String getCodasociados() {
        return codasociados;
    }

    /**
     * @param codasociados the codasociados to set
     */
    public void setCodasociados(String codasociados) {
        this.codasociados = codasociados;
    }

    /**
     * @return the clasificacion
     */
    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    /**
     * @param clasificacion the clasificacion to set
     */
    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }

    /**
     * @return the codinterno
     */
    public String getCodinterno() {
        return codinterno;
    }

    /**
     * @param codinterno the codinterno to set
     */
    public void setCodinterno(String codinterno) {
        this.codinterno = codinterno;
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
     * @return the descripcioncorta
     */
    public String getDescripcioncorta() {
        return descripcioncorta;
    }

    /**
     * @param descripcioncorta the descripcioncorta to set
     */
    public void setDescripcioncorta(String descripcioncorta) {
        this.descripcioncorta = descripcioncorta;
    }

    /**
     * @return the cantidad_um
     */
    public float getCantidad_um() {
        return cantidad_um;
    }

    /**
     * @param cantidad_um the cantidad_um to set
     */
    public void setCantidad_um(float cantidad_um) {
        this.cantidad_um = cantidad_um;
    }

    /**
     * @return the unidadmedida
     */
    public UnidadMedida getUnidadmedida() {
        return unidadmedida;
    }

    /**
     * @param unidadmedida the unidadmedida to set
     */
    public void setUnidadmedida(UnidadMedida unidadmedida) {
        this.unidadmedida = unidadmedida;
    }

    /**
     * @return the proveedor
     */
    public Proveedor getProveedor() {
        return proveedor;
    }

    /**
     * @param proveedor the proveedor to set
     */
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    /**
     * @return the precio_compra
     */
    public float getPrecio_compra() {
        return precio_compra;
    }

    /**
     * @param precio_compra the precio_compra to set
     */
    public void setPrecio_compra(float precio_compra) {
        this.precio_compra = precio_compra;
    }

    /**
     * @return the utilidad
     */
    public float getUtilidad() {
        return utilidad;
    }

    /**
     * @param utilidad the utilidad to set
     */
    public void setUtilidad(float utilidad) {
        this.utilidad = utilidad;
    }

    /**
     * @return the precio_venta
     */
    public float getPrecio_venta() {
        return precio_venta;
    }

    /**
     * @param precio_venta the precio_venta to set
     */
    public void setPrecio_venta(float precio_venta) {
        this.precio_venta = precio_venta;
    }

    /**
     * @return the tipo_articulo
     */
    public String getTipo_articulo() {
        return tipo_articulo;
    }

    /**
     * @param tipo_articulo the tipo_articulo to set
     */
    public void setTipo_articulo(String tipo_articulo) {
        this.tipo_articulo = tipo_articulo;
    }

    /**
     * @return the stock
     */
    public float getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(float stock) {
        this.stock = stock;
    }

    /**
     * @return the stock_min
     */
    public float getStock_min() {
        return stock_min;
    }

    /**
     * @param stock_min the stock_min to set
     */
    public void setStock_min(float stock_min) {
        this.stock_min = stock_min;
    }

    /**
     * @return the stock_max
     */
    public float getStock_max() {
        return stock_max;
    }

    /**
     * @param stock_max the stock_max to set
     */
    public void setStock_max(float stock_max) {
        this.stock_max = stock_max;
    }

    /**
     * @return the iva
     */
    public float getIva() {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva(float iva) {
        this.iva = iva;
    }

    /**
     * @return the kit_fecha_ini
     */
    public String getKit_fecha_ini() {
        return kit_fecha_ini;
    }

    /**
     * @param kit_fecha_ini the kit_fecha_ini to set
     */
    public void setKit_fecha_ini(String kit_fecha_ini) {
        this.kit_fecha_ini = kit_fecha_ini;
    }

    /**
     * @return the kit_fecha_fin
     */
    public String getKit_fecha_fin() {
        return kit_fecha_fin;
    }

    /**
     * @param kit_fecha_fin the kit_fecha_fin to set
     */
    public void setKit_fecha_fin(String kit_fecha_fin) {
        this.kit_fecha_fin = kit_fecha_fin;
    }

    /**
     * @return the articulo_disponible
     */
    public int getArticulo_disponible() {
        return articulo_disponible;
    }

    /**
     * @param articulo_disponible the articulo_disponible to set
     */
    public void setArticulo_disponible(int articulo_disponible) {
        this.articulo_disponible = articulo_disponible;
    }

    /**
     * @return the kit
     */
    public boolean isKit() {
        return kit;
    }

    /**
     * @param kit the kit to set
     */
    public void setKit(boolean kit) {
        this.kit = kit;
    }

    /**
     * @return the fecha_registro
     */
    public String getFecha_registro() {
        return fecha_registro;
    }

    /**
     * @param fecha_registro the fecha_registro to set
     */
    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }    
}
