package cr.ac.ucenfotec.entities;

public class AreaFuncional {
	private String id;
	private String nombre;
	
	public AreaFuncional() {
		
	}
	
	public AreaFuncional(String id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "AreaFuncional [id=" + id + ", nombre=" + nombre + "]";
	}

}
