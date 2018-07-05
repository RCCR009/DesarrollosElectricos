package cr.ac.ucenfotec.entities;

import java.time.LocalDate;

public class HistorialTareas {
	private Tarea tarea;
	private Usuario usuario;
	private LocalDate FechaFin;
	
	public HistorialTareas() {
		
	}
	
	public HistorialTareas(Tarea tarea, Usuario usuario, LocalDate fechaFin) {
		super();
		this.tarea = tarea;
		this.usuario = usuario;
		FechaFin = fechaFin;
	}

	public Tarea getTarea() {
		return tarea;
	}

	public void setTarea(Tarea tarea) {
		this.tarea = tarea;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public LocalDate getFechaFin() {
		return FechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		FechaFin = fechaFin;
	}

	@Override
	public String toString() {
		return "historialTareas [tarea=" + tarea + ", usuario=" + usuario + ", FechaFin=" + FechaFin + "]";
	}

}
