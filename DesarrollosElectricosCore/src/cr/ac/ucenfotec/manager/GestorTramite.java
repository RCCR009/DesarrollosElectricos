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
		Integer value;
		Tramite tramite = (Tramite)obj;
		try {
			nameValue = "id";
			value = tramite.getId();
			return transaction.RetriveDocument(obj, "tramites",nameValue,value);
		}catch(Exception e) {
			throw e;
		}
	}
	
	@Override
	public void update(Object obj) {
		String idName;
		Integer value;
		Tramite t = (Tramite)obj;
		try {
			idName = "id";
			value = t.getId();
			
			transaction.UpdateDocument(obj, "tramites",idName,value);
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
