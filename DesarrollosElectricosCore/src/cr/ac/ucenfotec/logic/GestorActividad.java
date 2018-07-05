package cr.ac.ucenfotec.logic;

import java.util.ArrayList;
import DataAccess.MongoDbTransaction;
import cr.ac.ucenfotec.entities.Actividad;

public class GestorActividad{
	
	MongoDbTransaction transaction;
	
	GestorActividad(){
		transaction = new MongoDbTransaction();
	}
	
	public void create(Object obj) {
		try {
			transaction.InsertDocuement(obj, "Actividades");	
		}catch(Exception e) {
			throw e;
		}
	}
	
	public ArrayList<Object> retriveAll(Object obj) {
		try {
			return transaction.GetData(obj, "Actividades");		 
		}catch(Exception e) {
			throw e;
		}
	}
	
	public Object retrive(Object obj) {
		try {
			return transaction.RetriveDocument(obj, "Actividades");
		}catch(Exception e) {
			throw e;
		}
	}
	
	public void update(Object obj) {
		try {
			Actividad actividad = new Actividad();
			Actividad t = (Actividad)obj;
			actividad.setId(t.getId()); 
			
			transaction.UpdateDocument(obj, "Actividades","id",actividad);
		}catch(Exception e) {
			throw e;
		}	
	}
	
	public void delete(Object obj) {
		try {
			transaction.DeleteDocument(obj, "Actividades");
		}catch(Exception e) {
			throw e;
		}
	}

}
