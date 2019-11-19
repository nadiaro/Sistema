package Dominio;

public class Principal {

	public static void main(String[] args) {
		
		Integer opcion=0;

		do{
			
			switch(opcion){
				
			case 1: System.out.println("Registrarse");
			break;
			
			case 2: System.out.println("Loguearse");
			break;
			
			case 3: System.out.println("Comprar");
			break;
			
			case 4:System.out.println("Pagar");
			break;
			
			case 5: System.out.println("Salir");
			break;
			} 
			
		}while (opcion<=5);
	}

}

