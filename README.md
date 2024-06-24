# Biblioteca de Videojuegos

Este proyecto implementa una Biblioteca de Videojuegos en Java, permitiendo agregar, listar y actualizar los datos de los videojuegos almacenados. La aplicación interactúa con el usuario a través de un menú de consola.

## Características

- **Agregar Videojuego**: Permite al usuario agregar un nuevo videojuego a la biblioteca ingresando su código, título, consola, cantidad de jugadores y categoría.
- **Listar Videojuegos**: Muestra una lista de todos los videojuegos almacenados en la biblioteca.
- **Actualizar Videojuego**: Permite al usuario actualizar el título y la cantidad de jugadores de un videojuego existente en la biblioteca.
- **Salir:**: Finaliza el programa.

### Requisitos
- Java JDK 17 o superior.
- Un IDE o editor de texto para Java (por ejemplo, IntelliJ IDEA, Eclipse, VSCode).

## Tecnologías Utilizadas

- **Java JDK 17**: Lenguaje de programación utilizado para desarrollar la aplicación.
- **IntelliJ IDEA**: Entorno de desarrollo integrado (IDE) utilizado para escribir y depurar el código.

<img src="https://www.vectorlogo.zone/logos/java/java-ar21.svg" alt="Java" width="120"/>
<img src="https://upload.vectorlogo.zone/logos/jetbrains_idea/images/d4398a36-c378-4511-a508-106ded6cd69a.svg" alt="Postman" width="80"/>

## Estructura del Proyecto

El proyecto consta de tres clases principales:

1. **VideoJuego**: Representa un videojuego con sus atributos y métodos.
2. **BibliotecaVideoJuegos**: Gestiona una colección de objetos "VideoJuego".
3. **Main**: Contiene el método principal que ejecuta el menú interactivo.

## Funcionamiento

### Clase VideoJuego

1. **Agregar VideoJuego**: Selecciona la opción 1 y sigue las instrucciones para ingresar los datos del nuevo videojuego.
2. **Listar VideoJuegos**: Selecciona la opción 2 para ver una lista de todos los videojuegos.
3. **Actualizar VideoJuego**: Selecciona la opción 3 y sigue las instrucciones para actualizar un videojuego existente.
4. **Salir**: Selecciona la opción 4 para finalizar el programa.

#### Menú de Opciones

<pre>
***** Biblioteca de VideoJuegos *****

1 - Agregar VideoJuego.

2 - Listar VideoJuegos.

3 - Actualizar VideoJuegos.

4 - Salir.

¿Qué operación desea realizar?: 
</pre>

**************************************
### Ejecución del Programa

Al ejecutar el programa, se presenta el siguiente menú al usuario:


<div style="background-color: #000000; padding: 10px; border-radius: 5px; font-family: Consolas, 'Courier New', Courier, monospace;">

<pre>
***** Biblioteca de VideoJuegos *****
1 - Agregar VideoJuego.
2 - Listar VideoJuegos.
3 - Actualizar VideoJuegos.
4 - Salir.

¿Qué operación desea realizar?: 
1
Agregue el número de código: 
123
Ingrese el nombre del título: 
Pacman
Ingrese el tipo de consola: 
PSP 2
Ingrese la cantidad de jugadores: 
1
Ingrese la categoría: 
Plataforma
***** Biblioteca de VideoJuegos *****
1 - Agregar VideoJuego.
2 - Listar VideoJuegos.
3 - Actualizar VideoJuegos.
4 - Salir.

¿Qué operación desea realizar?: 
1
Agregue el número de código: 
456
Ingrese el nombre del título: 
Mario Bros
Ingrese el tipo de consola: 
PS2
Ingrese la cantidad de jugadores: 
2
Ingrese la categoría: 
Plataforma
***** Biblioteca de VideoJuegos *****
1 - Agregar VideoJuego.
2 - Listar VideoJuegos.
3 - Actualizar VideoJuegos.
4 - Salir.

¿Qué operación desea realizar?: 
2
Lista de los VideoJuegos:
VideoJuego{codigo=123, titulo='Pacman', consola='PSP 2', cantidadJugadores=1, categoria='Plataforma'}
VideoJuego{codigo=456, titulo='Mario Bros', consola='PS2', cantidadJugadores=2, categoria='Plataforma'}
***** Biblioteca de VideoJuegos *****
1 - Agregar VideoJuego.
2 - Listar VideoJuegos.
3 - Actualizar VideoJuegos.
4 - Salir.

¿Qué operación desea realizar?: 
3
Escriba el nombre del título actual: 
Mario Bros
Escriba el nombre del nuevo título: 
Super Mario Bros 3
Escriba la nueva cantidad de jugadores: 
4
***** Biblioteca de VideoJuegos *****
1 - Agregar VideoJuego.
2 - Listar VideoJuegos.
3 - Actualizar VideoJuegos.
4 - Salir.

¿Qué operación desea realizar?: 
2
Lista de los VideoJuegos:
VideoJuego{codigo=123, titulo='Pacman', consola='PSP 2', cantidadJugadores=1, categoria='Plataforma'}
VideoJuego{codigo=456, titulo='Super Mario Bros 3', consola='PS2', cantidadJugadores=4, categoria='Plataforma'}
***** Biblioteca de VideoJuegos *****
1 - Agregar VideoJuego.
2 - Listar VideoJuegos.
3 - Actualizar VideoJuegos.
4 - Salir.

¿Qué operación desea realizar?: 
4
Fin del Programa
</pre>
</div>


**************************************

### Salida del Programa
Para salir del programa, el usuario debe seleccionar la opción 4.


**************************
### Contribuciones
Las contribuciones son bienvenidas. Por favor, abre un issue para discutir cualquier cambio importante antes de realizarlo.

************************** 

### Equipo de Trabajo
Nombre del Desarrollador: Jherson Villa

Contacto: jherson2408va@gmail.com

**************************

**¡Gracias por usar la Biblioteca de Videojuegos!. ¡Esperamos que te sea útil!**
