# Condiciones y control del flujo
> [!NOTE]
> Esta lección muestra como trabajar con condiciones y las estructuras comunes que nos podemos encontrar. Hay otra lección con una explicación más detallada de como funciona el control de flujo específicamente en Java y su sintaxis [[contenido/java/control_flujo|aquí]].

Una de las operaciones más comunes en programación es comprobar si nuestros datos cumplen una condición. Para así poder hacer algo si la cumplen o hacer otra cosa si no. Imaginemos que estamos haciendo un programa que devuelva si un número es par o no. Por ahora sabríamos calcular el resto de dividir ese número entre 2, sabríamos imprimir por pantalla "PAR" o "IMPAR", pero no sabríamos como decirle al ordenador que solo escriba "PAR" si el resto es 0 e "IMPAR" si es 1.

Para poder hacer esto necesitamos hablar de 3 cosas:
 1. ¿Cómo representar los valores de verdadero y falso?
 2. ¿Qué operadores usamos para escribir estas condiciones?
 3. ¿Qué conceptos usamos para controlar el flujo del programa?

### ¿Cómo representar verdadero y falso?
En un mundo binario como lo es el de la informática, no nos debería resultar muy complicado representar una noción binaria como lo es la de valores verdaderos y valores falsos. Y efectivamente, la mayoría de lenguajes modernos no se preocupan mucho por esto: existe un tipo de datos 'booleano' (en referencia a la [álgebra de Boole](https://es.wikipedia.org/wiki/%C3%81lgebra_de_Boole)) que solo puede adoptar 2 valores:
`true` y `false`. Veamos un ejemplo:

```nim
var a: bool = true
```

Sin embargo, la historia no es tan simple ya que algunos lenguajes, como C, no tienen este tipo de datos. ¿Cómo diferencian lo verdadero de lo falso entonces? Pues se aprovechan de que todos los valores, en realidad, son numéricos, y establecen la siguiente distinción: el número 0 significa `falso` y cualquier otro número se trata como `verdadero`. Otros lenguajes, como Python han heredado esta idea.

### Operadores
Hay una serie de operadores que utilizamos para expresar condiciones. Algunos son operadores de comparación, sobretodo entre números, como lo son `<` 'menor que', `>` 'mayor que', `==` 'igual que', y otros. Estos operadores comparan dos números y devuelven un valor booleano, es decir, o 'verdadero' si se cumple la condición, o 'falso' en otro caso.

> [!NOTE]
> Si es tu primera vez aprendiendo a programar puede resultarte raro que 'igual que' se represente con 2 iguales. Esto es porque la mayoría de lenguajes utilizan el símbolo de `=` para asignar variables. Esto es una convención, y es casi universal en el mundo de la programación (casi todos los lenguajes son así), pero no es necesario. Es decir, uno podría crear un lenguaje donde el operador de igualdad fuera un único `=`, y de hecho, esto es así en SQL (un lenguaje relacionado con las [[bbdd|bases de datos]]).

``` nim
echo 10 > 1
echo 9 == 11
```

Sin embargo no todos los operadores que devuelven un valor booleano son operadores de comparación, de hecho, en la sección de [[strings]] vimos un ejemplo que incluía el operador `in` y que efectivamente devolvía un valor booleano:

```nim
echo 'c' in "casa"
```

Además muchas veces necesitamos combinar condiciones o invertirlas (negarlas), para esto están los operadores lógicos `and`, `or` y `not`. Que en algunos lenguajes se escriben `&&`, `||` y `!`.

Hay muchos diversos operadores para hacer comprobaciones y son distintos en cada lenguaje de programación. Por tanto, según vamos aprendiendo un lenguaje, nos iremos familiarizando con sus operadores.

### If (This) Then That Else What?
Tenemos casi todas las herramientas necesarias para plantearnos cómo haríamos el ejercicio planteado al comienzo de esta lección, pero primero tenemos que aprender sobre uno de los conceptos más importantes de la programación de alto nivel. Tan importante que hay múltiples bromas en internet sobre que la Inteligencia Artificial no es más que una consecuencia de este concepto. Me refiero a los bloques 'if-then-else'. 

¿Qué es un bloque 'if-then-else'? Es la forma principal con la que expresamos condiciones en programación. Tienen la siguiente forma:

```nim
if 1 > 10:
  echo "Uno es mayor que diez"
else:
  echo "Uno NO es mayor que diez"
```

Esencialmente son la forma en la que expresamos el razonamiento "si se cumple esta condición, haz esto, si no, haz esto otro". Llamamos a este concepto "control del flujo del programa" o en inglés "flow control", porque esencialmente, estamos dirigiendo el programa por una rama o por otra dependiendo de una condición.

Los bloques 'if-then-else' no son la única manera de dirigir el flujo de un programa, muchos lenguajes utilizan otro tipo de constructos como lo son los bloques 'case-do', que pueden tener gran utilidad y veremos en la sección específica de Java, pero se salen del propósito especifico de esta lección.

Por último, dejo aquí una solución al problema que planteábamos al principio de la lección. En el código se utilizan partes de casi todas las lecciones que hemos visto hasta ahora.

```nim
var numero: int = 1945

if numero mod 2 == 0:
  echo "PAR"
else:
  echo "IMPAR"
```
[[indice|Volver al índice]] | [[razonamiento-nim|¿Por qué usar este lenguaje?]] | [[contenido/programacion/bucles|Siguiente lección]]