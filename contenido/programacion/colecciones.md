# Colecciones
> [!NOTE]
> Esta lección muestra como trabajar con colecciones de datos, es decir múltiples datos relacionados. Hay otra lección con una explicación más detallada de los tipos de datos que podemos encontrar específicamente en Java y su sintaxis [[contenido/java/tipos|aquí]].

Poder hacer operaciones con datos discretos, es útil, sin duda, pero para la inmensa mayoría de aplicaciones informáticas es casi imprescindible poder almacenar datos del mismo tipo juntos, de forma que se puedan procesar fácilmente en un bucle (por ejemplo).

La pregunta de "¿Cómo guardamos datos juntos?" no es sencilla, y será importante en las asignaturas de [[progra2|Programación 2]] y [[aed|AED]]. Existen muchas estructuras de datos y cada una tiene sus ventajas y sus desventajas, y por lo tanto se adaptan mejor o peor a determinadas situaciones.

Por ahora, solo vamos a dar una pincelada, vamos a ver qué es una colección, algunos tipos de colecciones por encima, y sobretodo veremos una de las más primitivas, que es la que vamos a usar en este curso: el "Array".

### Tipos de Colecciones
Una colección no es mas que una forma de almacenar datos relacionados juntos. Almacenar datos juntos presenta una serie de preguntas: ¿Cómo podemos encontrarlos después? ¿Cuánto tardamos en guardarlos? ¿Y en obtenerlos de nuevo? Distintos tipos de colecciones nos resuelven distintos problemas. Por tanto, existen muchos tipos de colecciones de datos: listas, tuplas, mapas, matrices, arboles... Si no sabes lo que son cada una de estas cosas, no te preocupes. Sin embargo, algunas te pueden sonar por que también son términos matemáticos. Por ahora no nos vamos a preocupar por sus diferencias, solo nos hace falta saber que hay muchas maneras distintas de guardar datos juntos.

### Arrays
Una de estas maneras sí nos resulta importante, en parte por su antigüedad, pero también por su importancia. Los "arrays" son colecciones ordenadas, de datos del mismo tipo, con un tamaño pre-definido que no puede crecer. Aunque se puede hablar de arrays de 2 y más dimensiones, por ahora nos centraremos en arrays de 1 dimensión.

Dado que puede ser un poco difícil entender la explicación de un array, vamos a ver un ejemplo:

```nim
var notas_progra: array[8, int] = [1, 5, 2, 5, 7, 3, 6, 7]

echo notas_progra[3]

var suma: int = 0
var media: float

for nota in notas_progra:
  suma = suma + nota

media = suma / 8
echo media
```
Como podemos ver, `notas_progra` es una serie ordenada de 8 números. Los números se pueden acceder por su índice, es decir, su posición. Los índices de un array suelen empezar en 0, aunque esto depende del lenguaje.

> [!NOTE]
> La razón por la que los índices suelen empezar en 0 tiene que ver con cómo se guardan en memoria. Dado que todos los elementos de un array ocupan el mismo número de bits, para acceder a un array solo tenemos que saber donde empieza (`comienzo`) y cuando ocupa un elemento (por ejemplo `16bits`). De esta manera para obtener el primer elemento, buscamos en `0 x 16 bits + comienzo`, el segundo elemento estará en `1 x 16bits + comienzo`, etc.

Además podemos 'recorrer' los elementos de un array, como podemos ver en el bucle que calcula la suma de notas. Ese bucle se puede leer: "_Por cada nota que hay en 'notas_progra'_..."

Esto es todo lo que necesitamos saber por ahora sobre los arrays: son una forma de guardar una "lista" de datos. ¿Porqué se llaman "arrays" y no "listas"? Pues porque en general "lista" es el término que utilizamos para otro tipo de colección, que por ahora no nos interesa.

[[indice|Volver al índice]] | [[razonamiento-nim|¿Por qué usar este lenguaje?]] | [[contenido/programacion/funciones|Siguiente lección]]