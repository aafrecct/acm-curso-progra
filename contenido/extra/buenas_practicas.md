# Buenas prácticas

¿Qué significa saber programar? ¿Y que significa programar bien?
Podríamos decir que sabemos programar si dados un problema, somos capaces de crear un programa que lo resuelva. Pero claro, no todos los problemas son iguales, y no vamos a ser capaces de resolver cualquier problema que se nos ponga delante.

De manera similar, podemos tener una intuición de lo que significa programar bien: Que tus programas sean rápidos o que ocupen poco. Muchas veces hay quienes presumen de haber programado una solución a un problema en pocas líneas de código. Esta lección será un poco más larga, porque mi misión es intentar convencerte de que lo importante cuando programamos muchas veces son cosas distintas de lo que pensamos tradicionalmente. Pero mi impresión es que esta lección puede llegar a ser de las más importantes, incluso para aprobar.

### Estados del Software

Puede parecer, desde fuera, que la programación tiene como fin un producto estático. Es decir, tenemos una fase en la que creamos nuestro programa y una vez terminado, funciona y podemos hacer lo que queramos con el. En la inmensa mayoría de casos, sin embargo, esto no es lo que ocurre.

Con muy pocas excepciones, el software existe en 3 estados: o se encuentra en desarrollo, o esta mantenido activamente o esta abandonado. Vamos a ver un poco que significan estas cosas.

Un software en desarrollo, es un software que todavía no ha llegado al estado que sus creadores han planeado para su publicación. Hoy en día, con betas abiertas, nightly builds, etc. Muchas veces podemos usar software que esta en desarrollo, por lo tanto sabemos que esto no significa que no sea usable, o estable, aunque muchas veces no lo sea.

Pero cuando por fin llegamos a la versión 1.0.0, el desarrollo no ha terminado. La mayoría de proyectos software tienen bugs, errores, no funcionan en todas las arquitecturas, o sus usuarios requieren de nuevas funcionalidades. Por lo tanto los desarrolladores tienen que mantener el código: arreglar errores, añadir cosas, desde pequeños cambios a grandes actualizaciones.

¿Y que ocurre cuando esto deja de ocurrir? Pues recientemente tenemos un ejemplo parcial. Cuando Twitter (ahora X) despidió a gran parte de su equipo, poco a poco partes de la página empezaron a fallar con más frecuencia, y algunos arreglos venían con otros problemas: mensajes de debug cuando abrías la consola, y cosas similares. Ahora bien, Twitter es una compañía muy grande, con un equipo bastante capaz y con mucha inercia por detrás, por lo tanto parece que están aguantando. ¿Pero qué pasa cuando nadie arregla los fallos de un software? Pues que gradualmente la gente lo abandona. Así nace lo que llamamos 'abandonware'.

Este software no es que haya dejado de funcionar, pero muchas veces el resto de la tecnología evoluciona y por tanto, lo juegos se vuelven incompatibles con el hardware, las apps fueron creadas para otro sistema operativo, y por tanto deja de ser útil y los usuarios buscan alternativas.

### ¿Qué es importante?

Como hemos visto, el software está en constante desarrollo, y generalmente no por una única persona. Nuestra capacidad de arreglar el código, solucionar problemas y añadir nueva funcionalidad es vital para que el software que desarrollamos siga vivo. Esto nos dicta en qué deberíamos fijarnos cuando escribimos código:

- Legibilidad
- Modularidad
- Organización
- Comunicación

Otros aspectos, como la velocidad del código o el número de líneas, pueden ser importantes dependiendo del proyecto, pero no son aspectos tan universales del desarrollo de software, y de hecho a veces se pueden presentar en oposición a estas metas, en cuyo caso tendremos que tomar una decisión.

Hablaremos de la comunicación en la próxima lección, y la organización es una cosa que depende mucho del proyecto, del lenguaje y del equipo, y se sale del ámbito de este curso. Empezaremos con una pincelada sobre modularidad y dejaremos la legibilidad para el final.

### Modularidad
Cuando escribimos software, muchas veces, el producto final es muy complejo, y está compuesto de muchas partes. Por ejemplo una simple calculadora tiene una parte dedicada a leer input del usuario y otra a parte que calcula los resultados de las operaciones.

Para hacer posible que nuestro software crezca de manera cómoda, es importante saber dividir la funcionalidad y escribir código que sea re-utilizable. Esto se hace de muchas maneras, pero por ahora vamos a ver la más util para sacar buena nota en Programación 1: Dividir nuestro código en funciones.

Imaginemos que nos mandan hacer un pequeño juego de ahorcado. Podríamos escribirlo todo de seguido en una función. Si quisiéramos cambiar algo, tendríamos que buscar donde esta el trozo de código que queremos cambiar, cambiarlo, y asegurarnos de que sigue funcionando con el resto del código.

En vez de esto, podemos dividir nuestro código en funciones: una función para leer el input del usuario, otra para imprimir la palabra, otra para buscar una letra en la palabra y una para dibujar un muñeco si hiciera falta (por ejemplo). En este caso, si falla algo o queremos cambiar algo, buscar el código adecuado es mucho más simple, cada función hace una única cosa. Además al arreglarlo, si nos aseguramos que la función sigue devolviendo el mismo formato de datos, tenemos cierta garantía de que el programa seguirá funcionando.

Por si esto no fuera suficiente, cuando trabajamos en equipo, las funciones nos permiten dar nombres a distintos trozos de código según lo que hacen. Esto hace que sea mucho más fácil entender el código de un compañero, o que un compañero entienda el tuyo.

### Legibilidad

Hoy en día tenemos muchas herramientas que nos ayudan o directamente se encargan de forzar un formato correcto en nuestro código. Algunos alumnos de primero se empeñan en que usar espacios es para perdedores y por tanto terminan con líneas de código casi absolutamente ilegibles. 

Afortunadamente, en el mundo real no tendríamos porque contar con la buena fe de nuestros compañeros ya que existen guías de estilo para casi todos los lenguajes modernos y programas capaces de re-formatear archivos de código para que sigan estas guías.

Sin embargo, no solo no son estas guías utilizadas universalmente, sino que en algunas asignaturas, ni se enseñan, ni se utilizan, ni se recomiendan, ni se mencionan. En parte porque la evaluación es a papel, y por tanto, parece ser, da igual.

Si puedes, tienes tiempo y ganas, puede estar bien mirar por encima una guía de estilo para Java. Recuerda que sobretodo en primero lo importante no es ser perfecto sino ser consistente.
Si no puedes, como mínimo, quédate con esto, por favor: Usa espacios, no hacen daño y hacen el código mucho mas legible. Deja espacio entre líneas para separar partes del código y entre operadores para que las operaciones sean legibles.

Pero hay muchos aspectos que ayudan a la legibilidad: un buen sistema de tipos, por ejemplo. Si vas a trabajar en código que no es tuyo, no es lo mismo encontrarte con estas 3 funciones, respectivamente en Python, Java y Nim:

```python
def calcular_descuento(edad):
	...
```
```java
public double calcular_descuento (int edad) {
}
```
```nim
type alias Edad = range[0'u8..150'u8]
type alias Porcentaje = range[0.0..100.0]

proc calcular_descuento(edad: Edad): Porcentaje =
	discard
```

Aunque a primera vista, la primera puede parecer la más sencilla, un programador no sabría qué tipo de datos va a recibir la función, aunque pueda asumirlo, y no tiene ni idea del tipo de datos que devuelve. Como podemos ver en la versión de java tenemos mas idea, pero la versión de Nim nos da casi toda la información que necesitamos para saber lo que hace la función.

Esto no es un problema de los lenguajes, cosas similares al último ejemplo se pueden hacer en Python y en Java, pero una vez más se salen un poco del ámbito del curso. Lo importante es que sepamos usar nuestros tipos de datos y la información que transmiten a quien lee el código.

[[errores|Lección anterior]] | [[indice|Volver al índice]] | [[comentarios|Siguiente parte]]