package cr.ac.ucenfotec.logic;

import java.util.ArrayList;
import DataAccess.MongoDbTransaction;
import cr.ac.ucenfotec.entities.Actividad;

public class GestorActividad{
	
	MongoDbTransaction transaction;
	
	public GestorActividad(){
		this.transaction = new MongoDbTransaction();
	}
	
	public void create(Object obj) {
		try {
			transaction.InsertDocuement(obj, "actividades");	
		}catch(Exception e) {
			throw e;
		}
	}
	
	public ArrayList<Object> retriveAll(Object obj) {
		try {
			return transaction.GetData(obj, "actividades");		 
		}catch(Exception e) {
			throw e;
		}
	}
	
	public Object retrive(Object obj) {
		try {
			return transaction.RetriveDocument(obj, "actividades");
		}catch(Exception e) {
			throw e;
		}
	}
	
	public void update(Object obj) {
		try {
			Actividad actividad = new Actividad();
			Actividad t = (Actividad)obj;
			actividad.setId(t.getId()); 
			
			transaction.UpdateDocument(obj, "actividades","id",actividad);
		}catch(Exception e) {
			throw e;
		}	
	}
	
	public void delete(Object obj) {
		try {
			transaction.DeleteDocument(obj, "actividades");
		}catch(Exception e) {
			throw e;
		}
	}

}
