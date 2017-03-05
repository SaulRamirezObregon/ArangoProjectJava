/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Coleccion;
import Modelo.Proveedor;
import com.arangodb.ArangoDB;
import com.arangodb.ArangoDBException;
import com.arangodb.entity.BaseDocument;

/**
 *
 * @author Saul
 */
public class ctrlProveedor {
    
    public static void Add( Proveedor provedoradd){
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
            Add(provedor);
        */
        
    }
    
    
    
        
        
        
        
        

}
