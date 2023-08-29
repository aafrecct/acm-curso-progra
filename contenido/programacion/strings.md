# Caracteres y "strings"
> [!NOTE]
> Esta lección muestra como trabajar con letras y secuencias de letras, porqué son distintas de los números y se tratan distinto. Hay otra lección con una explicación más detallada de los tipos de datos que podemos encontrar específicamente en Java y su sintaxis [[contenido/java/tipos|aquí]].

La razón principal por la que diferenciamos entre números y letras es porque las operaciones que hacemos con ellas son radicalmente distintas, y también lo son a nivel computacional. Si bien la mayoría de veces que trabajamos con números, lo que queremos hacer son cálculos matemáticos: contar la cantidad de veces que hacemos una cosa, calcular precios, etc. Las operaciones que hacemos con caracteres son significativamente distintas: Guardamos mensajes, los utilizamos para comunicarnos, etc.

Esto significa que cuando tenemos una frase en un programa, normalmente no vamos a sumarle 1 a la frase, que sería una operación aritmética muy fácil de hacer en binario, sino que vamos a añadirle más texto o sustituir letras, u operaciones similares.

Es por esto que la mayoría de lenguajes de programación hacen una distinción entre sus tipos numéricos y algo que en programación llamamos "strings" o "cadenas". 

Una string no es más que una secuencia de caracteres almacenada en memoria. Cada carácter es en realidad un número en binario. A esta transformación de un carácter a un número la llamamos codificación o en inglés *"encoding"* y hay varias codificaciones que son comunes a día de hoy. Las más ubicuas son ASCII y Unicode (a veces referido como `UTF-8` o `UTF-16`).

Estas cadenas suelen ocupar significativamente más memoria que los números, ya que están compuestas de muchos números puestos de manera contigua en memoria.

```nim
var saludo: string = "hola mundo"
```

| Posición en mem. | Datos en mem.  | Letra representada |
|:----------------:|:---------------|:------------------:|
| 00               | `01101000` (104)| h                  |
| 01               | `01101111` (111)| o                  |
| 02               | `01101100` (108)| l                  |
| 03               | `01100001` (97) | a                  |
| 04               | `00100000` (32) | \<espacio\>        |
| 05               | `01101101` (109)| m                  |
| 06               | `01110101` (117)| u                  |
| 07               | `01101110` (110)| n                  |
| 08               | `01100100` (100)| d                  |
| 09               | `01101111` (111)| o                  |
*\*La primera columna representa en realidad una posición relativa, no absoluta.*

Estos dos hechos: las operaciones que hacemos con el lenguaje y el espacio que ocupa son las razones por las que muchos lenguajes tratan las strings de una forma distinta al resto de datos.

### Diversidad de Strings
> [!WARNING]
> Esta sección da ejemplos de cómo funcionan las strings en diversos lenguajes de programación. Si esta es tu primera vez aprendiendo a programar, puede resultar un poco abrumador, pero no te preocupes la intención no es que aprendas a utilizar estos lenguajes sino llegar a un entendimiento sobre cómo funcionan las strings en general. NO TE PREOCUPES si acabas un poco confuso o confusa.

En C una string no es más que un puntero, es decir, una referencia a un sitio en la memoria. El lenguaje nos permite dejar claro que esa referencia está apuntando a un carácter `char *` pero a priori no sabemos nada sobre la string, ni siquiera su longitud.

```c
// c
char * saludo = "hola mundo";
```

Otros lenguajes de programación más modernos almacenan más información. Por ejemplo, Java tiene un tipo String que además del texto almacena el número de caracteres que contiene.

```java
// java
String saludo = "Hola mundo";
```

Por último, lenguajes como Rust tienen 2 tipos de string distintos `String` y `str` con usos muy distintos dependiendo de lo que se quiera hacer con ellos.

```rust
// rust
let saludo: &str = "hola mundo";
let mut saludo_2: String = String::from("hola a todos");
```

### Operaciones con Strings
Al igual que con los números las cadenas de caracteres no son muy útiles si lo único que podemos hacer es escribirlas y guardarlas, por lo tanto la mayoría de lenguajes de programación incluyen algunos operadores que se pueden aplicar sobre strings.

```nim
var a: string = "Las cadenas son secuencias de "
var b: string = "caracteres"
var c: char   = 'a'

echo a & b
echo b in a
```

Aquí mostramos dos operaciones que podemos hacer con strings: la concatenación y la comprobación que contienen un carácter, pero la cantidad de operaciones que se suelen hacer con strings es inmensa. Muchas de estas operaciones, sin embargo, no tienen un operador definido, sino que se hacen a través de [[contenido/programacion/funciones|funciones]], que se darán en una lección posterior.

Por ahora tenemos una idea de lo que significa trabajar con caracteres, y sus complicaciones pero por ahora solo podemos usar números y caracteres para hacer operaciones predefinidas, eso no es programar.
Nos faltan todavía algunas partes esenciales de la programación como lo son las [[contenido/programacion/control_flujo|condiciones]]. Pero primero hay una pequeña lección sobre como [[io|mostrar nuestros resultados en pantalla]].

[[razonamiento-nim|¿Por qué usar este lenguaje?]] 
[[numeros|Lección anterior]] | [[indice|Volver al índice]] | [[io|Siguiente lección]]