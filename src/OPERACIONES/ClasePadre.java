
package OPERACIONES;

/**
 *
 * @author JuFalabrino
 */
import java.util.Scanner;

public class ClasePadre {
    protected int valor1, valor2, resultado;
    Scanner entrada = new Scanner(System.in);
   
   //Este metodo pide los valores al uuario
   public void PedirDatos(){
       System.out.print("Dame el primer Valor:");
       valor1 = entrada.nextInt();
       
       System.out.print("Dame el segundo Valor:");
       valor2 = entrada.nextInt();
    }
    
    // Este método muestra el resultado
    
   public void MostrarResultado(){
       System.out.println( resultado);
   }
       
   
   
   
   
   
   
   
    
    
}
