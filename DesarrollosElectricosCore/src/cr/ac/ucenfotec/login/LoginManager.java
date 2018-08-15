package cr.ac.ucenfotec.login;

import cr.ac.cenfotec.encryption.*;
import cr.ac.ucenfotec.entities.Usuario;
import cr.ac.ucenfotec.manager.GestorFactory;
import cr.ac.ucenfotec.manager.GestorMaster;
import cr.ac.ucenfotec.manager.GestorType;

public class LoginManager {
	
	GestorMaster gestor;
	EncryptionManager encryption;
	
	public LoginManager() {
		gestor = GestorFactory.createGestor(GestorType.USUARIO).get();
		encryption = new EncryptionManager();
	}
	
	public boolean Login(String idUsuario, String clave) throws Exception {
		Usuario usuario = new Usuario();
		usuario.setId(idUsuario);
		Usuario u = (Usuario) gestor.retrive(usuario);
		
		if(u == null) {
			return false;
		}
		
		String password = encryption.decryptMessage(u.getClave(), "symmetric", AlgorithmName.AES);
		
		if (password.equals(clave)) {
			return true;
		}else {
			return false;
		}	
	}

}
