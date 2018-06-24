package cr.ac.ucenfotec.entities;

public class Actividad {
	private int id;
	private String detalle;
	private String respuesta;
	
	public Actividad() {
		
	}
	
	public Actividad(int id, String detalle, String respuesta) {
		super();
		this.id = id;
		this.detalle = detalle;
		this.respuesta = respuesta;
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

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	@Override
	public String toString() {
		return "Actividad [id=" + id + ", detalle=" + detalle + ", respuesta=" + respuesta + "]";
	}

}
