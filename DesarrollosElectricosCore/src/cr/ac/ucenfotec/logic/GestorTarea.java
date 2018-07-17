package cr.ac.ucenfotec.logic;

import java.util.ArrayList;

import DataAccess.MongoDbTransaction;
import cr.ac.ucenfotec.entities.Tarea;

public class GestorTarea implements GestorMaster {
	
	MongoDbTransaction transaction;
	
	public GestorTarea() {
		this.transaction = new MongoDbTransaction();
	}
	
	@Override
	public void create(Object obj) {
		try {
			transaction.InsertDocuement(obj, "tareas");	
		}catch(Exception e) {
			throw e;
		}
	}
	
	@Override
	public ArrayList<Object> retriveAll(Object obj) {
		try {
			return transaction.GetData(obj, "tareas");		 
		}catch(Exception e) {
			throw e;
		}
	}
	
	@Override
	public Object retrive(Object obj) {
		try {
			return transaction.RetriveDocument(obj, "tareas");
		}catch(Exception e) {
			throw e;
		}
	}
	
	@Override
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
	
	@Override
	public void delete(Object obj) {
		try {
			transaction.DeleteDocument(obj, "tareas");
		}catch(Exception e) {
			throw e;
		}
	}

}