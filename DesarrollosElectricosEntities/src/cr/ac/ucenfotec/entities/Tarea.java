package cr.ac.ucenfotec.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tarea {
	private AreaFuncional areaAsignada;
	private String detalle;
	private List<Actividad> actividades;
	private Usuario usuario;
	private LocalDate fechaFin;
	
	public Tarea() {
		actividades = new ArrayList<>();
	}

	public Tarea(AreaFuncional areaAsignada, String detalle, List<Actividad> actividades, Usuario usuario,
			LocalDate fechaFin) {
		super();
		this.areaAsignada = areaAsignada;
		this.detalle = detalle;
		this.actividades = actividades;
		this.usuario = usuario;
		this.fechaFin = fechaFin;
	}

	public AreaFuncional getAreaAsignada() {
		return areaAsignada;
	}

	public void setAreaAsignada(AreaFuncional areaAsignada) {
		this.areaAsignada = areaAsignada;
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

	public void setActividades(List<Actividad> actividades) {
		this.actividades = actividades;
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
		return "Tarea [areaAsignada=" + areaAsignada + ", detalle=" + detalle + ", actividades=" + actividades
				+ ", usuario=" + usuario + ", fechaFin=" + fechaFin + "]";
	}
	
}
