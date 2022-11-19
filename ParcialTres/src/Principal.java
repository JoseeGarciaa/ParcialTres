import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		Microsoft mc =new Microsoft();
		Oracle or =new Oracle();
		
		
		Scanner leer = new Scanner(System.in);
		int opcion;
       	boolean salir = false;
   		System.out.println("Ingrese la baso de datos que quiere entrar:"+"\n");
   		
       		do {
       		System.out.println("el numero 1 Microsoft"+"\n");
       		
       		System.out.println("el numero 2 Oracle"+"\n");
       	
       		System.out.println("el numero 3 para salir del sistema"+"\n");
       		
       		opcion = leer.nextInt();

       		switch(opcion) {
       			case 1:
       			mc.devolverCapacidadRespuesta(null, opcion, null);
       				
                	break;
            	case 2:
            or.devolverCapacidadRespuesta(null, opcion, null);
            		break;

             	case 3:
             		System.out.println("saliendo del sistema");
             		salir=true;
             		break;
       		}
       	}
            while(!salir);
		
		
	}

}
