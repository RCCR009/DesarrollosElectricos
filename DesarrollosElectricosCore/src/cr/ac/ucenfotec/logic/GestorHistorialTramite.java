package cr.ac.ucenfotec.logic;

import java.util.ArrayList;

import DataAccess.MongoDbTransaction;
import cr.ac.ucenfotec.entities.historialTramite;

public class GestorHistorialTramite {
	
	MongoDbTransaction transaction;
	
	public GestorHistorialTramite() {
		this.transaction = new MongoDbTransaction();
	}
	
	public void create(Object obj) {
		try {
			transaction.InsertDocuement(obj, "HistorialTramites");	
		}catch(Exception e) {
			throw e;
		}
	}
	
	public ArrayList<Object> retriveAll(Object obj) {
		try {
			return transaction.GetData(obj, "HistorialTramites");		 
		}catch(Exception e) {
			throw e;
		}
	}
	
	public Object retrive(Object obj) {
		try {
			return transaction.RetriveDocument(obj, "HistorialTramites");
		}catch(Exception e) {
			throw e;
		}
	}
	
	public void update(Object obj) {
		try {
			historialTramite historialTramite = new historialTramite();
			historialTramite ht = (historialTramite)obj;
			historialTramite.setTipoTramite(ht.getTipoTramite());
			
			transaction.UpdateDocument(obj, "HistorialTramites", "id",historialTramite);
		}catch(Exception e) {
			throw e;
		}
		
	}
	
	public void delete(Object obj) {
		try {
			transaction.DeleteDocument(obj, "HistorialTramites");
		}catch(Exception e) {
			throw e;
		}
	}

}