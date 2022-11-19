
public class Conexion {
// PUNTO 2 ATRIBUTOS
	private String nombre, host, usuario, password, tipo;
	private int puerto;
	
	//PUNTO 13 CONSTANTES
	
	protected double TAMAÑO = 8.0;
	protected String PROCESADOR_PARA_WINDOWS = "intel";
	protected String PROCESADOR_PARA_LINUX = "adm";
	protected String SISTEMA_OPERATIVO_WINDOWS = "windows";
	protected String SISTEMA_OPERATIVO_LINUX = "ubuntu";
	
	// PUNTO 3 CONSTRUCTORES
	
	// CONSTRUCTOR A CON TODOS LOS ATRIBUTOS
	
	public Conexion(String nombre, String host, String usuario, String password,  String tipo, int puerto) {
		this.nombre=nombre;
		this.host=host;
		this.usuario=usuario;
		this.password=password;
		this.tipo=tipo;
		this.puerto=puerto;
	}
	// CONSTRUCTOR B 
	
	public Conexion(String nombre, int puerto, String host, String tipo) {
		this.nombre=nombre;
		this.puerto=puerto;
		this.host=host;
		this.tipo=tipo;
	}
	// CONSTRUCTOR C
	public Conexion(String password,  String tipo, String nombre, String host) {
		this.password=password;
		this.tipo=tipo;
		this.nombre=nombre;
		this.host=host;
}
	//CONSTRUCTOR D
	public Conexion( String host, String usuario, String password ) {
		this.host=host;
		this.usuario=usuario;
		this.password=password;
		
}
	//CONSTRUCTOR POR DEFECTO
	public Conexion() {
		
	}
	// PUNTO 4 GETTER Y SETTER
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPuerto() {
		return puerto;
	}

	public void setPuerto(int puerto) {
		this.puerto = puerto;
	}
	
	
	
	
}
