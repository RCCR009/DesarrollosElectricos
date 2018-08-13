package cr.ac.ucenfotec.manager;

import java.util.ArrayList;

import DataAccess.MongoDbTransaction;
import cr.ac.ucenfotec.entities.Usuario;

public class GestorUsuario extends GestorMaster {
	
	MongoDbTransaction transaction;
	
	public GestorUsuario() {
		transaction = MongoDbTransaction.GetInstance();
	}
	
	@Override
	public void create(Object obj) {
		try {
			transaction.InsertDocuement(obj, "usuarios");	
		}catch(Exception e) {
			throw e;
		}
	}
	
	@Override
	public ArrayList<Object> retriveAll(Object obj) {
		try {
			return transaction.GetData(obj, "Usuarios");		 
		}catch(Exception e) {
			throw e;
		}
	}
	
	@Override
	public Object retrive(Object obj) {
		String nameValue;
		String value;
		Usuario usuario = (Usuario)obj;
		try {
			nameValue = "id";
			value = usuario.getId();
			return transaction.RetriveDocument(obj,"usuarios",nameValue,value);
		}catch(Exception e) {
			throw e;
		}
	}
	
	@Override
	public void update(Object obj) {
		String idName;
		String value;
		Usuario u = (Usuario)obj;
		try {
			idName = "id";
			value = u.getId();
			
			transaction.UpdateDocument(obj, "usuarios",idName,value);
		}catch(Exception e) {
			throw e;
		}
		
	}
	
	@Override
	public void delete(Object obj) {
		try {
			transaction.DeleteDocument(obj, "usuarios");
		}catch(Exception e) {
			throw e;
		}
	}

}
