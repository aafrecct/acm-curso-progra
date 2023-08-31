# ¿Qué es compilar?
> [!NOTE]
> El contenido de esta parte tiene que ver con las asignaturas [[PDL| PDL y TDL]] que son asignaturas de tercero. Sin embargo solo cogemos las partes básicas y más relevantes para tener una idea de lo que significa "compilar".

Con el tiempo, los computadores se han ido volviendo más potentes, y la necesidad de programar en ensamblador para tener control absoluto sobre unos recursos muy limitados ha ido desapareciendo. En ese tiempo se han desarrollado lenguajes que llamamos "de alto nivel" que abstraen muchos conceptos de la programación en ensamblador.

En ensamblador guardamos datos en posiciones de memoria para utilizarlos, pero esto hace que equivocarse sea muy fácil. En la mayoría de lenguajes de programación de alto nivel tenemos el concepto de "variables": Nombres que le ponemos a datos que vamos a utilizar.

```nim
var dato1 = 123115134
var dato2 = 3.14
```

En ensamblador definimos subrutinas: trozos de código a los que podemos saltar para hacer determinados cálculos. En muchos lenguajes de alto nivel tenemos funciones: trozos de código que producen un resultado con unos parámetros.

```nim
var radio = 2
var area = calc_area(radio)
```

No te preocupes, no hace falta que entiendas el código anterior para terminar esta lección, las funciones tienen su propia lección un poco más adelante: [[Funciones|Funciones]].

Aún así, los computadores siguen entendiendo solo binario, así que necesitamos una forma de transformar nuestro código de alto nivel en algo que la máquina pueda entender. Este proceso se llama "compilar".
Muchas veces "compilar" no es más que darle a un botón en el editor que estemos usando para escribir nuestro programa, sin embargo, un compilador es un programa más como cualquier otro.

Un compilador es un programa que es capaz de leer otros programas y trasformarlos a un formato que la máquina pueda leer. De hecho, en lenguajes como Java muchas veces existe la convención de guardar los archivos de Java en una carpeta llamada `src` (source o fuente) y los archivos compilados en otra carpeta llamada `bin` (binaries o binarios).

Cuando queremos aprender un nuevo lenguaje de programación y utilizarlo en nuestro ordenador, tenemos que descargarnos "el lenguaje". Lo que nos estamos descargando realmente es un compilador que transforma ese lenguaje a un código binario que nuestra máquina ya entendía antes de instalar el lenguaje.

Para la siguiente parte del curso sin embargo, no hace falta compilar nada, por lo menos manualmente, todos los ejemplos pueden ejecutarse desde la [siguiente página](https://play.nim-lang.org). Pero atención,  eso no significa que el código no se compile, simplemente se esta compilando en el servidor que tiene la página web y mostrando los resultados.

[[RazonamientoIntro|¿Por qué es esto importante?]]
[[Ensamblador|Lección anterior]] | [[Indice|Volver al índice]] | [[Numeros|Siguiente parte]]