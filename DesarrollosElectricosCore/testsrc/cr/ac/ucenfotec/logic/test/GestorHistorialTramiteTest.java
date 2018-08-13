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
import cr.ac.ucenfotec.entities.Usuario;
import cr.ac.ucenfotec.manager.GestorFactory;
import cr.ac.ucenfotec.manager.GestorMaster;
import cr.ac.ucenfotec.manager.GestorType;

public class GestorHistorialTramiteTest {
	Optional<GestorMaster> gestor;

	@Before
	public void setUp() {
		gestor = GestorFactory.createGestor(GestorType.HISTORIALTRAMITE);
	}
	
	@Test
	public void historialTramiteCrudTest() {
		//insert
		HistorialTramite historialTramite = new HistorialTramite();
		AreaFuncional area = new AreaFuncional("area-1", "Registro");
		Usuario usuario = new Usuario("us-1", area, "123", "Ramon", "Valdez");
		List<Tarea> ltarea = new ArrayList<Tarea>();
		
		HistorialTramite hTramite1 = new HistorialTramite(1,"Matricula",usuario , Estado.EN_CURSO, ltarea,
				LocalDate.now(), LocalDate.now());
		AreaFuncional area2 = new AreaFuncional("area-2", "finanzas");
		Usuario usuario2 = new Usuario("us-2", area2, "123", "Roberto", "Gomez");
		List<Tarea> ltarea2 = new ArrayList<Tarea>();
		
		HistorialTramite hTramite2 = new HistorialTramite(2,"finanzas",usuario2,Estado.COMPLETADO, ltarea2,
				LocalDate.now(), LocalDate.now());
		gestor.get().create(hTramite1);
		gestor.get().create(hTramite2);
		
		//retriveALL
		Iterator iterator = gestor.get().retriveAll(historialTramite).iterator();
		
		while(iterator.hasNext()) {
			HistorialTramite miht = (HistorialTramite) iterator.next();
			if(miht.getId() == 1) {
				assertEquals(hTramite1.toString(),miht.toString());
			}else if(miht.getId() == 2){
				assertEquals(hTramite2.toString(),miht.toString());
			}
		}
		
		//retriveOne
		HistorialTramite miHT = new HistorialTramite();
		miHT.setId(1);
		historialTramite = (HistorialTramite)gestor.get().retrive(miHT);
		assertEquals(hTramite1.toString(),historialTramite.toString());
		miHT.setId(2);
		historialTramite = (HistorialTramite)gestor.get().retrive(miHT);
		assertEquals(hTramite2.toString(),historialTramite.toString());
		
		//Update
		hTramite1.setDetalle("Cobros");
		hTramite2.setDetalle("Proveeduria");
		gestor.get().update(hTramite1);
		gestor.get().update(hTramite2);

		miHT.setId(1);
		historialTramite = (HistorialTramite)gestor.get().retrive(miHT);
		assertEquals(hTramite1.toString(),historialTramite.toString());
		miHT.setId(2);
		historialTramite = (HistorialTramite)gestor.get().retrive(miHT);
		assertEquals(hTramite2.toString(),historialTramite.toString());
		
		//delete
		gestor.get().delete(hTramite1);
		gestor.get().delete(hTramite2);
		miHT.setId(1);
		assertNull((HistorialTramite)gestor.get().retrive(miHT));
		miHT.setId(2);
		assertNull((HistorialTramite)gestor.get().retrive(miHT));
		
	}
}
