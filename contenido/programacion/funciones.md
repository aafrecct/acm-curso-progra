# Funciones
> [!NOTE]
> Esta lección muestra como trabajar con funciones y procedimientos, lo que son, su utilidad, su influencia y su ubicuidad. Hay otra lección con una explicación más detallada sobre funciones específicamente en Java y su sintaxis [[contenido/java/funciones|aquí]].

Muchas de las tareas que tenemos que hacer cuando programamos son muy parecidas entre sí. A lo mejor cambian los datos sobre los que tenemos que hacerlas, a veces hay que hacer cosas muy similares en momentos muy distintos en la ejecución de nuestro programa, otras veces simplemente viene bien ponerle un nombre a alguna operación compleja que vamos a hacer de manera repetida. Para todas estas cosas usamos funciones.

Las funciones, igual que en matemáticas producen un resultado a partir de un número de inputs, parámetros o argumentos. Las funciones son tan importantes que hay un [[paradigmas|paradigma de programación]] que se basa únicamente en ellas.

Cuando hablamos de funciones en programación, es posible que escuchemos hablar de varios otros nombres: procedimientos ('procedures') o métodos (methods). Por ejemplo, en Nim (el lenguaje de los ejemplos) la palabra que utilizamos para crear una función es `proc`. Estos tres conceptos tienen sus importantes diferencias, pero se salen mucho del objetivo del curso. Por ahora, vamos a hacer de buenos programadores y llamar a todo 'funciones'.

A lo largo del curso ya hemos usado una función que se introdujo en la lección sobre input y output: `echo`, y vimos que puede tener otros nombres en otros lenguajes de programación. Veamos un ejemplo de como implementar nosotros una función:

```nim
proc mcd(num1: int, num2: int): int =
  var max: int
  var mcd: int
  
  if num1 > num2:
    max = num1
  else:
    max = num2
  
  for i in 1..max:
    if num1 mod i == 0 and num2 mod i == 0:
      mcd = i
  
  return mcd

echo mcd(15, 30)
echo mcd(27, 121)
```

Como podemos ver en el ejemplo, para declarar una función necesitamos darle un nombre: `mdc`; un nombre y el tipo de datos de los parámetros: `num1: int`; y el tipo de datos que devuelve la función: `int`.

Después simplemente escribimos dentro de la función el código que calcula la operación que queremos hacer, en nuestro caso estamos calculando el máximo común divisor.

> [!NOTE]
> El código del ejemplo no es particularmente eficiente, pero esta escrito para que se pueda entender con los conocimientos que hemos visto en partes anteriores del curso, intenta leerlo y descubrir qué es lo que hace exactamente.

Es importante darse cuenta de que las variables `max` y `mcd` se pueden declarar dentro de la función, en la mayoría de lenguajes esto significa que solo se pueden usar dentro de la función y que dejan de existir cuando llegamos al final de la función.

Para "sacar" uno de esos valores de la función, en nuestro caso el resultado, lo que hacemos es "devolverlo". Para devolver un valor, se suele usar la palabra `return`, pero cada lenguaje tiene sus normas. 

Como podemos ver, para usar una función, usamos su nombre y le damos valores a los parámetros, en orden, normalmente entre paréntesis. Esto se conoce como "llamar" a una función. Cuando llamamos a una función, su código se ejecuta con los valores que le hemos dado a los parámetros, y produce un resultado, que es el valor que devolvemos. Ese resultado se usa en el lugar donde está la llamada a la función.

Por tanto en nuestro ejemplo estamos imprimiendo `15` y `1` respectivamente. Puedes probar el código con otros valores para los parámetros.

Con esto, prácticamente tenemos todas las partes esenciales para aprender los conceptos básicos de cualquier lenguaje de programación imperativo. Obviamente, cada lenguaje de programación tiene sus peculiaridades y todos hacen varias cosas especiales para hacer algunos cálculos más fáciles, o más rápidos, o más seguros, por todo esto, aprender un nuevo lenguaje no es trivial, pero con estas herramientas, puedes ir haciendo las preguntas adecuadas sobre cómo hacer determinadas cosas y por qué.

[[razonamiento-nim|¿Por qué usar este lenguaje?]] 
[[colecciones|Lección anterior]] | [[indice|Volver al índice]] | [[contenido/programacion/tipos|Siguiente parte]]