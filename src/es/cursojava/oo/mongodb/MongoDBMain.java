package es.cursojava.oo.mongodb;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

import es.cursojava.utils.interfaces.Iniciable;
import utils.Dexter;

/**
 * Clase de MongoDB para establecer la conexión entre el 
 * mismo y Java por un plugin de Maven.
 */

public class MongoDBMain implements Iniciable {
	
	public static void main(String[] args) {
		MongoDBMain main = new MongoDBMain();
		main.init();
	}

	@Override
	public void init() {
		String uri = "mongodb+srv://isgoodsoup:Unified-conform1-@pitufoshome.6l8pxlp.mongodb.net/?appName=PitufosHome";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("getafemongodb");
            System.out.println("Conexión establecida");
        } catch (Exception e) {
            Dexter.printException(e);
        }
	}
}
