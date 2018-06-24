package cr.ac.ucenfotec.entities;

import java.util.ArrayList;

public class Tramite {
	private int id;
	private int numero;
	private String detalle;
	private ArrayList<Tarea> tareas;
	
	public Tramite() {
		super();
	}

	public Tramite(int id, String detalle, ArrayList<Tarea> tareas, int numero) {
		super();
		this.id = id;
		this.detalle = detalle;
		this.tareas = tareas;
		this.numero = numero;
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

	public ArrayList<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(ArrayList<Tarea> tareas) {
		this.tareas = tareas;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Tramite [id=" + id + ", detalle=" + detalle + ", tareas=" + tareas + "]";
	}
	
}
