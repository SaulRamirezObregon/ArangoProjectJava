/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arangotest;

import java.util.Map;
import com.arangodb.ArangoDB;
import com.arangodb.ArangoDBException;
import com.arangodb.entity.BaseDocument;
import com.arangodb.entity.CollectionEntity;
import javax.swing.JOptionPane;



/**
 *
 * @author Saul
 */
public class Conexion {
    public static void main(String args [])
    {
        //Creacion de la conexion
        final ArangoDB arangoDB = new 
          ArangoDB.Builder()
            .password("1234")
            .host("127.0.0.1")
            .port(8529)
            .user("root")
            .build();
        String dbName = "posadminbd";
        String collectionName = "Proveedor";
        
    //Creacion de la BD
    /**
    try 
    {
        arangoDB.createDatabase(dbName);
        System.out.println("Database created: " + dbName);
    } 
    catch (ArangoDBException e)
    {
        JOptionPane.showMessageDialog(null, "Failed to create database:" + dbName + "; " + "ERROR:"+ e.getMessage());
        System.out.println("Failed to create database:" + dbName + "; " + "ERROR:"+ e.getMessage()); 
    }
    */
    
    //Creacion de una colección
    /**
    
    
    try 
    {
        CollectionEntity myArangoCollection = arangoDB.db(dbName).createCollection(collectionName);
        System.out.println("Collection created: " + myArangoCollection.getName());
    } 
    catch (ArangoDBException e) 
    {
        System.err.println("Failed to create collection: " + collectionName + "; " + e.getMessage());
    }
    */
    
    //Creacion de un documento
    
    BaseDocument myObject = new BaseDocument();
    
    myObject.addAttribute("coca-cola", "abeer");
    myObject.addAttribute("pepsi", 21);
    try 
    {
      arangoDB.db(dbName).collection(collectionName).insertDocument(myObject);
      System.out.println("Document created");
    } catch (ArangoDBException e) 
    {
      System.err.println("Failed to create document. " + e.getMessage());
    }
    
    
    //Consultar un documento por id
    /**
    try 
    {
        BaseDocument myDocument = arangoDB.db(dbName).collection(collectionName).getDocument("1",
        BaseDocument.class);
        System.out.println("Key: " + myDocument.getKey());
        System.out.println("Attribute 1: " + myDocument.getAttribute("coca-cola"));
        System.out.println("Attribute 2: " + myDocument.getAttribute("pepsi"));
    } 
    catch (ArangoDBException e) 
    {
        System.err.println("Failed to get document:"+ 1 + e.getMessage());
    }
    */
    
    }  
    
    

}
