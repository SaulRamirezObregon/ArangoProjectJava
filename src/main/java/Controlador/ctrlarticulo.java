/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

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
    
    public static void main(String args[]){
        /**
            Proveedor provedor = new Proveedor();
            provedor.setRfc("QWERFC");
            provedor.setRazonsocial("BIMBO");
            provedor.setDireccion("Av. Morelos #21");
            provedor.setNombrecontacto("RAOS");
            provedor.setTelefonoprincipal("7731111111");
            provedor.setTelefonomovil("7732222222");
            provedor.setEmail("correo@gmail.com");
            provedor.setEstatus("Disponible");
            AddAddProveedor(provedor);
        */
        
        /**
        UnidadMedida unidad = new UnidadMedida();
        unidad.setId_unidad("92ECBFED-1812-4FBA-8D04-1B6A0AE60839");
        unidad.setDescripcion("Cja");
        AddUnidadMedida(unidad);
        * */
        
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
