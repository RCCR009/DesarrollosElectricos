package cr.ac.ucenfotec.entities;

public class Usuario {
	private String id;
	private AreaFuncional areaAsociada;
	private String clave;
	private String nombre;
	private String apellido;
	
	public Usuario() {
		
	}
	
	public Usuario(String id, int areaAsociada, String clave, String nombre, String apellido) {
		super();
		this.id = id;
		this.areaAsociada = new AreaFuncional();
		this.areaAsociada.setId(areaAsociada);
		this.clave = clave;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAreaAsociada() {
		return areaAsociada.getId();
	}

	public void setAreaAsociada(int areaAsociada) {
		this.areaAsociada = new AreaFuncional();
		this.areaAsociada.setId(areaAsociada);
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", areaAsociada=" + areaAsociada + ", clave=" + clave + ", nombre=" + nombre
				+ ", apellido=" + apellido + "]";
	}
	
}
