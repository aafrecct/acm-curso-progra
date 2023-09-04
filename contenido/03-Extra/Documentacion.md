# Documentación

Por último, vamos a hablar de la documentación del código. La documentación de código tiene dos partes: producirla y saber buscarla y leerla.

### Documentar nuestro código
Documentar nuestro código significa escribir, en lenguaje natural, explicaciones sobre lo que hacen las distintas partes de nuestro código. La documentación puede ser más o menos técnica dependiendo de quién vaya a utilizarla. Por ahora, vamos a centrarnos en documentación más técnica.

Java tiene una herramienta principal para la creación de documentación: 'javadoc'. 'javadoc' nos permite documentar nuestro código con comentarios especiales y a partir de esos comentarios generar una documentación web. Veamos un ejemplo:

```java
/**
Esta función devuelve el cuadrado del número que se le pasa.

@param num El número de que calcular el cuadrado
@return El cuadrado de num.
*/
long squared(long num) {
	return num * num;
}
```

¿Y por qué hacemos esto? En algunos casos es obvio: a veces alguien tiene que utilizar nuestro código, pero no tiene acceso al mismo. Esto ocurre, por ejemplo, con librerías empaquetadas en archivos `.jar`. Pero la documentación también es importante a nivel interno, ya que nos ayuda a localizar qué funciones o qué archivos hay que cambiar cuando se encuentran bugs en el programa o hay que añadir nueva funcionalidad.

### Leer documentación
Me ha parecido oportuno dejar esta parte para el final.

Obviamente, este curso no contiene todo lo que hay que saber sobre Java, la intención es que puedas ponerte a crear programas y con un poco de práctica tengas todo el conocimiento que necesitas para aprobar Programación 1.

Sin embargo, el mundo de la programación no acaba con Programación 1. De hecho no acaba ni con Programación 2 ni al acabar la carrera. Nos hace falta una forma de buscar y adquirir conocimiento sobre las nuevas herramientas y lenguajes que vamos a usar incluso cuando ya no tengamos profesores para ayudarnos.

Para esto existe la documentación. Hay programas y lenguajes mejor documentados que otros, pero si quieres usar una librería para un proyecto y necesitas saber que funciones tiene o como usarlas muchas veces no tienes más que buscar el nombre de la librería seguido de la palabra "docs".

Leer documentación no siempre es fácil y a veces hay que leer con calma, o aprender a leer y experimentar a la vez. La mayoría de lenguajes que hemos visto tienen una documentación oficial en internet. La documentación de C, es más compleja porque muchas librerías de C las provee el sistema operativo y su documentación se encuentra de una forma un poco más compleja.

Java tiene una documentación oficial:
https://docs.oracle.com/javase/8/
Y tiene una sección de introducción: "Write your first application" que explica las cosas de una manera muy distinta a como se explican en este curso.

Con esto, ya deberías tener las herramientas para continuar el camino por tu cuenta. Puedes guardar esta mini-wiki por si acaso necesitas repasar algún concepto a lo largo del curso, aunque muchas veces lo más divertido es redescubrir las cosas programando.

[[Ejecucion|Lección anterior]] [[Indice|Volver al índice]]