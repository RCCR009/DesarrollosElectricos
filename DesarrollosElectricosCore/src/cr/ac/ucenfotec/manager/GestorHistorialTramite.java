package cr.ac.ucenfotec.manager;

import java.util.ArrayList;

import DataAccess.MongoDbTransaction;
import cr.ac.ucenfotec.entities.HistorialTramite;

public class GestorHistorialTramite extends GestorMaster {
	
	public GestorHistorialTramite() {
		transaction = MongoDbTransaction.GetInstance();
	}
	
	@Override
	public void create(Object obj) {
		try {
			transaction.InsertDocuement(obj, "historialtramites");	
		}catch(Exception e) {
			throw e;
		}
	}
	
	@Override
	public ArrayList<Object> retriveAll(Object obj) {
		try {
			return transaction.GetData(obj, "historialtramites");		 
		}catch(Exception e) {
			throw e;
		}
	}
	
	@Override
	public Object retrive(Object obj) {
		String nameValue;
		Integer value;
		HistorialTramite historial = (HistorialTramite)obj;
		try {
			nameValue = "id";
			value = historial.getId();
			return transaction.RetriveDocument(obj, "historialtramites",nameValue,value);
		}catch(Exception e) {
			throw e;
		}
	}
	
	@Override
	public void update(Object obj) {
		String idName;
		Integer value;
		HistorialTramite hT = (HistorialTramite)obj;
		try {
			idName = "id";
			value = hT.getId(); 
			
			transaction.UpdateDocument(obj,"historialtramites",idName,value);
		}catch(Exception e) {
			throw e;
		}
	}
	
	@Override
	public void delete(Object obj) {
		try {
			transaction.DeleteDocument(obj, "historialtramites");
		}catch(Exception e) {
			throw e;
		}
	}

}
