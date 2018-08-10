package DataAccess;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;


public class MongoDbTransaction {
	private MongoDbConnection MongoConnection;
	private static MongoDbTransaction instance;
	
	
	private MongoDbTransaction() {
		MongoConnection = new MongoDbConnection("localhost" , 27017);
	}
	
	public static MongoDbTransaction GetInstance() {
		if(instance == null) {
			instance = new MongoDbTransaction();
		}
		return instance;
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
		
		for(Document document : documents){
			
			String result = gson.toJson(document);			
			
			results.add((Object)gson.fromJson(result, obj.getClass()));
        }
		
		return results;
	}
	
	public void UpdateDocument(Object obj, String collectionName, String nameValue,Object value) {
		MongoCollection<Document> collection = MongoConnection.getMongoDataBase().getCollection(collectionName);
		
		BasicDBObject parameter = new BasicDBObject(nameValue,value);		
		Gson gson = new Gson();
		String result = gson.toJson(obj);	      
	    Document dbObject = gson.fromJson(result, Document.class);
		
		BasicDBObject updateObj = new BasicDBObject();
		updateObj.put("$set", dbObject);
		
		collection.updateOne(parameter, updateObj);	
		
	}
	
	public Object RetriveDocument(String nameValue,Object obj, String collectionName) {
		Object myObj = new Object();
		Gson gson = new Gson();
		MongoCollection<Document> collection = MongoConnection.getMongoDataBase().getCollection(collectionName);
		
		Document myDoc = collection.find(Filters.eq(nameValue,obj)).first();		
		String result = gson.toJson(myDoc);			
		myObj = (gson.fromJson(result, obj.getClass()));

		return myObj;	
	}
	
	public void DeleteDocument(Object obj, String collectionName) {
		MongoCollection<Document> collection = MongoConnection.getMongoDataBase().getCollection(collectionName);
		Gson gson = new Gson(); 
		String jsonObject = gson.toJson(obj);	      
	    Document dbObject = gson.fromJson(jsonObject, Document.class);

	    collection.deleteOne(dbObject);
	}
	
	public void closeConnection() {
		MongoConnection.getMongo().close();
	}
	
}
