
package MAIN;
/**
 *
 * @author JuFalabrino
 */
import OPERACIONES.ClaseHija_Resta;
import OPERACIONES.ClaseHija_Suma;

public class ClasePrincipal {
   public static void main(String[] args){
   
       ClaseHija_Suma mensajerosuma = new ClaseHija_Suma ();
       mensajerosuma.PedirDatos();
       mensajerosuma.Sumar();
       System.out.print("El resultado de la suma es: ");
       mensajerosuma.MostrarResultado();
       
       ClaseHija_Resta mensajeroresta = new ClaseHija_Resta ();
       mensajeroresta.PedirDatos();
       mensajeroresta.Resta();
       System.out.print("El resultado de la suma es: ");
       mensajeroresta.MostrarResultado();
   
   
   }
   
    
}
