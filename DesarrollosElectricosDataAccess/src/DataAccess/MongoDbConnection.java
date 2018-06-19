package DataAccess;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoDbConnection {

	public MongoDbConnection(String host, int port) {//se le pasa el host y el puerto al que se le quiere pegar// eso es por si se tiene la coneccion en un puerto diferente
		
		Mongo = new MongoClient(host, port);//se levanta cliente de mongo y se esta pegando a la base
		MongoDataBase = Mongo.getDatabase("mycustomers");//	dato quemado se puede meter desde un xml un Json o lo que sea	
	}
	
	private MongoClient Mongo;
	
	private MongoDatabase MongoDataBase;

	public MongoClient getMongo() {
		return Mongo;
	}

	public MongoDatabase getMongoDataBase() {
		return MongoDataBase;
	}	
	
	
}
