# Bucles
> [!NOTE]
> Esta lección muestra lo que es un bucle en general, los tipos de bucles que nos podemos encontrar y sus usos. Hay otra lección con una explicación más detallada de los bucles que podemos encontrar específicamente en Java y su sintaxis [[contenido/java/bucles|aquí]].

Poder delegar nuestros cálculos a un ordenador es cómodo y probablemente más rápido que hacerlos a mano, pero si tenemos que especificar una a una todas las operaciones que queremos hacer, algunas tareas van a terminar siendo un poco tediosas. 

Pongamos, por ejemplo que queremos calcular los primeros 50 términos de la sucesión de Fibonacci. Con el conocimiento que tenemos, podríamos crear un código como el siguiente:

```nim
var i: int = 0
var j: int = 1

echo i
echo j

i = i + j
echo i
j = j + i
echo j
# ... (se repetirían las últimas 4 lineas 24 veces)
```

Y efectivamente, esto funcionaría, pero escribir el código sería innecesariamente complicado. Además, si luego quisiéramos 5000 términos en vez de 50, tendríamos que volver a copiar y pegar 100 veces.

Es por esto que los lenguajes de programación 'imperativos' nos ofrecen una utilidad: los bucles. Los bucles nos permiten ejecutar un trozo de código repetidamente. Hay bastantes tipos de bucles, pero a grandes rasgos, destacan dos: Los bucles `for` y los bucles `while`.

> [!NOTE]
> La diferencia entre los bucles 'FOR' y los bucles 'WHILE' no es trivial y tiene un papel central en la teoría de la computabilidad, es decir, la pregunta de '¿Qué se puede calcular?'. Si te interesan estos temas la optativa [[computabilidad|Computabilidad]] puede que sea para tí.

### Bucles FOR
Los bucles FOR tienen una misión clara y una limitación obvia. Son la herramienta que utilizamos cuando sabemos el número de veces que vamos a querer ejecutar un código. 

Pongamos el ejemplo anterior, tenemos claro que queremos ejecutar el código 50 veces. Usando un bucle FOR podemos expresar claramente esa intención:

```nim
var i = 0
var j = 1
var k = 0

echo i
echo j

for c in 3..50:
	k = i + j
	i = j
	j = k
	echo k
```

Date cuenta de que empezamos con el 3 porque ya hemos mostrado los 2 primeros términos y que si quisiéramos obtener 5000 términos, solo tendríamos que cambiar 1 número.

> [!NOTE]
> Cuando aprendemos a programar, muchas veces es útil aprender como leer código. Me refiero a como formar frases con sentido a partir del código que vemos en pantalla para entender qué es lo que hace. Por ejemplo, el bucle del código anterior se leería en inglés de la siguiente manera: "_for each number 'c' in the range from 3 to 50 do ..._" que en español se podría interpretar como: "_por cada numero 'c' en el rango desde 3 a 50 haz ..._" donde 'c' es solo un nombre que le damos a cada nuevo número.

Saber a priori la cantidad de veces que se va a ejecutar un código tiene algunas ventajas, como por ejemplo, que el código es más fácil de optimizar gracias a la 'magia negra' que hacen algunos compiladores. Esto significa que, generalmente, los bucles FOR suelen ser más rápidos que los WHILE, aunque generalmente, la diferencia no es significativa.

Pero claro, esto también trae consigo algunas limitaciones, la principal de ellas es que con un bucle FOR 'puro', nunca podremos crear un bucle infinito, y hay aplicaciones que requieren de un bucles infinitos. Para solventar esto, vamos a ver lo que hacen los bucles WHILE.

### Bucles WHILE
Los bucles WHILE se comportan de una manera distinta a los bucles FOR. En vez de saber a priori el número de veces que se van a ejecutar, lo que hacen es comprobar una condición cada vez que van a volver a ejecutar el código. Si la condición se cumple, el código se ejecuta, si no, el bucle para.

Estas condiciones son del mismo tipo que vimos en la lección de [[contenido/programacion/control_flujo|Condiciones]]. Si la condición tiene un valor verdadero, entonces se entra en el bucle, si es falso, entonces no. Esto es útil cuando no sabemos cuantas veces habrá que ejecutar un código para obtener el resultado que queremos. Por ejemplo, ¿cuándo se hacen los términos de la sucesión de Fibonacci mayores que 10000? No lo sabemos, pero podemos reescribir el código anterior para averiguarlo.

```nim
var i = 0
var j = 1
var k = 0
var c = 0

echo i
echo j

while k < 10000:
	k = i + j
	i = j
	j = k
	c = c + 1
	echo c & ": " & k
```

El contenido de dentro del bucle solo se ejecuta *mientras k sea menor que 10000* en cuanto k tenga un valor mayor, el bucle para.

Esto quiere decir que con un bucle WHILE sí podemos tener bucles infinitos, solo hace falta que la condición siempre sea verdadera.

```nim
while true:
	echo "Aaaahhhh"
```

Los bucles infinitos son útiles, pero también pueden causar muchos problemas, a veces un bucle que nos creemos que no es infinito, nunca termina, y por tanto nuestro programa se queda parado.

En muchos lenguajes, además hay una palabra reservada para salir de cualquier bucle a la fuerza. Cuando el lenguaje lee esa palabra, da igual si se cumple la condición o no, el bucle ha terminado. Esta palabra suele ser `break`.

Con esto podemos avanzar hacia la siguiente lección, que trata de como agrupar datos juntos. Como se puede intuir, los bucles son necesarios para poder tratar con datos similares que están agrupados. El nombre más genérico para estos grupos de datos es [[colecciones|Colecciones]].

[[razonamiento-nim|¿Por qué usar este lenguaje?]]
[[contenido/programacion/control_flujo|Lección anterior]] | [[indice|Volver al índice]] | [[colecciones|Siguiente lección]]