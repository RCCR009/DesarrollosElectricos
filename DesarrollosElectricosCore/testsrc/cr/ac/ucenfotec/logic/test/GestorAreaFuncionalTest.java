package cr.ac.ucenfotec.logic.test;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;

import cr.ac.ucenfotec.entities.AreaFuncional;
import cr.ac.ucenfotec.manager.GestorFactory;
import cr.ac.ucenfotec.manager.GestorMaster;
import cr.ac.ucenfotec.manager.GestorType;

public class GestorAreaFuncionalTest {
	
	Optional<GestorMaster> gestor;

	@Before
	public void setUp() {
		gestor = GestorFactory.createGestor(GestorType.AREAFUNCIONAL);
	}
	
	@Test
	public void areaFuncionalCrudTest() {
		//insert
		AreaFuncional area = new AreaFuncional();
		AreaFuncional area1 = new AreaFuncional("area-1","Registro");
		AreaFuncional area2 = new AreaFuncional("area-2","Finanzas");
		gestor.get().create(area1);
		gestor.get().create(area2);
		
		//retriveALL
		Iterator iterator = gestor.get().retriveAll(area).iterator();
		
		while(iterator.hasNext()) {
			AreaFuncional miArea = (AreaFuncional) iterator.next();
			if(miArea.getId().equals("area-1")) {
				assertEquals(area1.toString(),miArea.toString());
			}else if(miArea.getId().equals("area-2")){
				assertEquals(area2.toString(),miArea.toString());
			}
		}
		
		//retriveOne
		AreaFuncional miArea = new AreaFuncional();
		miArea.setId("area-1");
		area = (AreaFuncional)gestor.get().retrive(miArea);
		assertEquals(area1.toString(),area.toString());
		miArea.setId("area-2");
		area = (AreaFuncional)gestor.get().retrive(miArea);
		assertEquals(area2.toString(),area.toString());
		
		//Update
		area1.setNombre("Talento Humano");
		area2.setNombre("Sistemas");
		gestor.get().update(area1);
		gestor.get().update(area2);

		miArea.setId("area-1");
		area = (AreaFuncional)gestor.get().retrive(miArea);
		assertEquals(area1.toString(),area.toString());
		miArea.setId("area-2");
		area = (AreaFuncional)gestor.get().retrive(miArea);
		assertEquals(area2.toString(),area.toString());
		
		//delete
		gestor.get().delete(area1);
		gestor.get().delete(area2);
		miArea.setId("area-1");
		assertNull((AreaFuncional)gestor.get().retrive(miArea));
		miArea.setId("area-2");
		assertNull((AreaFuncional)gestor.get().retrive(miArea));
	}

}
