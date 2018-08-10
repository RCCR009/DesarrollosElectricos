package cr.ac.ucenfotec.entities;

public class Actividad {
	private String detalle;
	private String respuesta;
	
	public Actividad() {
		
	}
	
	public Actividad(String detalle, String respuesta) {
		super();
		this.detalle = detalle;
		this.respuesta = respuesta;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	@Override
	public String toString() {
		return "Actividad [detalle=" + detalle + ", respuesta=" + respuesta + "]";
	}

}
