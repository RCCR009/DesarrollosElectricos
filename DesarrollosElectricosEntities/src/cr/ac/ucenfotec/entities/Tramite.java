package cr.ac.ucenfotec.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tramite {
	private int id;
	private String detalle;
	private List<Tarea> tareas;
	
	public Tramite() {
		tareas = new ArrayList<>();
	}

	public Tramite(int id, String detalle, ArrayList<Tarea> tareas) {
		super();
		this.id = id;
		this.detalle = detalle;
		this.tareas = tareas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public List<Tarea> getTareas() {
		return Collections.unmodifiableList(tareas);
	}

	public void setTareas(ArrayList<Tarea> tareas) {
		this.tareas = tareas;
	}

	@Override
	public String toString() {
		return "Tramite [id=" + id + ", detalle=" + detalle + ", tareas=" + tareas + "]";
	}
	
}
