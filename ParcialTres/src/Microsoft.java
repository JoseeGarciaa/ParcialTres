import java.util.Scanner;

// PUNTO 11 HERENCIA 

public class Microsoft extends Conexion implements OperacionesConexion {
	// PUNTO 10 ATRIBUTOS
private boolean isCloud;
private int lenguajeConsultaOrrm;

// PUNTO 15 CONSTANTES

private int PETICIONES_CONCURRENTES = 1500;

//PUNTO 12 

public boolean isCloud() {
	return isCloud;
}
public void setCloud(boolean isCloud) {
	this.isCloud = isCloud;
}
public int getLenguajeConsultaOrrm() {
	return lenguajeConsultaOrrm;
}
public void setLenguajeConsultaOrrm(int lenguajeConsultaOrrm) {
	this.lenguajeConsultaOrrm = lenguajeConsultaOrrm;
}
// CONSTRUCTOR POR DEFECTO VACIO

public Microsoft() {
	
}
// CONSTRUCTOR CON TODOS LOS ATRIBUTOS 
public Microsoft (boolean isCloud, int lenguajeConsultaOrrm) {
	this.isCloud=isCloud;
	this.lenguajeConsultaOrrm=lenguajeConsultaOrrm;
}
Scanner leer=new Scanner(System.in);

//PUNTO 18
public void devolverCapacidadRespuesta(String SistemaOperativo, int CantidadDePeticiones, String Procesador) {
	
	// PUNTO 19
	System.out.println("Digite el sistema operativo:");
	SistemaOperativo=leer.nextLine();
	System.out.println("Digite la cantidad de peticiones:");
	CantidadDePeticiones=leer.nextInt();
	System.out.println("Digite el procesador");
	Procesador=leer.nextLine();
	
solucion(CantidadDePeticiones, Procesador);
	
	
}

public void solucion(int CantidadDePeticiones,String Procesador) {
	
	if (PETICIONES_CONCURRENTES<CantidadDePeticiones&&PROCESADOR_PARA_WINDOWS==Procesador) {
		System.out.println("optimo");
	}
	


if (PETICIONES_CONCURRENTES>CantidadDePeticiones&&PROCESADOR_PARA_WINDOWS==Procesador) {
	System.out.println("pesimo");
}
}

}





