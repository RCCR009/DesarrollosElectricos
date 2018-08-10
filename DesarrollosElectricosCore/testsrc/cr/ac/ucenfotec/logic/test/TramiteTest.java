package cr.ac.ucenfotec.logic.test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import cr.ac.ucenfotec.entities.Actividad;
import cr.ac.ucenfotec.entities.AreaFuncional;
import cr.ac.ucenfotec.entities.Tarea;
import cr.ac.ucenfotec.entities.Tramite;
import cr.ac.ucenfotec.entities.Usuario;
import cr.ac.ucenfotec.logic.GestorTramite;

public class TramiteTest {

	@Test
	public void test() {
		
		
		LocalDate today = LocalDate.now();
		
		ArrayList<Actividad> actividades = new ArrayList<Actividad>();
		Actividad actividad1 = new Actividad ("un prueba","la respuesta de la prueba");
		
		actividades.add(actividad1);
		AreaFuncional area = new AreaFuncional("1","areaPrueba");
	
		
		
		
		AreaFuncional area1 = new AreaFuncional("1","usuario");
		
		Usuario usuario1 = new Usuario("1",area1,"123erb","Steve","Terrence");
		
		Tarea tarea1 = new Tarea(area,"esto es una prueba",actividades,usuario1,today);
		ArrayList<Tarea> tareas = new ArrayList<Tarea>();
		tareas.add(tarea1);
		
		Tramite tramite1 = new Tramite(1,"esto es una prueba",tareas,1);
		
		
		
		
		assertEquals("123erb",usuario1.getClave());
		
		
		
		
		
		
		
	}
	
	@Test
	public void test2() {
		
		
		AreaFuncional area2 = new AreaFuncional("2","staff");
		
		Usuario usuario2 = new Usuario("2",area2,"123erb","John","Clay");
		
		assertEquals(1,usuario2.getAreaAsociada());
		
	}
	
	@Test
	public void test3() {
	
AreaFuncional area1 = new AreaFuncional("1","usuario");
		
		Usuario usuario1 = new Usuario("1",area1,"123erb","Steve","Terrence");
		
		AreaFuncional area2 = new AreaFuncional("2","staff");
		
		Usuario usuario2 = new Usuario("2",area2,"123erb","John","Clay");
		
		assertNotSame(usuario1, usuario2);
	}
	
	@Test
	public void test4() {
LocalDate today = LocalDate.now();
		
		ArrayList<Actividad> actividades = new ArrayList<Actividad>();
		Actividad actividad1 = new Actividad ("un prueba","la respuesta de la prueba");
		AreaFuncional area = new AreaFuncional("1","areaPrueba");
		
		actividades.add(actividad1);
		Usuario usuario1 = new Usuario("1",area,"123erb","Steve","Terrence");
		
		Tarea tarea1 = new Tarea(area,"esto es una prueba",actividades,usuario1,today);
		ArrayList<Tarea> tareas = new ArrayList<Tarea>();
		tareas.add(tarea1);
		
		Tramite tramite1 = new Tramite(1,"esto es una prueba",tareas,1);
		
		
	}
	
@Test
public void test5() {
	LocalDate today = LocalDate.now();
	
	AreaFuncional area1 = new AreaFuncional("1","usuario");
	
	Usuario usuario1 = new Usuario("1",area1,"123erb","Steve","Terrence");
	

	ArrayList<Actividad> actividades = new ArrayList<Actividad>();
	Actividad actividad1 = new Actividad ("un prueba","la respuesta de la prueba");
	Actividad actividad2 = new Actividad ("una segunda  prueba","la respuesta de la prueba dos");
	
	actividades.add(actividad1);
	actividades.add(actividad2);
	
	GestorTramite gestorT = new GestorTramite();
	AreaFuncional area2 = new AreaFuncional("2","staff");
	Tarea tarea1 = new Tarea(area2,"esto es una prueba",actividades,usuario1,today);
	
	 //Assert.assertArrayEquals(actividades,tarea1.getActividades());
	
}



}
