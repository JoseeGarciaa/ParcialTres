import java.util.Scanner;

// PUNTO 8 HERENCIA

public class Oracle extends Conexion implements OperacionesConexion{
	
// PUNTO 6 ATRIBUTOS
	private boolean plsql;
	private int cantidadDeUsuariosPermitidos;
	
	// PUNTO 14 CONSTANTES
	private int PETICIONES_CONCURRENTES = 1000;
	
	// PUNTO 7 
	
	public boolean isPlsql() {
		return plsql;
	}
	public void setPlsql(boolean plsql) {
		this.plsql = plsql;
	}
	public int getCantidadDeUsuariosPermitidos() {
		return cantidadDeUsuariosPermitidos;
	}
	public void setCantidadDeUsuariosPermitidos(int cantidadDeUsuariosPermitidos) {
		this.cantidadDeUsuariosPermitidos = cantidadDeUsuariosPermitidos;
	}
	//PUNTO 18
	public void devolverCapacidadRespuesta(String SistemaOperativo, int CantidadDePeticiones, String Procesador) {
		// PUNTO 19
		
		Scanner leer=new Scanner(System.in);
		
		
		System.out.println("Digite el sistema operativo:");
		SistemaOperativo=leer.nextLine();
		System.out.println("Digite la cantidad de peticiones:");
		CantidadDePeticiones=leer.nextInt();
		System.out.println("Digite el procesador");
		Procesador=leer.nextLine();
		
		
		if (PETICIONES_CONCURRENTES==CantidadDePeticiones&&PROCESADOR_PARA_LINUX==Procesador) {
			System.out.println("optimo");
		}
		if (PETICIONES_CONCURRENTES>CantidadDePeticiones&&PROCESADOR_PARA_LINUX==Procesador) {
			System.out.println("optimo");
		}
	
	}

	// CONSTRUCTOR POR DEFECTO VACIO
	public Oracle() {
		
	}
	// CONSTRUCTOR CON TODOS LOS ATRIBUTOS
	public Oracle(boolean plsql, int cantidadDeUsuariosPermitidos) {
		this.plsql=plsql;
		this.cantidadDeUsuariosPermitidos=cantidadDeUsuariosPermitidos;
	}
}
