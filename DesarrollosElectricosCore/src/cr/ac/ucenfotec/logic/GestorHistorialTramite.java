package cr.ac.ucenfotec.logic;

import java.util.ArrayList;

import DataAccess.MongoDbTransaction;
import cr.ac.ucenfotec.entities.HistorialTramite;

public class GestorHistorialTramite {
	
	MongoDbTransaction transaction;
	
	public GestorHistorialTramite() {
		this.transaction = new MongoDbTransaction();
	}
	
	public void create(Object obj) {
		try {
			transaction.InsertDocuement(obj, "historialtramites");	
		}catch(Exception e) {
			throw e;
		}
	}
	
	public ArrayList<Object> retriveAll(Object obj) {
		try {
			return transaction.GetData(obj, "historialtramites");		 
		}catch(Exception e) {
			throw e;
		}
	}
	
	public Object retrive(Object obj) {
		try {
			return transaction.RetriveDocument(obj, "historialtramites");
		}catch(Exception e) {
			throw e;
		}
	}
	
	public void update(Object obj) {
		try {
			HistorialTramite historialTramite = new HistorialTramite();
			HistorialTramite ht = (HistorialTramite)obj;
			historialTramite.setTipoTramite(ht.getTipoTramite());
			
			transaction.UpdateDocument(obj, "historialtramites", "id",historialTramite);
		}catch(Exception e) {
			throw e;
		}
		
	}
	
	public void delete(Object obj) {
		try {
			transaction.DeleteDocument(obj, "historialtramites");
		}catch(Exception e) {
			throw e;
		}
	}

}
