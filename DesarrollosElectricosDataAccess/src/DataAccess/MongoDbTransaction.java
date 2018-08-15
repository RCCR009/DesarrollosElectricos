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
		MongoCollection<Document> collection = getCollection(collectionName);
		Gson gson = new Gson();
		String result = gson.toJson(obj);	      
	    Document dbObject = gson.fromJson(result, Document.class);		    
	    collection.insertOne(dbObject);// crea un id unico ui
	}

	
	
	public ArrayList<Object> GetData(Object obj, String collectionName) 
	{
		ArrayList<Object> results  = new ArrayList<Object>();
		MongoCollection<Document> collection = getCollection(collectionName);	
		List<Document> documents = (List<Document>) collection.find().into(
				new ArrayList<Document>());
		
		Gson gson = new Gson();
		for(Document document : documents){		
			String result = gson.toJson(document);			
			results.add(gson.fromJson(result, obj.getClass()));
        }
		
		return results;
	}
	
	public void UpdateDocument(Object obj, String collectionName, String nameValue,Object value) {
		MongoCollection<Document> collection = getCollection(collectionName);
		
		BasicDBObject parameter = new BasicDBObject(nameValue,value);		
		Gson gson = new Gson();
		String result = gson.toJson(obj);	      
	    Document dbObject = gson.fromJson(result, Document.class);
		
		BasicDBObject updateObj = new BasicDBObject();
		updateObj.put("$set", dbObject);
		
		collection.updateOne(parameter, updateObj);	
		
	}
	
	public Object RetriveDocument(Object obj, String collectionName, String nameValue,Object value) {
		Object myObj = new Object();
		Gson gson = new Gson();
		MongoCollection<Document> collection = getCollection(collectionName);
		
		Document myDoc = collection.find(Filters.eq(nameValue,value)).first();		
		String result = gson.toJson(myDoc);			
		myObj = gson.fromJson(result, obj.getClass());

		return myObj;	
	}
	
	public void DeleteDocument(Object obj, String collectionName) {
		MongoCollection<Document> collection = getCollection(collectionName);
		Gson gson = new Gson(); 
		String result = gson.toJson(obj);	      
	    Document dbObject = gson.fromJson(result, Document.class);

	    collection.deleteOne(dbObject);
	}
	
	public void closeConnection() {
		MongoConnection.getMongo().close();
	}
	
	private MongoCollection<Document> getCollection(String collectionName) {
		MongoCollection<Document> collection = MongoConnection.getMongoDataBase().getCollection(collectionName);
		return collection;
	}
	
}
