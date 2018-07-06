package cr.ac.ucenfotec.entities;

import java.time.LocalDate;

public class TareasCompletadas {
	private int id;
	private Tarea tarea;
	private Usuario usuario;
	private LocalDate FechaFin;
	
	public TareasCompletadas() {
		
	}

	public TareasCompletadas(int id, Tarea tarea, Usuario usuario, LocalDate fechaFin) {
		super();
		this.id = id;
		this.tarea = tarea;
		this.usuario = usuario;
		FechaFin = fechaFin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "TareasCompletadas [id=" + id + ", tarea=" + tarea + ", usuario=" + usuario + ", FechaFin=" + FechaFin
				+ "]";
	}

}
