package cr.ac.ucenfotec.logic.test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;

import cr.ac.ucenfotec.entities.AreaFuncional;
import cr.ac.ucenfotec.entities.Estado;
import cr.ac.ucenfotec.entities.HistorialTramite;
import cr.ac.ucenfotec.entities.Tarea;
import cr.ac.ucenfotec.entities.Tramite;
import cr.ac.ucenfotec.entities.Usuario;
import cr.ac.ucenfotec.manager.GestorFactory;
import cr.ac.ucenfotec.manager.GestorMaster;
import cr.ac.ucenfotec.manager.GestorType;

public class GestorTramite {
	Optional<GestorMaster> gestor;

	@Before
	public void setUp() {
		gestor = GestorFactory.createGestor(GestorType.TRAMITE);
	}
	
	@Test
	public void historialTramiteCrudTest() {
		//insert
		Tramite tramite = new Tramite();
		ArrayList<Tarea> ltarea = new ArrayList<Tarea>();
		Tramite tramite1 = new Tramite(100,"Registrar Usuario",ltarea);
		ArrayList<Tarea> ltarea2 = new ArrayList<Tarea>();
		Tramite tramite2 = new Tramite(200,"Matricular Usuario",ltarea2);
		gestor.get().create(tramite1);
		gestor.get().create(tramite2);
		
		//retriveALL
		Iterator iterator = gestor.get().retriveAll(tramite).iterator();
		
		while(iterator.hasNext()) {
			Tramite mit = (Tramite) iterator.next();
			if(mit.getId() == 100) {
				assertEquals(tramite1.toString(),mit.toString());
			}else if(mit.getId() == 200){
				assertEquals(tramite2.toString(),mit.toString());
			}
		}
		
		//retriveOne
		Tramite miT = new Tramite();
		miT.setId(100);
		tramite = (Tramite)gestor.get().retrive(miT);
		assertEquals(tramite1.toString(),tramite.toString());
		miT.setId(200);
		tramite = (Tramite)gestor.get().retrive(miT);
		assertEquals(tramite2.toString(),tramite.toString());
		
		//Update
		tramite1.setDetalle("Cobros");
		tramite2.setDetalle("Proveeduria");
		gestor.get().update(tramite1);
		gestor.get().update(tramite2);

		miT.setId(100);
		tramite = (Tramite)gestor.get().retrive(miT);
		assertEquals(tramite1.toString(),tramite.toString());
		miT.setId(200);
		tramite = (Tramite)gestor.get().retrive(miT);
		assertEquals(tramite2.toString(),tramite.toString());
		
		//delete
		gestor.get().delete(tramite1);
		gestor.get().delete(tramite2);
		miT.setId(100);
		assertNull((Tramite)gestor.get().retrive(miT));
		miT.setId(200);
		assertNull((Tramite)gestor.get().retrive(miT));
		
	}
}
