# Bucles en Java

Java tiene los dos tipos de bucles principales de los que hablamos en la sección de bucles, pero el funcionamiento es un poco distinto. Además, tiene otros 2 tipos de bucles derivados de los dos primeros que son útiles en algunas situaciones. Nos vamos a referir a los 4 tipos de bucles con los nombres: `for`, `for-each`, `while` y `do-while`.

### Bucles FOR
Los bucles `for` en Java tienen la peculiaridad de que pueden ser infinitos. Esto es porque los bucles `for` son en realidad muy parecidos a los bucles `while`.

Para crear un bucle `for` en Java necesitamos 3 cosas:
- Algo que hacer al comienzo del bucle.
- Algo que comprobar al final de cada iteración.
- Algo que cambiar al final de cada iteración.

```java
for (int i = 0; i < 10; i++) {
	System.out.println(i);
}
```

Como podemos ver entre paréntesis  colocamos 3 expresiones separadas por `;`. La primera se ejecutará al principio y creará una variable `i` con valor `0`, luego se ejecutará el código, en nuestro caso, solo imprimimos el valor de la variable i. Una vez llegamos al final, comprobamos la condición que tenemos en el medio: `i < 10`. Si se cumple, aplicamos el cambio que hemos especificado al final: `i++`, es decir, sumamos `1` a `i` y volvemos a empezar el bucle. Si no se cumple la condición, terminamos el bucle. 

¿Cómo hacemos un bucle for infinito entonces? Fácil, no es necesario escribir una expresión para empezar o algo que cambiar al final de cada iteración. Podemos simplemente escribir el siguiente código:

```java
for (; true;) {
	// Esto se ejecutará para siempre.
}
```

#### FOR-EACH
Los bucles `for` se utilizan muchas veces para recorrer colecciones de datos. Cuando queremos recorrer todo un array de principio a final, por ejemplo, tenemos una forma del bucle `for` que nos puede ayudar a hacerlo sin tener que contar con numeritos:

```java
char[] palabra = {'A', 'C', 'M', '4', 'E', 'V', 'E', 'R'}
for (char c : palabra) {
	System.out.print(c);
}
```
*Este tipo de bucle se lee: 'Por cada carácter `c` que haya en la variable `palabra`'.*

### Bucles WHILE
Los bucles `while` se parecen mucho a lo que vimos en la lección de bucles, solo hay que recordar que Java requiere que todo se cierre entre paréntesis `()` o llaves `{}`. Además, es buen momento para recordar que se puede forzar la salida de un bucle con la palabra `break`.

```java
int i = 293840;

while (true) {
	System.out.println(i);
	if (i == 1) {
		break;
	} else if (i % 2 == 0) {
		i = i / 2;
	} else {
		i = 3 * i + 1;
	}
}
```

Aunque los bucles infinitos `while (true)` tienen su uso en la informática, por ejemplo en servidores o programas que solo terminan cuando el usuario lo indica explícitamente, en general no es buena idea utilizarlos para cualquier cosa. Un bucle infinito debe indicar que el programa nunca va a salir de él a no ser que se cumpla una condición inesperada.

#### DO-WHILE
De vez en cuando necesitaremos hacer una cosa "por lo menos una vez, pero tantas veces como haga falta". Este concepto suele expresarse con un poco de código duplicado de la forma:

```java
hacer_algo();
while (condición) {
	hacer_algo();
}
```

Sin embargo, Java tiene una pequeña herramienta que nos permite no tener que escribir el código dos veces y es el bucle `do-while`, que hace precisamente lo que especifica el código anterior.

```java
do {
	hacer_algo();
} while (condición)
```

La mayor parte de las veces vamos a utilizar bucles `for` y `while` normales, y no hace falta preocuparse por las dos alternativas que hemos visto, pero viene bien tener en cuenta que existen para poder escribir código bonito y legible en las ocasiones en las que los necesitemos.

[[JavaCondiciones|Lección anterior]] | [[Indice|Volver al índice]] | [[JavaFunciones|Siguiente lección]]