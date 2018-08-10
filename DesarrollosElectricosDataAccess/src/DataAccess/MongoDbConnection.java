package DataAccess;

import java.util.logging.Level;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoDbConnection {	
	private MongoClient Mongo;
	private MongoDatabase MongoDataBase;

	public MongoDbConnection(String host, int port) {
		
		Mongo = new MongoClient(host, port);
		MongoDataBase = Mongo.getDatabase("desarrolloselectricos");
		java.util.logging.Logger.getLogger("org.mongodb.driver").setLevel(Level.SEVERE);
	}

	public MongoClient getMongo() {
		return Mongo;
	}

	public MongoDatabase getMongoDataBase() {
		return MongoDataBase;
	}	
}
