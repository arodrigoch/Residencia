------------------------------------------------------------------------
TITULO: Residencia
PROPOSITO: Examen UT03 - DAW1
FECHA: 2021-10-25
COMO EMPEZAR: Leyendo el examen.
AUTHORS: Aitor E.
------------------------------------------------------------------------

El ejercicio simula el funcionamiento de una residencia de estudiantes en la que se alquilan habitaciones. La residencia emite facturas por las habitaciones y los servicios contratados y realiza una serie de calculos para obtener diferentes estadisticas.

Abre el proyecto BlueJ que se proporciona y completa la clase Residencia. La clase DemoResidencia te servira como clase de prueba (no tienes que modificarla).

No olvides poner tu nombre detras de la etiqueta @author.

Un objeto de  la clase Residencia tiene como estado:

	Las siguientes constantes:
	
    * DOBLE, NORMAL  y  ESPECIAL  con los valores asociados ‘D’, ‘N’ y ‘E’ respectivamente que identifican cada uno de los tipos de habitaciones que existen.
    * PRECIO_DOBLE, PRECIO_NORMAL y PRECIO_ESPECIAL  con valores  asociados 150.0, 100.0 y 300.0 que indican el precio de alquiler respectivamente.
    * PRECIO_DESAYUNO y PRECIO_CENA, que incrementan el costo en 100.0 y 200.0 Euros respectivamente. 
    * IVA  con valor asociado 0.20 - representa el iva a aplicar (20%).
    * DESCUENTO_VERANO con valor asociado 0.20 - representa el 20% de descuento sobre el precio total sin iva para los meses de julio y agosto.
      
      
	Los siguientes atributos:
	
    * un atributo nombre  que guarda el  nombre de la residencia.
    * tres atributos enteros  cantidadDobles, cantidadNormales y  cantidadEspeciales  en los que se contabilizara el total de habitaciones alquiladas de cada tipo.
    * un atributo totalFacturas en el que  se recoge el importe total  de todas las facturas.
    * 3 atributos mas que deberas deducir.
       
Identifica adecuadamente el tipo de datos de cada constante y atributo.

El comportamiento de  la clase incluye  los siguientes metodos:

    * el constructor - toma como parametro el nombre de la residencia e inicializa los atributos adecuadamente.
      
    * accesor y mutador  para el nombre de la residencia. 
      
    * metodo alquilarHabitacion()  - este metodo simula que se alquila una habitacion a un estudiante o a una estudiante. El metodo recibe 5 parametros (suponemos todos correctos) : 

              tipo –  indica el tipo de  habitacion.
              desayuno  - a true si se quiere contratar el servicio de desayuno, false  sino.
              cena  - a true si se quiere contratar poder tomar la cena en el comedor, false  sino.
              ano  -  ano de alquiler de pedido.
              mes  -  mes de alquiler de pedido.

	Por simplicidad consideraremos  en cada pedido  un unico  mes
	
		Ej.    	alquilarHabitacion('N', false, true, 2022, 3);   
			significa que se alquila una “habitacion normal” sin desayuno pero con cena para marzo de 2022
			alquilarHabitacion('E', true, true, 2022, 7);   
			significa que se alquila una “habitacion especial” con desayuno y cena para julio de 2022

El metodo calcula el importe a pagar por el cliente  teniendo en cuenta que se aplica un 20% de IVA y los alquileres de habitaciones especiales realizados en julio o agosto tiene el descuento de verano del 20% sobre el precio total sin iva siempre y cuando se contrate el desayuno y la cena.

En julio y agosto solo se alquilan habitaciones especiales, en caso de intentar alquilar otro tipo de habitacion se imprimira un mensaje de advertencia (ver resultados de ejecucion). 

Hay que actualizar adecuadamente los atributos para registrar la cantidad de habitaciones de cada tipo alquiladas, el total acumulado que se recauda y contabilizar cuantas habitaciones se alquilan en los meses de verano, es decir, en julio y agosto.

A continuacion se emite la factura al cliente con su correspondiente numero de factura que se incrementa cada vez que se hace un alquiler. Este numero de factura empieza en un millon, 1000000 (ver resultados de ejecucion).
 
La residencia ademas cada vez que se hace un alquiler:
    * realiza un sorteo obteniendo un numero aleatorio del 0 a 9 y si este coincide con las centenas del numero de la factura le regala al cliente un pase de un dia a las piscinas. 
    * si no coinciden las centenas y el numero aleatorio lo indica mostrando ambos valores separados por un guion al final de la factura (ver resultados de ejecucion)
    * contabiliza  el numero de pases gratis a la piscina que han tocado.
        
    Analiza con una sentencia switch el tipo de habitacion.

Haz primero todos los calculos dejando los resultados en variables locales y despues imprime el resultado tal como se muestra en los ejemplos de ejecucion.


    * metodo obtenerTipoHabitacionMasAlquilada()  - calcula y devuelve  el  tipo  de   la  habitacion que mas se ha alquilado. Si hay varias la primera encontrada. La respuesta debe ser un caracter de entre los siguientes: “D”, “N” o “E”.


Organiza adecuadamente el codigo y evita repetirlo.


Ejemplo de una posible ejecucion

Para probar la aplicacion crea un objeto de la clase DemoResidencia y llama al metodo demo(). Tambien puedes ejecutar el metodo main sobre la clase DemoResidencia sin pasarle argumentos (sin modificar nada pulsando el boton OK).

Los resultados seran similares a los mostrados en la tabla consultables en el fichero result.txt