package cr.ac.ucenfotec.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tarea {
	private int id;
	private String detalle;
	private List<Actividad> actividades;
	private int numero;
	private Usuario usuario;
	private LocalDate fechaFin;
	
	public Tarea() {
		actividades = new ArrayList<>();
	}

	public Tarea(int id, String detalle, ArrayList<Actividad> actividades, int numero, Usuario usuario, LocalDate fechaFin) {
		super();
		this.id = id;
		this.detalle = detalle;
		this.actividades = actividades;
		this.numero = numero;
		this.usuario = usuario;
		this.fechaFin = fechaFin;
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

	public List<Actividad> getActividades() {
		return Collections.unmodifiableList(actividades);
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	@Override
	public String toString() {
		return "Tarea [id=" + id + ", detalle=" + detalle + ", actividades=" + actividades + ", numero=" + numero
				+ ", usuario=" + usuario + ", fechaFin=" + fechaFin + "]";
	}
	
}
