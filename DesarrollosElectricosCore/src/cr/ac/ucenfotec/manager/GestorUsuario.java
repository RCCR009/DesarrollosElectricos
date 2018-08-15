package cr.ac.ucenfotec.manager;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import DataAccess.MongoDbTransaction;
import cr.ac.cenfotec.encryption.AlgorithmName;
import cr.ac.cenfotec.encryption.EncryptionManager;
import cr.ac.ucenfotec.entities.Usuario;

public class GestorUsuario extends GestorMaster {
	
	public GestorUsuario() {
		transaction = MongoDbTransaction.GetInstance();
	}
	
	@Override
	public void create(Object obj) {
		try {
			Usuario usuario = (Usuario)obj;
			Usuario u = usuario;	
			usuario.setClave(encryptPassword(u.getClave()));
			transaction.InsertDocuement(usuario, "usuarios");	
		}catch(Exception e) {
			Logger logger = Logger.getLogger("cr.ac.ucenfotec.manager");
		    StackTraceElement elements[] = e.getStackTrace();
		    for (int i = 0, n = elements.length; i < n; i++) {
		        logger.log(Level.WARNING, elements[i].getMethodName());
		    }
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
	
	private String encryptPassword(String clave) throws Exception {
		EncryptionManager encryption = new EncryptionManager();
		String encryptedPassword;
		encryptedPassword = encryption.encryptMessage(clave, "symmetric", AlgorithmName.AES);
		return encryptedPassword;
	}

}
