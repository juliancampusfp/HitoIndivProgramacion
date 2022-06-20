package Ejercicio3;

import java.sql.SQLException;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) throws SQLException{
       try
       {    int opcion=0;
           comida c = new comida();
           do
           {
        	   System.out.println("-----------------------------");
        	   System.out.println("Selecione una opción (1-5)");
        	   System.out.println("-----------------------------");
               System.out.println("1 - Insertar comida");
               System.out.println("2 - Actualizar datos");
               System.out.println("3 - Borrar dato");
               System.out.println("4 - Buscar comida");
               System.out.println("5 - Salir de la aplicación");
               System.out.println("-----------------------------");
               Scanner opcionin = new Scanner(System.in);
               opcion=opcionin.nextInt();
               switch(opcion)
               {
	                   case 1:
	                       c.obtener();
	                       c.añadir();
	                       break;
	                   case 2:
	                       c.actualizarDatos();
	                       break;
	                   case 3:
	                       c.borrarDatos();
	                       break;
	                   case 4:
	                       c.buscarComida();
	                       break;
	                   case 5:
	                       break;
                   default:
                       System.out.println("Seleccione un numero del 1 al 5 porfavor");
               }
           }while(opcion!=5);
           System.out.println("Cerrando aplicación");
       }       
    }
}
class comida
{
   private String nombre;
   private String codigobarras;
   private String caducidad;
   private int unidad;
   private double precio;
}
