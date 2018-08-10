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
		try {
			nameValue = "id";
			return transaction.RetriveDocument(nameValue, obj, "historialtramites");
		}catch(Exception e) {
			throw e;
		}
	}
	
	@Override
	public void update(Object obj) {
		try {
			HistorialTramite historialTramite = new HistorialTramite();
			HistorialTramite ht = (HistorialTramite)obj;
			historialTramite.setId(ht.getId());
			
			transaction.UpdateDocument(obj, "historialtramites", "id",historialTramite);
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
