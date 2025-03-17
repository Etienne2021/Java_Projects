
# Java
java-projects






# Sistema de Reserva de Asientos 🎟️

Este proyecto implementa un **sistema de reserva de asientos** para un anfiteatro utilizando manejo de datos de forma lógica, sin bases de datos ni interfaces gráficas.

## 📌 1era Parte Carpeta ReservaAsientos

Se debe desarrollar un sistema que maneje la reserva de asientos para un teatro con **10 filas de 10 asientos cada una**. El sistema debe cumplir con los siguientes requisitos:

1. **Cargar el “mapa” de las filas y asientos**  
   - Representar los asientos ocupados con una **"X"** y los libres con una **"L"**.  
   - Al iniciar el programa, todos los asientos deben estar libres.

2. **Manejar la reserva de asientos**  
   - Un asiento **solo puede ser reservado si está en estado "L"**.  
   - Si el asiento ya está ocupado ("X"), el usuario debe elegir otro.  
   - Al reservar, el asiento cambia automáticamente de "L" a "X".

3. **Finalización del programa**  
   - El usuario debe ingresar un valor específico para finalizar la ejecución.  
   - No hay un número fijo de ejecuciones.

4. **Restricciones**  
   - Solo existen **10 filas y 10 asientos**.  
   - No se pueden reservar asientos fuera de estos límites.  
   - **No se permite la sobreventa**.

### ⚠️ Consideraciones:
- **No se debe implementar ni interfaz gráfica (IGU) ni base de datos (BD)**.
- Se evaluará **100% el manejo lógico** del desarrollo.

### 🚀 Extra:
- Si un cliente desea visualizar los asientos libres, se debe mostrar el estado de los asientos de **forma gráfica en consola**.
- **No utilizar IGU** para este caso.

---

## 📌 2da Parte – POO Carpeta AnfiteatroSistemaTicketsPOO

Se amplía el sistema para incluir la generación de **tickets de reserva**. Cada persona obtendrá un ticket al reservar su asiento. Se deben cumplir los siguientes requisitos:

1. **Crear una “plantilla” para tickets**  
   - Cada ticket debe contener:  
     **Número, fila, asiento, fecha de compra, fecha de validez y precio**.

2. **Usar una “base de datos lógica”**  
   - Implementar una estructura de datos que almacene un número indeterminado de tickets.  
   - Cargar varios tickets en esta estructura.

3. **Calcular el total de ventas**  
   - Implementar un método que recorra la estructura de tickets y sume los precios.  
   - Mostrar el total por pantalla.  
   - **No es necesario utilizar IGU**.

4. **Filtrar tickets por fila**  
   - Solicitar al usuario un número de fila.  
   - Mostrar los tickets pertenecientes a esa fila.  
   - **No es necesario utilizar IGU**.

### ⚠️ Consideraciones:
- **No se debe implementar ni IGU ni base de datos**.
- Se evaluará **100% el manejo lógico del desarrollo**.

### 🚀 Extra:
- Se puede agregar una **plantilla para clientes** con los datos:  
  **ID, DNI, nombre y apellido**.  
- Se debe definir cómo relacionar cada ticket con su respectivo cliente.  
- Implementar la solución.

---
