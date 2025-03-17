# Java
java-projects
consignas

1-ReservaAsientos

Suponer un sistema de reserva de asientos para un anfiteatro. El teatro cuenta con 10 filas de 10 asientos cada una. Se necesita desarrollar un sistema (sin uso de bases de datos, únicamente manejo de datos de forma lógica) que permita llevar a cabo lo siguiente:
Cargar el “mapa” de las filas y asientos.
Indicando con una “X” los asientos ocupados y con una “L” los asientos libres. Al iniciar el programa, todos los asientos deben estar libres.
Manejar la reserva de asientos contemplando que un asiento SOLO PUEDE SER RESERVADO si se encuentra en estado “L”.
En caso de que se intente reservar un asiento en estado “X”, se deberá permitir al comprador elegir otro asiento. Si el asiento está en “L”, deberá pasar automáticamente al estado “X”.
Para finalizar el programa se deberá ingresar un valor en particular.
Contemplar que no existe una cantidad exacta de veces que el programa se pueda ejecutar.
Contemplar que SOLO EXISTEN 10 FILAS y 10 ASIENTOS.
No se pueden reservar asientos fuera de esas numeraciones. No se permite “sobreventa”.
Consideraciones:
No es necesaria implementación ni de IGU ni de BD. Se evaluará 100% el manejo lógico del desarrollo de la aplicación.
Extra:
En caso de que un cliente solicite visualizar cuáles son los asientos libres, se debe permitir mostrar de forma gráfica el estado de los asientos pero NO UTILIZAR IGU para este caso.
Utilizar ÚNICAMENTE lógica y la salida por consola.                                                                                                                                                                                                                              
    
2-AnfiteatroSistemaTicketsPOO

Basándose en el mismo escenario del sistema de reserva de asientos para un anfiteatro, llegó el momento de plantear el “sistema de tickets” que obtendrá cada persona al reservar su asiento. Para ello tener en cuenta lo siguiente:

Crear la “plantilla” necesaria para guardar los siguientes datos por ticket: número, fila, asiento, fecha de compra, fecha de validez, precio.

Usar una “base de datos lógica” mediante alguna estructura de datos que permita almacenar un número indeterminado de tickets. Cargar una serie de tickets a dicha estructura.

Crear un método que recorra la estructura seleccionada y sume los precios de todos los tickets. Mostrar por pantalla el total. No es necesario usar IGU para esto.

Solicitar al usuario que ingrese un número de fila. A partir de esto, mostrar por pantalla los datos de los tickets pertenecientes a esa fila. No es necesario usar IGU para esto.

Consideraciones:
No es necesaria implementación ni de IGU ni de BD. Se evaluará 100% el manejo lógico del desarrollo de la aplicación.
Extra:
En caso de que se desee agregar una “plantilla” para clientes con los datos: id, dni, nombre, apellido. ¿Cómo se implementaría? ¿De qué manera se relacionarían con cada ticket para que el mismo posea los datos del cliente que tiene asignado? Realizar la implementación.
