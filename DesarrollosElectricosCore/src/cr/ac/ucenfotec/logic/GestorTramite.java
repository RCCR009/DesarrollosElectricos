package cr.ac.ucenfotec.logic;

import java.util.ArrayList;
import DataAccess.MongoDbTransaction;
import cr.ac.ucenfotec.entities.Tramite;

public class GestorTramite {
	
	MongoDbTransaction transaction;
	
	GestorTramite(){
		transaction = new MongoDbTransaction();
	}
	
	public void create(Object obj) {
		try {
			transaction.InsertDocuement(obj, "tramites");	
		}catch(Exception e) {
			throw e;
		}
	}
	
	public ArrayList<Object> retriveAll(Object obj) {
		try {
			return transaction.GetData(obj, "tramites");		 
		}catch(Exception e) {
			throw e;
		}
	}
	
	public Object retrive(Object obj) {
		try {
			return transaction.RetriveDocument(obj, "tramites");
		}catch(Exception e) {
			throw e;
		}
	}
	
	public void update(Object obj) {
		try {
			Tramite tramite = new Tramite();
			Tramite t = (Tramite)obj;
			tramite.setId(t.getId());
			
			transaction.UpdateDocument(obj, "tramites", "id",tramite);
		}catch(Exception e) {
			throw e;
		}
		
	}
	
	public void delete(Object obj) {
		try {
			transaction.DeleteDocument(obj, "tramites");
		}catch(Exception e) {
			throw e;
		}
	}

}
