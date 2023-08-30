# Tipos de datos en Java

Esta lección será más breve, la misión es simplemente introducir los tipos de datos que existen en Java. Primero vamos a ver los tipos para números enteros:
- `byte` (8 bit)
- `short` (16 bit)
- `int` (32 bit - usado por defecto)
- `long` (64 bit)

Los números de coma flotante tienen dos variantes:
- `float` (32 bit)
- `double` (64 bit - usado por defecto)

Además existe un tipo para datos booleanos y uno para caracteres:
- `boolean`
- `char` (16 bits, unicode) 

Al declararse todos estos tipos tienen un valor inicial de `0`, `\u0000` o `false`. Para datos más complejos Java utiliza clases/objetos, que como ya hemos comentado, complica un poco la cosa. Por ahora nos interesa saber que en general, usamos las clases como si fueran tipos de datos, pero su nombre suele empezar por una letra mayúscula. Por eso para utilizar una string en Java usamos:

```java
String nombre =  "Juan";
```

Cabe mencionar que el valor por defecto para una variable de tipo `String`, o cualquier otro tipo no básico es `null`, por tanto hay que tener mucho cuidado e intentar darles un valor al declararlas siempre que podamos.

Además, podemos tener arrays de cualquier tipo de dato. Los arrays se declaran con corchetes `[]` después del tipo de datos. Para darles un valor por defecto, escribimos la lista de valores entre llaves `{}`. También podemos llenar el array con el valor por defecto del tipo de datos, pero en este caso tenemos que escribir la longitud del array y usar una palabra especial `new`.

```java
int[] notas = {1, 3, 6, 8, 5, 7, 4, 6, 8, 1, 3, 8, 9, 0, 5};
int[] cienCeros = new int[100];
System.out.println(notas[2]); // 6
```
*Recuerda que los índices para acceder a los arrays en Java empiezan por 0, por lo tanto `notas[2]` es el tercer elemento de `notas`.*

Por último, podemos introducir algunos operadores en Java:

```java
// Suma, resta, multiplicación
int n = 15 + 10 - 5 * 5;
// División
double d = 10 / 5;
// Módulo
int m = 170 % 3;
// Suma 1
n++;
++n;
// Suma de Strings
String saludo = "Hola " + "Antonio"
```

[[JavaIntro|Lección anterior]] | [[Indice|Volver al índice]] | [[JavaCondiciones|Siguiente lección]]