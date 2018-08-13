package cr.ac.ucenfotec.manager;

import java.util.Optional;

public class GestorFactory {	
	
	public static Optional<GestorMaster> createGestor(GestorType ptype) {
		switch(ptype) {
		case AREAFUNCIONAL:
			return Optional.of(new GestorAreaFuncional());
		case HISTORIALTRAMITE:
			return Optional.of(new GestorHistorialTramite());
		case TRAMITE:
			return Optional.of(new GestorTramite());
		case USUARIO:
			return Optional.of(new GestorUsuario());
		default:
			return Optional.empty();		
		}			
	}
}
