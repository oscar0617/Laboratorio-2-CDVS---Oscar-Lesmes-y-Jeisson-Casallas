# *Laboratorio #2 Ciclos de Vida de Software*
## EJERCICIO DE LAS FIGURAS
**CREAR UN PROYECTO CON MAVEN**  
1. Buscar cómo se crea un proyecto maven con ayuda de los arquetipos (archetypes).  
        $`mvn archetype:generate -DgroupId=com.ejemplo -DartifactId=mi-proyecto -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

    `
2. Busque cómo ejecutar desde línea de comandos el objetivo "generate" del plugin "archetype", con los siguientes parámetros:
    ProyectoId: `org.apache.maven.archetypes:maven-archetype-quickstart:1.0`

    Id del Grupo: `edu.eci.cvds`

    Id del Artefacto: `Patterns`

    Paquete: `edu.eci.cvds.patterns.archetype`
    
    $ `mvn archetype:generate -DgroupId=edu.eci.cvds -DartifactId=Patterns  -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.0 -DinteractiveMode=false -Dpackage=edu.eci.cvds.patterns.archetype
     `

## COMPILAR Y EJECUTAR     
1. Busque cuál es el objetivo del parámetro "package" y qué otros parámetros se podrían enviar al comando mvn.

Se encarga de empaquetar el proyecto siguiendo el archivo `pom.xml`, generalmente este se empaqueta en un formato `.jar`.

2. Busque cómo ejecutar desde línea de comandos, un proyecto maven y verifique la salida cuando se ejecuta con la clase App.java como parámetro en "mainClass".

Primero debo modificar el archivo `pom.xml` para especificarle la ruta exacta de la clase principal, en este caso, la clase App.java.
```
<configuration>
    <mainClass>edu.eci.cvds.patterns.archetype.App</mainClass>
</configuration>
```
Despues de realizar este ajuste en el archivo  `pom.xml`, podemos realizar la ejecución corriendo el comando `mvn exec:java`. No hay que olvidar de compilar el proyecto con el comando `mvn clean install`.

3. Realice el cambio en la clase App.java para crear un saludo personalizado, basado en los parámetros de entrada a la aplicación.

```java
public class App 
{
    public static void main( String[] args )
    {
        if (args.length > 0) {
            String nombre = args[0];
            System.out.println("Hola, " + nombre + "!");
        } else {
            System.out.println("Hello world!");
        }
    }
}
```
4. Utilizar la primera posición del parámetro que llega al método "main" para realizar elsaludo personalizado, en caso que no sea posible, se debe mantener el saludo como se encuentra actualmente:

`mvn exec:java -Dexec.args="Oscar"
`

5. Buscar cómo enviar parámetros al plugin "exec"

`mvn exec:java -Dexec.args="parametro"`

6. Ejecutar nuevamente la clase desde línea de comandos y verificar la salida: Hello World!

Entrada: `mvn exec:java`  
Salida: `Hello world!`

7. Ejecutar la clase desde línea de comandos enviando su nombre como parámetro y verificar la salida. Ej: Hello Pepito!

Entrada: `mvn exec:java -Dexec.args="Oscarin`  
Salida: `Hola, Oscarin!`

8. Ejecutar la clase con su nombre y apellido como parámetro. ¿Qué sucedió?

Entrada: `mvn exec:java -Dexec.args="Oscarin Lesmes`  
Salida: `Hola, Oscarin!`

9. Verifique cómo enviar los parámetros de forma "compuesta" para que el saludo se realice con nombre y apellido.

Se debe realizar un ajuste en el codigo:

```java
public class App 
{
    public static void main( String[] args )
    {
        if (args.length >= 2) {
            String nombre = args[0];
            String apellido = args[1];
            System.out.println("Hola, " + nombre + " " + apellido + "!");
        } else {
            System.out.println("Hello world!");
        }
    }
}
```

10. Ejecutar nuevamente y verificar la salida en consola. Ej: Hello Pepito Perez!

Entrada: `mvn exec:java -Dexec.args="Oscarin Lesmes"`  
Salida: `Hola, Oscarin Lesmes!`


## HACER EL ESQUELETO DE LA APLICACIÓN
pendiente

**Gracias**
