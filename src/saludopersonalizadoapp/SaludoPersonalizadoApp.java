package saludopersonalizadoapp;
import java.util.Scanner;
        
public class SaludoPersonalizadoApp {

        public static void main(String[] args) {
        //Nos aparece un cuadro de diálogo.
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = teclado.nextLine();
        
        System.out.println("Bienvenido " + nombre);
      
    }
    
}
