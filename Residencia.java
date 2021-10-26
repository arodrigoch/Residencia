
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
    private final char DOBLE = 'D';
    private final char NORMAL = 'N';
    private final char ESPECIAL = 'E';
    
    private final double PRECIO_DOBLE = 150.0;
    private final double PRECIO_NORMAL = 100.0;
    private final double PRECIO_ESPECIAL = 300.0;
    
    private final double PRECIO_DESAYUNO = 100.0;
    private final double PRECIO_CENA = 200.0;

    private final  double IVA = 0.20; 
    private final  double DESCUENTO_VERANO = 0.20; 
    
    private String nombre;

    private int cantidadDobles;
    private int cantidadNormales; 
    private int cantidadEspeciales; 
    
    private double totalRecaudado;
    
    private int cantidadVerano; 
    private int numeroFactura; 
    private int pasesPiscina; 
    
    /**
     * Constructor - Inicializa adecuadamente todos los atributos
     */
    public Residencia(String unNombre)
    {
        nombre = unNombre;
        cantidadDobles = 0;
        cantidadNormales = 0; 
        cantidadEspeciales = 0; 
        totalRecaudado = 0.0;
        cantidadVerano = 0; 
        numeroFactura = 1000000;
        pasesPiscina = 0; 
    }

    /**
     *  Accesor para el nombre de la residencia
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     *  Mutador para el nombre de la residencia
     */
    public void setNombre(String queNombre) {
        nombre = queNombre;
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
     *  significa que se alquila una "habitacion normal" sin desayuno pero con cena para marzo de 2022
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
        double precioHabitacion = 0.0;
        double precioDesayuno = 0.0;
        double precioCena = 0.0;
        double importeSinIva = 0.0;
        double descuentoVerano = 0.0;
        double iva = 0.0;
        double importeConIva = 0.0;
        int centenas = 0;
        int sorteo = 0;
        int habitacionesTotales = 0;
		String ticket = "";
        
        if ( ((mes==7) || (mes==8)) && (tipo!='E') )
        {
            ticket = 
            "*******************************\n" + 
            "Residencia " + nombre + "\n" + 
            "*******************************\n" + 
            "Año: " + ano + "\n" + 
            "Mes: " + mes + "\n" + 
            "Tipo de habitación: " + tipo + "\n" + 
            "------------------------------------\n" + 
            "NO DISPONIBLE\n" + 
            "*******************************\n\n";
            System.out.println(ticket);
            return;
        }
        
        numeroFactura++;
        switch (tipo) {
            case DOBLE:
                cantidadDobles++;
                precioHabitacion = PRECIO_DOBLE;
                break;
            case NORMAL:
                cantidadNormales++;
                precioHabitacion = PRECIO_NORMAL;
                break;
            case ESPECIAL:
                cantidadEspeciales++;
                precioHabitacion = PRECIO_ESPECIAL;
                break;            
        }
        habitacionesTotales = cantidadDobles + cantidadNormales + cantidadEspeciales;
        
        if (desayuno) precioDesayuno = PRECIO_DESAYUNO;
        if (cena) precioCena = PRECIO_CENA;
        
        importeSinIva = precioHabitacion + precioDesayuno + precioCena;
        
        if ((mes==7) || (mes==8)) 
        {
            cantidadVerano++;
            if (desayuno && cena) 
            {
                descuentoVerano = DESCUENTO_VERANO*importeSinIva;
            }
        }
        
        iva = (importeSinIva - descuentoVerano) * IVA;
                
        importeConIva = importeSinIva - descuentoVerano + iva;
        
        totalRecaudado += importeConIva;

        centenas = ((int)importeConIva / 100)%10;
        sorteo = (int)(Math.random()*10);
        if (centenas == sorteo)
	{
		pasesPiscina++;
	}
        
        // impresión del ticket
        ticket = 
        "*******************************\n" + 
        "Residencia " + nombre + "\n" + 
        "*******************************\n" + 
        "Factura nº: " + numeroFactura + "\n" + 
        "------------------------------------\n" + 
        "Año: " + ano + "\n" + 
        "Mes: " + mes + "\n" + 
        "Tipo de habitación: " + tipo + "\n" + 
        "Precio habitación: " + precioHabitacion + "\n" + 
        "Precio desayuno: " + precioDesayuno + "\n" + 
        "Precio cena: " + precioCena + "\n" + 
        "Importe sin Iva: " + importeSinIva + "\n";
        if (descuentoVerano > 0)
	{
		ticket += "Descuento verano: " + descuentoVerano + "\n";
	}
        ticket += 
	"Iva: " + iva + "\n" + 
        "------------------------------------\n" + 
        "Importe con Iva: " + importeConIva + "\n" + 
        "*******************************\n";
        if (centenas == sorteo)         
	{
		ticket += "PREMIO: Pase piscina 1 día.\n\n";
	}
        else
	{
		ticket += centenas + " - " + sorteo + "\n\n";
	}        
        System.out.println(ticket);
        // impresión estadísticas        
        ticket = 
	"Hasta el momento ...\n" + 
        "Total recaudado: " + totalRecaudado + "\n" + 
        "Habitaciones totales: " + habitacionesTotales + "\n" + 
        "Alquileres verano: " + cantidadVerano + "\n" + 
        "Pases piscina: " + pasesPiscina + "\n\n";
        System.out.println(ticket);
    }
    
    /**
     *  Obtiene el tipo de habitacion mas alquilada ( D | E | N )
     */
    public char obtenerTipoHabitacionMasAlquilada() 
    {
        char tipo = 'X';
        if (cantidadDobles > cantidadNormales){
            if (cantidadDobles > cantidadEspeciales){
                tipo = DOBLE;
            }else{
                tipo = ESPECIAL;                
            }
        }else{
            if (cantidadEspeciales > cantidadNormales){
                tipo = ESPECIAL;
            }else{
                tipo = NORMAL;           
            }            
        }        
        return tipo;
    }
}
