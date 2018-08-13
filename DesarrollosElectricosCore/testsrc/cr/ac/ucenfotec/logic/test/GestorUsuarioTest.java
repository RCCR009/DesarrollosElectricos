package cr.ac.ucenfotec.logic.test;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;

import cr.ac.ucenfotec.entities.AreaFuncional;

import cr.ac.ucenfotec.entities.Usuario;
import cr.ac.ucenfotec.manager.GestorFactory;
import cr.ac.ucenfotec.manager.GestorMaster;
import cr.ac.ucenfotec.manager.GestorType;

public class GestorUsuarioTest {
	Optional<GestorMaster> gestor;

	@Before
	public void setUp() {
		gestor = GestorFactory.createGestor(GestorType.USUARIO);
	}
	
	@Test
	public void UsuarioCrudTest() {
		//insert
		Usuario usuario = new Usuario();
		AreaFuncional area = new AreaFuncional("area-1", "Registro");
		Usuario usuario1 = new Usuario("us-1", area, "123", "Ramon", "Valdez");

		AreaFuncional area2 = new AreaFuncional("area-2", "finanzas");
		Usuario usuario2 = new Usuario("us-2", area2, "123", "Roberto", "Gomez");
		
		gestor.get().create(usuario1);
		gestor.get().create(usuario2);
		
		//retriveALL
		Iterator iterator = gestor.get().retriveAll(usuario).iterator();
		
		while(iterator.hasNext()) {
			Usuario miUsuario = (Usuario) iterator.next();
			if(miUsuario.getId().equals("us-1")) {
				assertEquals(usuario1.toString(),miUsuario.toString());
			}else if(miUsuario.getId().equals("us-2")){
				assertEquals(usuario2.toString(),miUsuario.toString());
			}
		}
		
		//retriveOne
		Usuario miusuario = new Usuario();
		miusuario.setId("us-1");
		usuario = (Usuario)gestor.get().retrive(miusuario);
		assertEquals(usuario1.toString(),usuario.toString());
		miusuario.setId("us-2");
		usuario = (Usuario)gestor.get().retrive(miusuario);
		assertEquals(usuario2.toString(),usuario.toString());
		
		//Update
		usuario1.setNombre("Edgar");
		usuario2.setNombre("Ricardo");
		gestor.get().update(usuario1);
		gestor.get().update(usuario2);

		miusuario.setId("us-1");
		usuario = (Usuario)gestor.get().retrive(miusuario);
		assertEquals(usuario1.toString(),usuario.toString());
		miusuario.setId("us-2");
		usuario = (Usuario)gestor.get().retrive(miusuario);
		assertEquals(usuario2.toString(),usuario.toString());
		
		//delete
		gestor.get().delete(usuario1);
		gestor.get().delete(usuario2);
		miusuario.setId("us-1");
		assertNull((Usuario)gestor.get().retrive(miusuario));
		miusuario.setId("us-2");
		assertNull((Usuario)gestor.get().retrive(miusuario));
		
	}

}
