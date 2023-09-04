# Funciones en Java

En la lección sobre la [[JavaIntro]] del código en Java ya mencionamos cómo se declara una función:

```java
static int cuadruplicar(int n) {
	return n * 4;
}
```

Esta lección por tanto, será cortita, vamos a ver algunas peculiaridades de Java al declarar funciones e intentaré explicar por encima lo que significan algunas palabras que nos podemos encontrar cerca de la declaración de algunas funciones.

---
Al declarar una función, igual que al declarar una variable, lo primero que indicamos es el tipo de la función, es decir, el tipo de datos que devuelve. Sin embargo, al contrario que las variables, que siempre tienen un tipo de datos, algunas funciones no devuelven nada, simplemente hacen una serie de procedimientos que cambian el estado del programa y terminan. Para estos casos tenemos el pseudo-tipo `void`.

Cuando declaramos que una función devuelve `void` no hace falta que la función tenga una linea de `return`, y cuando la tiene, `return` no está acompañada de ningún valor que devolver:

```java 
static void cosumir_cpu () {
	for (int i = 0; i < 1000000; i++) {
		i ++;
		i --;
	}
}
```

---
Como ya hemos visto, a veces aparecen algunas palabras extrañas al comienzo de una declaración de una función. Por ejemplo, sabemos que tenemos que poner `static` sin saber que significa exactamente. Esto es uno de los problemas de enseñar a programar con un lenguaje orientado a objetos pero dejar la orientación a objetos para una asignatura del segundo semestre. Además, también sabemos que la función `main` tiene el modificador `public` al principio:

```java
public static void main (String[] args) {
    // Ahora entendemos lo que significa `void`.
}
```

Aunque todavía no va a ser fácil entender el significado de esta palabra, podemos intentar que no sea un misterio absoluto.

Muchas veces, los programas que hacemos son demasiado largos como para tenerlos todos en un único fichero. Lo que solemos hacer entonces es dividir nuestro código según lo que hace: las funciones que tengan que ver con usuarios y contraseñas por un lado, las que tengan que ver con tweets o posts por otro, por ejemplo.

Pero la separación no es siempre tan clara, muchas veces necesitamos usar funciones de una parte en otra. Estas palabras: `public` y su análoga `private` sirven para indicar qué funciones se van a utilizar desde fuera del archivo. De esta manera podemos limitar qué funciones son internas y cuales se pueden usar desde fuera, lo cual es muy útil cuando creamos librerías.


[[JavaBucles|Lección anterior]] | [[Indice|Volver al índice]] | [[Ejecucion|Siguiente lección]]