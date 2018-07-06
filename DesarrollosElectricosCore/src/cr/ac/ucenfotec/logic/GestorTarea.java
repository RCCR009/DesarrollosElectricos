package cr.ac.ucenfotec.logic;

import java.util.ArrayList;

import DataAccess.MongoDbTransaction;
import cr.ac.ucenfotec.entities.Tarea;

public class GestorTarea {
	
	MongoDbTransaction transaction;
	
	public GestorTarea() {
		this.transaction = new MongoDbTransaction();
	}
	
	public void create(Object obj) {
		try {
			transaction.InsertDocuement(obj, "tareas");	
		}catch(Exception e) {
			throw e;
		}
	}
	
	public ArrayList<Object> retriveAll(Object obj) {
		try {
			return transaction.GetData(obj, "tareas");		 
		}catch(Exception e) {
			throw e;
		}
	}
	
	public Object retrive(Object obj) {
		try {
			return transaction.RetriveDocument(obj, "tareas");
		}catch(Exception e) {
			throw e;
		}
	}
	
	public void update(Object obj) {
		try {
			Tarea tarea = new Tarea();
			Tarea t = (Tarea)obj;
			tarea.setId(t.getId());
			
			transaction.UpdateDocument(obj, "tareas", "id",tarea);
		}catch(Exception e) {
			throw e;
		}
		
	}
	
	public void delete(Object obj) {
		try {
			transaction.DeleteDocument(obj, "tareas");
		}catch(Exception e) {
			throw e;
		}
	}

}