# Comunicación entre programadores

Como ya hemos discutido, los programas no son estáticos. Además, generalmente se desarrollan por un equipo de personas, no individualmente. Por lo tanto, es importante que cualquier persona pueda leer nuestro código y entender las decisiones que se tomaron con relativa facilidad.

Puede parecer que esto solo se aplica a proyectos en equipo, pero lo que vamos a comentar en esta lección también es importante para proyectos personales que pueden llevar un tiempo. No siempre es fácil acordarse de lo que hace nuestro código, cómo lo hace y sobre todo por qué.

Existen varias herramientas para conseguir comunicar el propósito de nuestro código: un código legible es más fácil de descifrar, un buen sistema de tipos hace más claro el propósito de nuestras funciones y nuestras variables, y en general deberíamos intentar [[documentacion|documentar]] nuestro código.

En esta lección nos vamos a centrar en los nombres de nuestras variables y en la utilidad de los comentarios.

### Nombres
Cuando programamos, tenemos que dar nombres a los datos y funciones que vamos a utilizar. Generalmente, en todos los lenguajes estos nombres son una combinación de letras minúsculas y mayúsculas, a veces con números o símbolos como barras bajas. 

Estos nombres no son triviales, ya que sin ellos leer código se volvería muy complicado. Sin embargo, por algunas limitaciones técnicas, antiguamente, muchas variables se acortaban para crear nombres pequeños, que a veces no son nada fáciles de leer. Esto sucede mucho en librerías estándar de C. Intenta adivinar qué significan los siguientes nombres:

`errno`, `strcpy`, `strstr`, `clrmemf`, `htonl`

Respectivamente significan: "Error Number", "String Copy", "(find) String in String", "Clear Memory Files", "Host to Network Long".

Hoy en día no existen estas limitaciones y, por tanto, podemos utilizar nombres más completos. ¿Cuál de las siguientes opciones indica mejor lo que hace el código?

```nim
proc dts(n: int): int = 
	return n * 86400
```
```nim
proc conversion_tiempo(tiempo_org: int): int = 
	return tiempo_org * 24 * 60 * 60
```
```nim
proc dias_a_segundos(dias: int): int =
	return tiempo_org * 24 * 60 * 60
```

> [!Excepciones]
> Hay algunas variables que pueden tener un nombre corto y aún así ser fáciles de entender, pero son pocas. Cuando estamos en un bucle, por ejemplo, solemos usar la letra `i` para guardar el índice del bucle actual.

### Comentarios
Los comentarios son trozos de nuestro código que no son compilados y no se ejecutan. Casi todos los lenguajes tienen una forma de introducir comentarios en el código. Normalmente es un carácter o un conjunto de caracteres. 

```nim
# Esto es un comentario en Nim
var patata: int
```
```java
/* Esto es un comentario
de varias líneas en Java */
int patata;
```

Los comentarios se suelen utilizar para añadir información útil que no sea evidente en el código. Exactamente qué cuenta como un buen comentario es una pregunta más complicada, ya que no hay un consenso general. Sin embargo, he aquí alguno de los usos más útiles:
- ¿Una variable tiene una función que no es fácil de asumir dado su nombre? Un comentario puede ayudar a clarificar su uso.
- ¿Hay alguna función que esté haciendo algo de una manera distinta a la solución más obvia, quizás por motivos de eficiencia? Una explicación de por qué puede ayudar a entender el código.
- ¿Una función hace varias cosas en distintas partes, pero no tiene sentido fraccionarla en distintas funciones? Un comentario al comienzo de cada parte puede aclarar el funcionamiento de la función.
- ¿Has tomado alguna decisión extraña con respecto al diseño o a la implementación de una parte de tu código? Un comentario explicando el por qué de la decisión ayudará a otros programadores a entender el código con facilidad.

Muchas veces nos obcecamos en que un código bueno es un código corto y eficiente, y añadir comentarios solo añade líneas innecesarias al archivo. Sin embargo, son una parte vital de como leemos y entendemos código que no es nuestro, o incluso código nuestro que ya no recordamos.

Si fuera explícitamente necesario tener una versión del código que ocupase el menor tamaño posible, existen herramientas para hacer justo eso, conocidas como ["minifiers"](https://en.wikipedia.org/wiki/Minification_(programming)). Generalmente, estos programas se utilizan cuando hay que distribuir el código a los usuarios a través de internet e interesa que la transmisión sea rápida. V.g: JavaScript para páginas web.

[[buenas_practicas|Lección anterior]] | [[indice|Volver al índice]] | [[paradigmas|Siguiente parte]]