package cr.ac.ucenfotec.logic;

import java.util.ArrayList;

import DataAccess.MongoDbTransaction;
import cr.ac.ucenfotec.entities.TareasCompletadas;

public class GestorTareasCompletadas implements GestorMaster{
	
	MongoDbTransaction transaction;
	
	public GestorTareasCompletadas() {
		this.transaction = new MongoDbTransaction();
	}
	
	@Override
	public void create(Object obj) {
		try {
			transaction.InsertDocuement(obj, "tareascompletadas");	
		}catch(Exception e) {
			throw e;
		}
	}
	
	@Override
	public ArrayList<Object> retriveAll(Object obj) {
		try {
			return transaction.GetData(obj, "tareascompletadas");		 
		}catch(Exception e) {
			throw e;
		}
	}
	
	@Override
	public Object retrive(Object obj) {
		try {
			return transaction.RetriveDocument(obj, "tareascompletadas");
		}catch(Exception e) {
			throw e;
		}
	}
	
	@Override
	public void update(Object obj) {
		try {
			TareasCompletadas tareaCompletada = new TareasCompletadas();
			TareasCompletadas tc = (TareasCompletadas)obj;
			tareaCompletada.setId(tc.getId());
			
			transaction.UpdateDocument(obj, "tareascompletadas", "id",tareaCompletada);
		}catch(Exception e) {
			throw e;
		}
		
	}
	
	@Override
	public void delete(Object obj) {
		try {
			transaction.DeleteDocument(obj, "tareascompletadas");
		}catch(Exception e) {
			throw e;
		}
	}

}