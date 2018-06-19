package DataAccess;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.google.gson.Gson;
import com.mongodb.client.MongoCollection;


public class MongoDbTransaction {//metodos genericos de mongo (si se implementa sigelton debe ser aqui)

	private MongoDbConnection MongoConnection;// se puede hacer de esta clase una estatica y lo inicializa una unica vez
	
	public MongoDbTransaction() {
		MongoConnection = new MongoDbConnection("localhost" , 27017);
	}
	
	public void InsertDocuement(Object obj, String collectionName)
	{
		MongoCollection<Document> collection = MongoConnection.getMongoDataBase().getCollection(collectionName);//gson docuemten que espera un json
		
		Gson gson = new Gson();
	    
		String result = gson.toJson(obj);
	      
	    Document dbObject = gson.fromJson(result, Document.class);		
	    
	    collection.insertOne(dbObject);// crea un id unico ui
	}
	
	public ArrayList<Object> GetData(Object obj, String collectionName) 
	{
		ArrayList<Object> results  = new ArrayList<Object>();
		MongoCollection<Document> collection = MongoConnection.getMongoDataBase().getCollection(collectionName);
		
		List<Document> documents = (List<Document>) collection.find().into(
				new ArrayList<Document>());
		
		Gson gson = new Gson();
		
		for(Document document : documents){// pasa documento de gson a objec, que se utiliza para retornar
			
			String result = gson.toJson(document);			
			
			results.add((Object)gson.fromJson(result, obj.getClass()));
        }
		
		return results;
	}
	
}
