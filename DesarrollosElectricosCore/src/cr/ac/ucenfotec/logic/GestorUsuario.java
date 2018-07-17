package cr.ac.ucenfotec.logic;

import java.util.ArrayList;

import DataAccess.MongoDbTransaction;
import cr.ac.ucenfotec.entities.Usuario;

public class GestorUsuario implements GestorMaster {
	
	MongoDbTransaction transaction;
	
	public GestorUsuario() {
		this.transaction = new MongoDbTransaction();
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
		try {
			return transaction.RetriveDocument(obj, "usuarios");
		}catch(Exception e) {
			throw e;
		}
	}
	
	@Override
	public void update(Object obj) {
		try {
			Usuario usuario = new Usuario();
			Usuario u = (Usuario)obj;
			usuario.setId(u.getId());
			
			transaction.UpdateDocument(obj, "usuarios", "id",usuario);
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
