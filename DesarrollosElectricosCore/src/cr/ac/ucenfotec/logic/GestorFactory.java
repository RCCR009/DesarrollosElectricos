package cr.ac.ucenfotec.logic;

import java.util.Optional;

public class GestorFactory {
	
	public static Optional<GestorMaster> createGestor(GestorType ptype) {
		switch(ptype) {
		case ACTIVIDAD:
			return Optional.of(new GestorActividad());
		case AREAFUNCIONAL:
			return Optional.of(new GestorAreaFuncional());
		case HISTORIALTRAMITE:
			return Optional.of(new GestorHistorialTramite());
		case TAREA:
			return Optional.of(new GestorTarea());
		case TRAMITE:
			return Optional.of(new GestorTramite());
		case USUARIO:
			return Optional.of(new GestorUsuario());
		default:
			return Optional.empty();		
		}			
	}
}
