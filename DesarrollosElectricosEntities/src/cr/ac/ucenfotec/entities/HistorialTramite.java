package cr.ac.ucenfotec.entities;

import java.sql.Date;

public class HistorialTramite {
	private Tramite tramite;
	private Usuario usuarioInicio;
	private Estado estado;
	private int tareaCompletadas;
	private Date fechaInicio;
	private Date fechaFin;
	
	public HistorialTramite() {
		
	}
	
	public HistorialTramite(Tramite tramite, Usuario usuarioInicio, Estado estado,
			int tareaCompletadas, Date fechaInicio, Date fechaFin) {
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

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	@Override
	public String toString() {
		return "historialTramite [tramite=" + tramite + ", usuarioInicio=" + usuarioInicio + ", estado=" + estado
				+ ", tareaCompletadas=" + tareaCompletadas + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin
				+ "]";
	}

}
