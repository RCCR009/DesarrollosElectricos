package cr.ac.ucenfotec.logic;

import java.util.ArrayList;
import DataAccess.MongoDbTransaction;
import cr.ac.ucenfotec.entities.Actividad;

public class GestorActividad implements GestorMaster{
	
	MongoDbTransaction transaction;
	
	public GestorActividad(){
		this.transaction = new MongoDbTransaction();
	}
	
	@Override
	public void create(Object obj) {
		try {
			transaction.InsertDocuement(obj, "actividades");	
		}catch(Exception e) {
			throw e;
		}
	}
	
	@Override
	public ArrayList<Object> retriveAll(Object obj) {
		try {
			return transaction.GetData(obj, "actividades");		 
		}catch(Exception e) {
			throw e;
		}
	}
	
	@Override
	public Object retrive(Object obj) {
		try {
			return transaction.RetriveDocument(obj, "actividades");
		}catch(Exception e) {
			throw e;
		}
	}
	
	@Override
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
	
	@Override
	public void delete(Object obj) {
		try {
			transaction.DeleteDocument(obj, "actividades");
		}catch(Exception e) {
			throw e;
		}
	}

}
