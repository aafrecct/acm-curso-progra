# Tipos de datos
> [!NOTE]
> Esta lección muestra los distintos tipos de datos básicos que podemos encontrar en múltiples lenguajes de programación. Hay otra lección con una explicación más detallada de los tipos de datos que podemos encontrar específicamente en Java y su sintaxis [[contenido/java/tipos|aquí]].

Como ya hemos visto, toda la información que maneja un ordenador son números; sin embargo, para que programar nos resulte de utilidad, muchas veces necesitamos utilizar otros tipos de datos: valores de verdadero o falso, frases y palabras, o estructuras más complejas.

Para poder trabajar con estos datos necesitamos codificarlos, es decir, establecer un código, en binario, para representar, por ejemplo, una letra. Todo esto ya lo vimos en la lección sobre [[strings]]. Sin embargo, para saber como decodificarlos, el lenguaje de programación necesita saber el tipo de datos en cuestión. 

Por esta razón, los lenguajes tienen palabras reservadas para identificar los distintos tipos de datos. Estas palabras cambian un poco entre lenguajes, pero en general se parecen bastante entre sí. Son justo las que hemos estado utilizando al declarar variables: `int`, `uint`, `float`, `char`, `string`, `bool`...

Algunos lenguajes, como C o Java, utilizan los nombres de los tipos para declarar variables. De esta manera, todos los datos necesariamente tienen asociado un tipo de datos.

```c
int naranjas = 2
char categoria = 'c'
```

Otros lenguajes, como Nim o Rust, te permiten decidir si quieres dejar claro el tipo de una variable o si dejar que el compilador lo infiera a partir del valor. Esto significa que cuando no le ponemos valor directamente a una variable, debemos especificar el tipo.

```nim
# Las dos opciones son válidas
var naranjas: int = 2
var limones = 5
```
Otra opción es nunca pedir el tipo de una variable, como en Python o en JavaScript. Y normalmente, en estos lenguajes una misma variable puede cambiar de tipo, lo llamamos 'tipado dinámico'. Esto tiene varios problemas, hace que el código sea más difícil de verificar, y puede hacer el código menos legible. Además, contribuye a la supuesta 'lentitud' o 'ineficiencia' de estos lenguajes, ya que hace que sean más difíciles de optimizar.

```python
# Las 3 asignaciones son válidas
naranjas = 1
limones = 2
naranjas = "naranjas"
```
Por último, algunos lenguajes fuerzan a que todas las operaciones se hagan entre tipos específicos, y que ninguna función se llame con tipos incorrectos. En estos lenguajes muchas veces hay que pelearse con el compilador hasta que no cometemos ningún error de tipado. Nim es así.
Otros lenguajes, como JavaScript, permiten hacer  casi cualquier cosa sin dar un error, esta es la diferencia entre un tipado fuerte y un tipado débil.

### Tipos comunes
A pesar de que cada lenguaje funciona de una manera distinta, algunas cosas son comunes en muchos lenguajes, suficientemente comunes como para que merezca la pena dedicar una pequeña sección a un pequeño conjunto de tipos de datos que se encuentran en muchos lenguajes de programación. Vamos a usar los nombres que les da Nim, ya que son relativamente fáciles de entender y la mayoría ya los hemos visto.

**Tipos numéricos enteros:** 
	`int8`, `int16`, `int32`, `int64`, `int`

**Tipos numéricos enteros no negativos (unsigned):** 
	`uint8`, `uint16`, `uint32`, `uint64`, `uint`

**Tipos numéricos con coma flotante:**
	`float32`, `float64` (a veces llamado `double`)

**Tipo booleano:**
	`bool`

**Tipo carácter:**
	`char`

**Tipo string:**
	`string` (a veces simplemente son un array de `char`)

**Tipo array (de enteros):**
	`array[int]`

Además, muchos lenguajes tienen la capacidad de crear tipos complejos. Aunque esto se sale del temario de Programación 1, así que solo vamos a ver un ejemplo:
```nim
type Alumno = object 
	nombre: string
	edad: uint8
	curso: uint8
	num_matricula: string
```

[[contenido/programacion/funciones|Lección anterior]] | [[indice|Volver al índice]] | [[null|Siguiente lección]]