package cr.ac.ucenfotec.entities;

public class Usuario {
	private String id;
	private AreaFuncional areaAsociada;
	private String clave;
	private String nombre;
	private String apellido;
	
	public Usuario() {
		
	}

	public Usuario(String id, AreaFuncional areaAsociada, String clave, String nombre, String apellido) {
		super();
		this.id = id;
		this.areaAsociada = areaAsociada;
		this.clave = clave;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public AreaFuncional getAreaAsociada() {
		return areaAsociada;
	}

	public void setAreaAsociada(AreaFuncional areaAsociada) {
		this.areaAsociada = areaAsociada;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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


	
}
