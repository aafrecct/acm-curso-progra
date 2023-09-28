# Sintaxis de Java

Java es un lenguaje orientado a objetos. Esto quiere decir que la "cosa" principal que maneja el lenguaje son objetos. Un objeto es una instancia de una clase. Una clase es como un tipo de datos, pero un poco más complejo. La diferencia principal es que además de guardar datos, una clase define las operaciones que se pueden hacer con ellos. Es decir, es una mezcla entre datos y funciones que afectan a esos datos.

Esto será importante en [[PrograII|Programación 2]] pero por ahora solo nos interesa saber que todos nuestros archivos empezarán con una línea de código del tipo:

```java
public class Ejercicio1 {
    // Código...
}
```

Dentro de las clases podemos definir funciones. Una función en concreto es especial, la función main, que será la función que se ejecute "automáticamente" cuando ejecutamos un programa:

```java
public static void main (String[] args) {
    //Código
}
```

Entenderemos un poco mejor por qué esta función se escribe así una de las últimas lecciones del curso [[Ejecucion|"Ejecutar programas"]]. Por ahora vamos a entender como declarar funciones en Java.

Una función en Java se declara con un tipo (que será el tipo de datos que devuelva la función), un nombre, y una lista de argumentos. La sintaxis exacta es `tipo nombre (tipo arg1, tipo arg2)`. Por ejemplo:

> [!DANGER]
> A lo largo de todo el curso de Programación 1 todas las funciones que vamos a escribir van a tener la palabra `static` delante. Esta palabra significa que la función pertenece a la clase. La mayoría de funciones que implementemos a partir de Programación 2 **NO** tendrán esta palabra y se explicará por qué, por ahora, los ejemplos van a incluirla por comodidad si se quiere probar el código, pero no es importante entender qué significa.

```java
static int cuadrado (int numero) {}
```

Después, el cuerpo de la función, es decir el código, va entre llaves `{}`. En Java, no es necesario 'indentar' el código, o separar entre líneas. Cada bloque de código esta entre llaves para separarlo del resto, y cada instrucción acaba con un punto y coma `;`.

Esto no quiere decir que no debamos 'indentar' nuestro código y separar las líneas ya que si no lo hacemos, nuestro código sera prácticamente imposible de leer.

Para declarar una variable, no tenemos que usar `var`, solo el tipo de la variable y su nombre:

```java
double tau = 6.28
```

Por último, para imprimir un resultado, podemos utilizar una de dos funciones:
- `System.out.println()`
- `System.out.format()`

La primera es más general, y la segunda nos permite imprimir con facilidad mensajes un poco más complejos usando códigos que se sustituyen por variables. Veamos como se utilizan en un ejemplo:

```java
int num_alumnos = 50

System.out.println(num_alumnos)
System.out.format("Hay %d alumnos en clase.", num_alumnos)
```

Sabiendo esto, podemos pasar a ver [[JavaTipos|qué tipos tiene Java.]]

[[Paradigmas|Lección anterior]] | [[Indice|Volver al índice]] | [[JavaTipos|Siguiente lección]]