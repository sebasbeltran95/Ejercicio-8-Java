package operaciones;

/**
 *
 * @author sebas
 */
import java.util.Scanner;
public class Operaciones {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        String dia = "";
        Scanner Entrada = new Scanner(System.in);
        
        System.out.println("Porfavor Ingrese un dia de la semana");
        dia = Entrada.nextLine();
        
        switch (dia){ 
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
            System.out.println("Es un dia de la semana");
            case "sabado":
            case "domingo":
            System.out.println("Es un dia festivo");
            break;
            default:
                System.out.println("Introduce un dia de la semana");
                break;
        }

        


    }
}
