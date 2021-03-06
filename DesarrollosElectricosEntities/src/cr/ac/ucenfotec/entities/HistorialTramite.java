package cr.ac.ucenfotec.entities;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class HistorialTramite {
	private int id;
	private String detalle;
	private Usuario usuarioInicio;
	private Estado estado;
	private List<Tarea> tareaCompletadas;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	
	public HistorialTramite() {
		
	}
	
	public HistorialTramite(int id, String detalle, Usuario usuarioInicio, Estado estado, List<Tarea> tareaCompletadas,
			LocalDate fechaInicio, LocalDate fechaFin) {
		super();
		this.id = id;
		this.detalle = detalle;
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

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	@Override
	public String toString() {
		return "HistorialTramite [id=" + id + ", detalle=" + detalle + ", usuarioInicio=" + usuarioInicio + ", estado="
				+ estado + ", tareaCompletadas=" + tareaCompletadas + ", fechaInicio=" + fechaInicio + ", fechaFin="
				+ fechaFin + "]";
	}
	
	public static class HistorialTramiteBuilder{
		private int nestedId;
		private String nestedDetalle;
		private Usuario nestedUsuarioInicio;
		private Estado nestedEstado;
		private List<Tarea> nestedTareaCompletadas;
		private LocalDate nestedFechaInicio;
		private LocalDate nestedFechaFin;
		
		public HistorialTramiteBuilder() {
			
		}

		public HistorialTramiteBuilder NestedId(int nestedId) {
			this.nestedId = nestedId;
			return this;
		}

		public HistorialTramiteBuilder NestedDetalle(String nestedDetalle) {
			this.nestedDetalle = nestedDetalle;
			return this;
		}

		public HistorialTramiteBuilder NestedUsuarioInicio(Usuario nestedUsuarioInicio) {
			this.nestedUsuarioInicio = nestedUsuarioInicio;
			return this;
		}

		public HistorialTramiteBuilder NestedEstado(Estado nestedEstado) {
			this.nestedEstado = nestedEstado;
			return this;
		}

		public HistorialTramiteBuilder NestedTareaCompletadas(List<Tarea> nestedTareaCompletadas) {
			this.nestedTareaCompletadas = nestedTareaCompletadas;
			return this;
		}

		public HistorialTramiteBuilder NestedFechaInicio(LocalDate nestedFechaInicio) {
			this.nestedFechaInicio = nestedFechaInicio;
			return this;
		}

		public HistorialTramiteBuilder NestedFechaFin(LocalDate nestedFechaFin) {
			this.nestedFechaFin = nestedFechaFin;
			return this;
		}
		
		public HistorialTramite createHistorialTramite() {
			return new HistorialTramite(nestedId,nestedDetalle,nestedUsuarioInicio,nestedEstado,nestedTareaCompletadas,nestedFechaInicio,nestedFechaFin);
		}
		
	}
	
}
