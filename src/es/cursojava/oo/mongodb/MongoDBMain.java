package es.cursojava.oo.mongodb;

import org.bson.Document;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

import es.cursojava.utils.interfaces.Iniciable;

/**
 * Clase de MongoDB para establecer la conexión entre el mismo y Java por un
 * plugin de Maven.
 */

public class MongoDBMain implements Iniciable {

	public static void main(String[] args) {
		MongoDBMain main = new MongoDBMain();
		main.init();
	}

	@Override
	public void init() {
		String connectionString = "mongodb+srv://isgoodsoup:Unified-conform1-"
				+ "@pitufoshome.6l8pxlp.mongodb.net/?appName=PitufosHome";
		ServerApi serverApi = ServerApi.builder().version(ServerApiVersion.V1)
				.build();
		MongoClientSettings settings = MongoClientSettings.builder()
				.applyConnectionString(new ConnectionString(connectionString))
				.serverApi(serverApi).build();
		try (MongoClient mongoClient = MongoClients.create(settings)) {
			try {
				MongoDatabase database = mongoClient.getDatabase("admin");
				database.runCommand(new Document("ping", 1));
				System.out.println("Conexión establecida");
			} catch (MongoException e) {
				e.printStackTrace();
			}
		}
	}
}
