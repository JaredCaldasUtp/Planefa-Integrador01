
package pe.gob.oefa.planefa.mongodb;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.codecs.IntegerCodec;
import org.bson.codecs.LongCodec;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;

public class MongoDatabaseCliente {
    
    private MongoDatabaseCliente(){}
    
    private static class MongoDatabaseClienteHelper{
        private static final MongoDatabase INSTANCE = getDatabase();
    }
    
    public static MongoDatabase getInstance(){
        return MongoDatabaseClienteHelper.INSTANCE;
    }
    
    private static MongoDatabase getDatabase(){        
        ConnectionString connString = new ConnectionString(
            "mongodb+srv://atlasBDAdmin:$025Mongodb150$@cluster0.kakiu.mongodb.net/planefaDB"
        );
        MongoClientSettings settings = MongoClientSettings.builder()
            .applyConnectionString(connString)
            .retryWrites(true)
            .build();
        MongoClient mongoClient = MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase("planefaDB");         
        return database;
    }
    
    public static MongoCollection<Document> getColeccion(String coleccion){   
        return  getInstance().getCollection(coleccion);
    }
    
}
