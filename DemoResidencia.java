import java.util.Scanner;

/**
 *  class DemoResidencia 
 *  Clase para testear la clase Residencia 
 */
public class DemoResidencia
{
    private Residencia residencia;
    private Scanner teclado; 

    /**
     * Constructor de la clase DemoResidencia
     */
    public DemoResidencia()
    {
        teclado = new Scanner(System.in);
        residencia = new  Residencia("Tres Olivos");     
    }

    /**
     *  
     */
    public void demo()
    {
        residencia.alquilarHabitacion('N',false,true,2022,3);
        //pausa();
        residencia.alquilarHabitacion('E',true,true,2022,7);
        //pausa();
        residencia.alquilarHabitacion('E',true,true,2022,6);
        //pausa();
        residencia.alquilarHabitacion('D',true,true,2021,12);
        //pausa();
        residencia.alquilarHabitacion('E',false,false,2022,8);
        //pausa();
        residencia.alquilarHabitacion('D',true,true,2022,7);
        //pausa();
        residencia.alquilarHabitacion('N',true,true,2022,8);
        //pausa();
        System.out.println("Tipo de habitacion mas alquilada: " + 
                            residencia.obtenerTipoHabitacionMasAlquilada());
        //fin();
    }
    
    /**
     *  hacer una pausa
     */
    private void pausa()
    {
        System.out.println("\n\nPulse tecla para continuar");        
        teclado.nextLine();
        System.out.print("\u000C");    
    }

    /**
     *  aviso fin demo
     */
    private void fin()
    {
        System.out.println("\n\nFin. Puede cerrar el terminal."); 
    }

    /**
     *  
     * Punto de entrada a la aplicacion     
     */
    public static void main(String[] args) {
        DemoResidencia demoResidencia = new DemoResidencia();
        demoResidencia.demo();
    }
    
}
