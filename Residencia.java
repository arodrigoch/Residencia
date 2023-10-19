
/**
 * @author - (Pon aqui tu nombre)
 * 
 * La clase representa a una residencia de estudiantes en la que hay tres tipos de habitaciones:
 * doble, normal y especial. 
 * 
 * La residencia alquila habitaciones por mes emitiendo una factura con el importe a pagar
 * y mostrando un mensaje si el cliente ha sido agraciado con un pase de piscina de un dia.
 * Los alquileres realizados en julio y agosto solo pueden ser de habitaciones especiales.
 * Si en julio y agosto se contrata el servicio de desayuno y cena tiene descuento.
 * 
 * La residencia calcula la cantidad de habitaciones alquiladas y el total de todas las facturas
 */
public class Residencia
{
    //TODO: definir constantes
    private final String DOBLE = "D";
    private final String NORMAL = "N";
    private final String ESPECIAL = "E";
    private final double PRECIO_DOBLE = 150.0;
    private final double PRECIO_NORMAL = 100.0;
    private final double PRECIO_ESPECIAL = 300.0;
    private final double PRECIO_DESAYUNO = 100.0;
    private final double PRECIO_CENA = 200.0;
    private final double IVA = 0.20;
    private final double DESCUENTO_VERANO = 0.2;

    //TODO: declarar atributos
    private String nombre;
    private int cantidadDobles;
    private int cantidadNormales;
    private int cantidadEspeciales;
    private double totalFacturas;


    /**
     * Constructor - Inicializa adecuadamente todos los atributos
     */
    public Residencia(String unNombre) {
        nombre = unNombre;
        cantidadDobles = 0;
        cantidadNormales = 0;
        cantidadEspeciales = 0;
        totalFacturas = 0.0;

        //TODO: metodo constructor, inicializa adecuadamente todos los atributos 
    }

    /**
     *  Accesor para el nombre de la residencia
     */
        //TODO: accesor para el nombre de la residencia
    /**
     *  Mutador para el nombre de la residencia
     */
        //TODO: mutador para el nombre de la residencia
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void alquilarHabitacion(String tipoHabitacion, boolean desayuno, boolean cena, int anio, int mes){
        switch (tipoHabitacion){
            case DOBLE:
                totalFacturas += PRECIO_DOBLE;
                break;
            case NORMAL:
                totalFacturas += PRECIO_NORMAL;
                break;
            case ESPECIAL:
                totalFacturas += PRECIO_ESPECIAL;
                break;
            default:
                return;
        }
        if(desayuno = true){
            totalFacturas += PRECIO_DESAYUNO;
        }
        if(cena = true){
            totalFacturas += PRECIO_CENA;
        }
        switch (mes){
            case 1:

            case 2:

            case 3:

            case 4:

            case 5:

            case 6:

            case 7:

            case 8:

            case 9:

            case 10:

            case 11:

            case 12:

            default:

        }
    }
    /**
     *  (leer detalladamente el enunciado del examen en papel)
     *  
     * @param tipo 'N' para normal, 'D' para doble y 'E' para especial
     * @param desayuno a true si se quiere contratar el servicio de desayuno, false  sino
     * @param cena a true si se quiere contratar poder tomar la cena en el comedor, false  sino
     * @param ano de alquiler de pedido
     * @param mes de alquiler de pedido
     * 
     *  Por simplicidad consideraremos  en cada pedido  un unico mes
     *  Ej.        
     *  alquilarHabitacion('N', false, true, 2022, 3);  
     *  significa que se alquila una "habitacion normal" sin desayuno pero con cena para marzo de 2021
     *  alquilarHabitacion('E', true, true, 2022, 7);   
     *  significa que se alquila una "habitacion especial" con desayuno y cena para julio de 2022
     *  
     *  El metodo calcula el importe a pagar por el cliente teniendo en cuenta que se aplica un 20% de IVA y 
     *  los alquileres de habitaciones especiales realizados en julio o agosto tiene el descuento de verano del 20% 
     *  sobre el precio total sin iva siempre y cuando se contrate el desayuno y la cena.
     *  
     *  En julio y agosto solo se alquilan habitaciones especiales, en caso de intentar alquilar otro tipo de habitacion
     *  se imprimira un mensaje de advertencia (ver resultados de ejecucion). 
     *  
     *  Hay que actualizar adecuadamente los atributos para registrar la cantidad de habitaciones de cada tipo alquiladas, 
     *  el total acumulado que se recauda y contabilizar cuantas habitaciones se alquilan en los meses de verano (julio y agosto).
     *  
     *  A continuacion se emite la factura al cliente con su correspondiente numero de factura que se incrementa cada vez que 
     *  se hace un alquiler. Este numero de factura empieza en 1.000.000 (ver resultados de ejecucion).
     *  
     *  La residencia ademas cada vez que se hace un alquiler:
     *  - realiza un sorteo obteniendo un numero aleatorio del 0 a 9 y si este coincide con los decimales (ultimo digito) 
     *    del numero de la factura le regala al cliente un pase de un dia a las piscinas. 
     *  - contabiliza  el numero de pases gratis a la piscina que han tocado.
     *  
     *  Analiza con una sentencia switch el tipo de habitacion.
     */
    public void alquilarHabitacion(char tipo, boolean desayuno, boolean cena, int ano, int mes)
    {
        //TODO: variables locales alquilarHabitacion
        
        //TODO: impresion ticket si no es el tipo de habitacion que se puede alquilar en verano alquilarHabitacion
        
        //TODO: codigo metodo alquilarHabitacion
        
        //TODO: impresion del ticket alquilarHabitacion
        
        //TODO: impresion estadisticas alquilarHabitacion
    }
    
    /**
     *  Obtiene el tipo de habitacion mas alquilada ( D | E | N )
     */
        //TODO: crear el metodo obtenerTipoHabitacionMasAlquilada() 
    
}
