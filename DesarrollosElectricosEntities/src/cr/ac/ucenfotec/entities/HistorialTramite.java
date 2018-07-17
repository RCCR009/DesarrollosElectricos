package cr.ac.ucenfotec.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HistorialTramite {
	private int id;
	private Tramite tramite;
	private Usuario usuarioInicio;
	private Estado estado;
	private List<Tarea> tareaCompletadas;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	
	public HistorialTramite() {
		
	}
	
	public HistorialTramite(int id, Tramite tramite, Usuario usuarioInicio, Estado estado,
			ArrayList<Tarea> tareaCompletadas, LocalDate fechaInicio, LocalDate fechaFin) {
		super();
		this.id = id;
		this.tramite = tramite;
		this.usuarioInicio = usuarioInicio;
		this.estado = estado;
		this.tareaCompletadas = tareaCompletadas;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Tramite getTipoTramite() {
		return tramite;
	}

	public void setTipoTramite(Tramite tipoTramite) {
		this.tramite = tipoTramite;
	}

	public Usuario getUsuarioInicio() {
		return usuarioInicio;
	}

	public void setUsuarioInicio(Usuario usuarioInicio) {
		this.usuarioInicio = usuarioInicio;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public List<Tarea> getTareaCompletadas() {
		return Collections.unmodifiableList(tareaCompletadas);
	}

	public void setTareaCompletadas(List<Tarea> tareaCompletadas) {
		this.tareaCompletadas = tareaCompletadas;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	@Override
	public String toString() {
		return "HistorialTramite [id=" + id + ", tramite=" + tramite + ", usuarioInicio=" + usuarioInicio + ", estado="
				+ estado + ", tareaCompletadas=" + tareaCompletadas + ", fechaInicio=" + fechaInicio + ", fechaFin="
				+ fechaFin + "]";
	}

}
