/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Articulo;
import Modelo.Clasificacion;
import Modelo.Coleccion;
import Modelo.Proveedor;
import Modelo.UnidadMedida;
import com.arangodb.ArangoDB;
import com.arangodb.ArangoDBException;
import com.arangodb.entity.BaseDocument;

/**
 *
 * @author Saul
 */
public class ctrlarticulo {
    
    public static void AddProveedor( Proveedor provedoradd)
    {
        Coleccion coleccion = new Coleccion();
        coleccion.setColeccion("Proveedor");
        final ArangoDB arangoDB = new 
          ArangoDB.Builder()
            .password("")
            .host("127.0.0.1")
            .port(8529)
            .user("root")
            .build();
       
        BaseDocument proveedor = new BaseDocument();
        proveedor.addAttribute("id_proveedor", provedoradd.getIdproveedor());
        proveedor.addAttribute("rfc", provedoradd.getRfc());
        proveedor.addAttribute("razonsocial", provedoradd.getRazonsocial());
        proveedor.addAttribute("direccion", provedoradd.getDireccion());
        proveedor.addAttribute("nombrecontacto", provedoradd.getNombrecontacto());
        proveedor.addAttribute("telprincipal", provedoradd.getTelefonoprincipal());
        proveedor.addAttribute("telmovil", provedoradd.getTelefonomovil());
        proveedor.addAttribute("email", provedoradd.getEmail());
        proveedor.addAttribute("estatus", provedoradd.getEstatus());
        try 
        {
          arangoDB.db(coleccion.getNombrebd()).collection(coleccion.getColeccion()).insertDocument(proveedor);
          System.out.println("Document created");
        } catch (ArangoDBException e) 
        {
          System.err.println("Failed to create document. " + e.getMessage());
        }
    
    }
    
    public static void AddUnidadMedida(UnidadMedida unidadmedida)
    {
     Coleccion coleccion = new Coleccion();
     //Esta coleccion se agrego desde la interfaz web de arango
     coleccion.setColeccion("UnidadMedida");
     final ArangoDB arangoDB = new 
          ArangoDB.Builder()
            .password("")
            .host("127.0.0.1")
            .port(8529)
            .user("root")
            .build();
     BaseDocument objectunidad = new BaseDocument();
     objectunidad.addAttribute("id_unidad", unidadmedida.getId_unidad());
     objectunidad.addAttribute("descripcion", unidadmedida.getDescripcion());
        try 
        {
         arangoDB.db(coleccion.getNombrebd()).collection(coleccion.getColeccion()).insertDocument(objectunidad);
          System.out.println("Document created");   
        } 
        catch (Exception e)
        {
            System.err.println("Failed to create document. " + e.getMessage());
        }
    }
    
    public static void AddClasificacion (Clasificacion clasificacion)
    {
     Coleccion coleccion = new Coleccion();
     coleccion.setColeccion("Clasificacion");
     final ArangoDB arangoDB = new 
          ArangoDB.Builder()
            .password("")
            .host("127.0.0.1")
            .port(8529)
            .user("root")
            .build();
     BaseDocument objclasificacion = new BaseDocument();
     objclasificacion.addAttribute("id_clasificacion", clasificacion.getIdclasificacion());
     objclasificacion.addAttribute("id_clasificacion_dep", clasificacion.getId_clasificacion_dep());
     objclasificacion.addAttribute("descripcion", clasificacion.getDescripcion());
     objclasificacion.addAttribute("nivel_clasificacion", clasificacion.getNivelclasificacion());
        try 
        {
          arangoDB.db(coleccion.getNombrebd()).collection(coleccion.getColeccion()).insertDocument(objclasificacion);
          System.out.println("Document created");   
        } catch (Exception e) 
        {
            System.err.println("Failed to create document. " + e.getMessage());
        }
    }
    
    public static void AddArticuloPrincipal(Articulo articulo)
    {
        Coleccion coleccion = new Coleccion();
        coleccion.setColeccion("Articulo");
        final ArangoDB arangoDB = new 
          ArangoDB.Builder()
            .password("")
            .host("127.0.0.1")
            .port(8529)
            .user("root")
            .build();
        BaseDocument objarticuloprincipal = new BaseDocument();
        objarticuloprincipal.addAttribute("cod_barras", articulo.getCodbarras());
        objarticuloprincipal.addAttribute("cod_asociado", articulo.getCodasociados());
        objarticuloprincipal.addAttribute("cod_interno", articulo.getCodinterno());
        objarticuloprincipal.addAttribute("descripcion", articulo.getDescripcion());
        objarticuloprincipal.addAttribute("descripcion_corta",articulo.getDescripcioncorta());
        objarticuloprincipal.addAttribute("cantidad_um", articulo.getCantidad_um());
        objarticuloprincipal.addAttribute("id_unidad", articulo.getUnidadmedida().getId_unidad());
        objarticuloprincipal.addAttribute("id_proveedor", articulo.getProveedor().getIdproveedor());
        objarticuloprincipal.addAttribute("precio_compra", articulo.getPrecio_compra());
        objarticuloprincipal.addAttribute("utilidad", articulo.getUtilidad());
        objarticuloprincipal.addAttribute("precio_venta", articulo.getPrecio_venta());
        objarticuloprincipal.addAttribute("tipo_articulo", articulo.getTipo_articulo());
        objarticuloprincipal.addAttribute("iva", articulo.getIva());
        objarticuloprincipal.addAttribute("iva", articulo.getIva());
        objarticuloprincipal.addAttribute("articulo_disponible", articulo.getArticulo_disponible());
        objarticuloprincipal.addAttribute("fecha_registro", articulo.getFecha_registro());
        
    }
    
    public static void main(String args[]){
        
            /**
            Proveedor provedor = new Proveedor();
            provedor.setIdproveedor("DCF14B0E-41B4-4423-B69C-A8D0FC6AB762");
            provedor.setRfc("CLD-050714-5H6");
            provedor.setRazonsocial("Comercializadora Corona");
            provedor.setDireccion("CARR  LAREDO KM 131 NO.114");
            provedor.setNombrecontacto("CORONA");
            provedor.setTelefonoprincipal("7772073610");
            provedor.setTelefonomovil("7782775712");
            provedor.setEmail("correoCORONA@gmail.com");
            provedor.setEstatus("activo");
            AddProveedor(provedor);
            */
            
        
        
        
        /**    
        UnidadMedida unidad = new UnidadMedida();
        unidad.setId_unidad("B6988452-9179-46F4-B97B-D44611EB5F18");
        unidad.setDescripcion("Paq");
        AddUnidadMedida(unidad);
        */ 
        
        
        /**
        //Inserción ddel departamento de abarrotes
        Clasificacion clasificacion = new Clasificacion();
        clasificacion.setIdclasificacion(2);
        clasificacion.setId_clasificacion_dep(1);
        clasificacion.setDescripcion("ABARROTES");
        clasificacion.setNivelclasificacion(1);
        AddClasificacion(clasificacion);
           */
        
        //Inserción de la categoria abarrotes comestibles
        /**
        Clasificacion clasificacion = new Clasificacion();
        clasificacion.setIdclasificacion(13);
        clasificacion.setId_clasificacion_dep(2);
        clasificacion.setDescripcion("ABARROTES COMESTIBLES");
        clasificacion.setNivelclasificacion(2);
        AddClasificacion(clasificacion);
        */
        
        //Insercion subcategoria bebidas
        /**
        Clasificacion clasificacion = new Clasificacion();
        clasificacion.setIdclasificacion(38);
        clasificacion.setId_clasificacion_dep(13);
        clasificacion.setDescripcion("BEBIDAS");
        clasificacion.setNivelclasificacion(3);
        AddClasificacion(clasificacion);
        */
        
        //Insercion subcategoria botanas
        /**
        Clasificacion clasificacion = new Clasificacion();
        clasificacion.setIdclasificacion(39);
        clasificacion.setId_clasificacion_dep(13);
        clasificacion.setDescripcion("BOTANAS");
        clasificacion.setNivelclasificacion(3);
        AddClasificacion(clasificacion);
        */ 
        
        //Insercion linea Cerveza
        /**
        Clasificacion clasificacion = new Clasificacion();
        clasificacion.setIdclasificacion(182);
        clasificacion.setId_clasificacion_dep(38);
        clasificacion.setDescripcion("CERVEZA");
        clasificacion.setNivelclasificacion(4);
        AddClasificacion(clasificacion);
         */ 
        
        //Insercion linea Frituras
        /**
        Clasificacion clasificacion = new Clasificacion();
        clasificacion.setIdclasificacion(193);
        clasificacion.setId_clasificacion_dep(39);
        clasificacion.setDescripcion("FRITURAS");
        clasificacion.setNivelclasificacion(4);
        AddClasificacion(clasificacion);
        */ 
        
    }
    
    
    
        
        
        
        
        

}
