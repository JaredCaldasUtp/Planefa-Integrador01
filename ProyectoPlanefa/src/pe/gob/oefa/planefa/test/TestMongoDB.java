/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.oefa.planefa.test;


import com.mongodb.Block;
import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import java.util.ArrayList;
import org.bson.Document;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import pe.gob.oefa.planefa.bo.catalogo.Efa;
import pe.gob.oefa.planefa.bo.planefa.Periodo;
/**
 *
 * @author CLIENTE
 */
public class TestMongoDB {
    
    public static void main(String[] args) {
        Block<Document> printBlock = new Block<Document>() {
          @Override
          public void apply(final Document document) {
              System.out.println(document.toJson());
          }
      };
      
        ConnectionString connString = new ConnectionString(
            "mongodb+srv://atlasBDAdmin:$025Mongodb150$@cluster0.kakiu.mongodb.net/planefaDB"
        );
        MongoClientSettings settings = MongoClientSettings.builder()
            .applyConnectionString(connString)
            .retryWrites(true)
            .build();
        MongoClient mongoClient = MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase("planefaDB");  
        System.out.println("ok:");
        
        //database.createCollection("efas", null);

        MongoCollection<Document> collectionEfas = database.getCollection("planefas");
        System.out.println("documentEfas:" + collectionEfas);
        
        
        Document document = new Document("fechaEnvio", new Date().getTime())
                .append("periodo", new Document("anio", "2020")
                        .append("plazoRemisionInicial", new Date().getTime())
                        .append("plazoRemisionFinal", new Date().getTime())
                )
                .append("efa", new Document("nombre", "Local"))                
                .append("fechaEnvio", "D")                
                .append("oficinaDesconcentrada", new Document("nombre", "OD "));
        collectionEfas.insertOne(document);
    
        collectionEfas = database.getCollection("efas");
        
        collectionEfas.find().forEach(doc -> printBlock.apply(doc));
        
        
        System.out.println("documentEfas:" + collectionEfas);     
    }
    
    
}
