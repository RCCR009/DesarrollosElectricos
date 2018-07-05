package cr.ac.ucenfotec.entities;

import java.time.LocalDate;

public class HistorialTramite {
	private Tramite tramite;
	private Usuario usuarioInicio;
	private Estado estado;
	private int tareaCompletadas;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	
	public HistorialTramite() {
		
	}
	
	public HistorialTramite(Tramite tramite, Usuario usuarioInicio, Estado estado,
			int tareaCompletadas, LocalDate fechaInicio, LocalDate fechaFin) {
		super();
		this.tramite = tramite;
		this.usuarioInicio = usuarioInicio;
		this.estado = estado;
		this.tareaCompletadas = tareaCompletadas;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
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

	public int getTareaCompletadas() {
		return tareaCompletadas;
	}

	public void setTareaCompletadas(int tareaCompletadas) {
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
		return "historialTramite [tramite=" + tramite + ", usuarioInicio=" + usuarioInicio + ", estado=" + estado
				+ ", tareaCompletadas=" + tareaCompletadas + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin
				+ "]";
	}

}
