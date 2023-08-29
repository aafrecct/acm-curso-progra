# Errores y excepciones

Aunque a todos nos gustaría pensar lo contrario, cuando programamos cometemos errores. A veces es tan sencillo como que se nos olvida poner un punto y coma al final de una linea de código, otras son cosas más graves. En general nuestros errores pueden ser de muchos tipos:

- **Errores de compilación:**
	_Algo está mal y nuestro código no compila. Muchas veces leer el error nos puede dar información importante sobre qué está pasando._
- **Errores de ejecución:**
	_Hemos hecho algo raro y mientras nuestro programa se estaba ejecutando ha aparecido un error. A veces es por operar con una referencia nula, por dividir entre 0, hay muchas razones._
- **Bugs**:
	_Nuestro programa funciona... Pero no hace lo que queremos que haga, hemos cometido algún error en la lógica de nuestro programa que hace que los resultados no sean correctos._
- **Errores de seguridad:**
	_Nuestro programa funciona bien y hace lo que tiene que hacer, pero si alguien se pusiera a intentar romperlo, a lo mejor podría añadir datos malos a nuestra base de datos, tenemos que añadir medidas de seguridad._

Y estos no son todos.

Sin embargo, de cara a nuestro lenguaje solo 2 de estos errores son visibles: Los errores de compilación y los errores de ejecución. El resto son errores para nosotros ya que para nuestro lenguaje, el programa esta funcionando sin problema.

Los primeros, es decir los errores de compilación, suelen tener que ver con la sintaxis. Dicho de otra manera, no hemos escrito bien nuestro código. Aunque cada vez más, nuevos lenguajes incluyen herramientas en su compilador para asegurarse de que el código se ejecutará de manera correcta, es decir, no habrá divisiones por cero por ejemplo.

> [!NOTE]
> Un caso reciente de esto que vengo mencionando bastante en el curso es el lenguaje de programación Rust, que tiene un compilador particularmente estricto. Muchos desarrolladores describen que programar con Rust es una lucha contra el compilador y cuando la ganas, puedes estar casi seguro de que tu programa funcionará bien.

La parte importante de esta lección, sin embargo, son los errores de ejecución. Algunos lenguajes de programación, simplemente dejan que estos errores ocurran, si en mitad de la ejecución tu programa hace algo que no debería, como usar memoria que no le corresponde, el lenguaje no lo reconoce, el sistema operativo sí, y detiene la ejecución del programa en la mayoría de casos.

Algunos lenguajes de programación modernos, sin embargo, tienen un sistema de excepciones. Un sistema de excepciones intenta capturar errores como el que hemos descrito y los encapsulan en una "Excepción", que es un nombre para una estructura de datos que contiene información sobre lo que ha ocurrido. Estas excepciones suelen tener algunas operaciones asociadas.

Podemos, por ejemplo, generar una excepción propia. El término mas utilizado es que la "tiramos". Por ejemplo en Java:

```java
throw new RuntimeException();
```

O si sabemos que una operación puede tirar una excepción, podemos indicar a nuestro programa que "intente" hacerla, y si no lo consigue, como recuperarse del error:

```java
int a = 0;
int b = 10;
int c;

try {
	c = b / a
} catch (ArithmeticException e) {
	System.out.println("División entre 0")
	c = b
}
```

Como podemos ver, es parecido a como utilizamos los bloques if-then-else, sin embargo, siempre que podamos, deberíamos usar un `if` en vez de un `try`. No solo porque levantar y capturar una excepción suele ser más lento, sino porque es importante que las excepciones conserven su significado: Algo ha ido mal.

[[null|Lección anterior]] | [[indice|Volver al índice]] | [[buenas_practicas|Siguiente parte]]