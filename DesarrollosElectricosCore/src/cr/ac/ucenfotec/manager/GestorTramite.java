package cr.ac.ucenfotec.manager;

import java.util.ArrayList;
import DataAccess.MongoDbTransaction;
import cr.ac.ucenfotec.entities.Tramite;

public class GestorTramite extends GestorMaster {
	
	MongoDbTransaction transaction;
	
	public GestorTramite(){
		transaction = MongoDbTransaction.GetInstance();
	}
	
	@Override
	public void create(Object obj) {
		try {
			transaction.InsertDocuement(obj, "tramites");	
		}catch(Exception e) {
			throw e;
		}
	}
	
	@Override
	public ArrayList<Object> retriveAll(Object obj) {
		try {
			return transaction.GetData(obj, "tramites");		 
		}catch(Exception e) {
			throw e;
		}
	}
	
	@Override
	public Object retrive(Object obj) {
		String nameValue;
		try {
			nameValue = "id";
			return transaction.RetriveDocument(nameValue,obj, "tramites");
		}catch(Exception e) {
			throw e;
		}
	}
	
	@Override
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
	
	@Override
	public void delete(Object obj) {
		try {
			transaction.DeleteDocument(obj, "tramites");
		}catch(Exception e) {
			throw e;
		}
	}

}
