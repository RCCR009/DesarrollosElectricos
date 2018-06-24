package cr.ac.ucenfotec.entities;

import java.sql.Date;

public class historialTareas {
	private Tarea tarea;
	private Usuario usuario;
	private Date FechaFin;
	
	public historialTareas() {
		
	}
	
	public historialTareas(Tarea tarea, Usuario usuario, Date fechaFin) {
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

	public Date getFechaFin() {
		return FechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		FechaFin = fechaFin;
	}

	@Override
	public String toString() {
		return "historialTareas [tarea=" + tarea + ", usuario=" + usuario + ", FechaFin=" + FechaFin + "]";
	}

}
