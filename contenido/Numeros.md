# Números y operadores
> [!NOTE]
> Esta lección muestra como trabajar con números mientras programamos, tipos y operaciones comunes. Hay otra lección con una explicación más detallada de los tipos de datos que podemos encontrar específicamente en Java y su sintaxis [[JavaTipos|aquí]].

### Nombres y datos 
Cuando trabajamos con un ordenador, todo son números, los números son números, los colores son números, las posiciones son números y las palabras son números. Pero algunos números son más números que otros números, por decirlo de alguna manera.

Para trabajar con cualquier tipo de datos mientras programamos, solemos darles nombres. A esto lo llamamos 'crear variables'. Una variable no es más que un valor que puede variar (es decir, cambiar) al que le ponemos un nombre.

```nim
var numero_naranjas = 2000
var nota_programacion_1 = 10
```

### Números enteros y decimales
De manera muy general vamos a diferenciar entre dos tipos de números distintos: los números enteros y los números de coma flotante (es decir, los números que tienen una parte decimal). Esta división es común a muchos lenguajes de programación.

La razón por la que estos dos tipos de números son distintos es porque para representarlos dentro de un computador los tenemos que pasar a binario, y la forma de representarlos en binario cambia un poco si un número es entero o si es racional. Esto tiene un impacto muy importante en la informática. Podrás aprender más sobre todo esto en la asignatura [[AlgNum|Algorítmica Numérica]].

La segunda distinción que tenemos que hacer es cuánto espacio van a ocupar nuestros números. Como los números se guardan en memoria y no tenemos memoria infinita, tenemos que tomar una decisión sobre el número máximo de cifras binarias (1s y 0s) que van a ocupar nuestros números.

Algunos lenguajes tienen nombres fáciles para los distintos tipos de números: `int8` por ejemplo significa 'integer-8' y nos indica que es un número entero que ocupa 8 bits. `float32` es un número de coma flotante que ocupa 32 bits.

```nim
var a: int8 = 128
var b: int64 = 100000000
var c: float32 = 3.14
```

Otros lenguajes, como C o Java utilizan nombres un poco más crípticos como `short`, `long`, `long long` o `double`. Al final, con el uso uno se acostumbra a los nombres, sobretodo porque la mayoría de veces solo vamos a utilizar enteros de 32 bits ('ints') y 'float's de 64 bits ('doubles').

El número de bits indica cuan grandes pueden ser los números que vamos a meter en esa variable. Prueba por ejemplo a crear una variable `int8` con el valor `129`.

```nim
var numero: int8 = 129
echo numero
```
*Puedes probar este código [aquí](https://play.nim-lang.org/#ix=4D1a)*

El resultado depende del lenguaje, pero generalmente ocurrirá una de 2 cosas:
 - El valor de `numero` será `-127` (*el valor ha dado la vuelta del máximo al mínimo*)
 - Saldrá un error (*Algo como 'IntegerOverflow'*)

> [!NOTE]
> Algunos lenguajes, como Python, nos evitan tener que pensar en el tamaño de los números que vamos a usar. El lenguaje se encarga por si mismo de ir cogiendo memoria según el tamaño de los números que usamos. Esto suele implicar un mayor uso de memoria.

> [!NOTE]
> Si hay tipos numéricos por defecto (`int32`) ¿Por qué usaríamos cualquier otro tipo si no lo necesitamos? ¿Qué más da usar 32 bits en vez de 8, si la mayoría de ordenadores modernos tienen memoria suficiente? Para aprender más sobre tipos hay una lección más adelante dedicada a ellos: [[Tipos|Tipos]] y una lección extra que también los menciona: [[Comentarios|Comunicación entre programadores]]

### Operadores
Para poder hacer cosas útiles con los números, necesitamos poder hacer operaciones. Para ello, la mayoría de lenguajes de programación tienen una serie de operadores. Un operador no es más que un carácter o una palabra que el lenguaje reconoce y que junto a sus operandos produce un resultado.

Hay operadores que son casi universales, como el símbolo `+` para la suma. Hay otros operadores que aunque son comunes, no siempre tienen el mismo símbolo asociado. Por ejemplo `%` suele ser el operador 'resto', es decir, devuelve el resto de una división. Esta operación tiene también otro nombre: módulo, y por tanto a veces nos encontramos con que su símbolo es `mod` en otros lenguajes de programación.

Prueba a ver qué resultados produce utilizar ciertos operadores:

```nim
var a: int = 32
var b: int = 8

# Prueba los siguientes operadores: + - * / mod
var resultado = a * b
echo resultado
```
*Puedes probar este código [aquí](https://play.nim-lang.org/#ix=4D3f)*

> [!NOTE]
> En el código anterior, puedes ver una línea que empieza por `#`. Esta línea es lo que llamamos un 'comentario'. El lenguaje la ignora por completo y por tanto solo sirve para dejar comentarios a otras personas que lean el código. Esto es útil para la lección: [[Comentarios|Comunicación entre programadores]].

Veremos más operadores en las siguientes lecciones para poder trabajar con otros tipos de datos. Por ahora, sabiendo como utilizar números, vamos a pasar a utilizar [[Strings|Letras]].

[[razonamiento-nim|¿Por qué usar este lenguaje?]]
[[Compilar|Lección anterior]] | [[Indice|Volver al índice]] | [[Strings|Siguiente lección]]
