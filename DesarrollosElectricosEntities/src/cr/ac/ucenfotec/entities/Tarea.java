package cr.ac.ucenfotec.entities;

import java.util.ArrayList;

public class Tarea {
	private int id;
	private String detalle;
	private ArrayList<Actividad> actividades;
	private int numero;
	
	public Tarea() {
		
	}

	public Tarea(int id, String detalle, ArrayList<Actividad> actividades, int numero) {
		super();
		this.id = id;
		this.detalle = detalle;
		this.actividades = actividades;
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

	public ArrayList<Actividad> getActividades() {
		return actividades;
	}

	public void setActividades(ArrayList<Actividad> actividades) {
		this.actividades = actividades;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Tarea [id=" + id + ", detalle=" + detalle + ", actividades=" + actividades + ", numero=" + numero + "]";
	}
	
}
