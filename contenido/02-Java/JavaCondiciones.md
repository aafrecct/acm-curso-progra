# Condiciones en Java

Java tiene varias formas de expresar condiciones y cambiar el curso de un programa en función de esas condiciones. La forma más básica es un bloque `if-then-else` que ya vimos anteriormente y que en Java tiene la siguiente forma:

```java
int num_alumnos = 50
if (num_alumnos > 150) {
	System.out.println("No puedes tener tantos alumnos en una clase.");
} else if (num_alumnos > 80) {
	System.out.println("¿Como consigues que tantos alumnos" + 
					   "vayan a tu clase?");
} else {
	System.out.println("Debes de dar alguna optativa...");
}
```

Date cuenta de como se pueden encadenar varias condiciones con `else if`. Esta es la forma principal con la que vamos a controlar el flujo de nuestro programa en Java. Así que vamos a aprovechar para ver algunos ejemplos con condiciones más complejas. Asegúrate que entiendes bien todos los ejemplos a continuación.

```java
int stock_max_narajas = 150
int min_naranjas_venta = 20
int pack_naranjas_descontado = 36
int naranjas_a_comprar = 40

if (naranjas_a_comprar < min_naranjas_venta) {
	System.out.println("¡Tienes que comprar 20 naranjas!")
} else if (naranjas_a_comprar > stock_max_naranjas) {
	System.out.println("No tenemos tantas naranjas")
} else if (naranjas_a_comprar % pack_naranjas_descontado == 0) {
	System.out.println("Tienes un descuento por comprar en packs de 36")
} else {
	System.out.println("¡Toma tus naranjas y vete!")
}
```

```java
int numero_ganador_1 = 23;
int numero_ganador_2 = 68;
int tu_numero = 23;

if (tu_numero == numero_ganador_1 || tu_numero == numero_ganador_2) {
	SystSSem.out.println("¡Has ganado!")
}
```
*Recuerda, en Java, los operadores `and`, `or` y `not` se escriben `&&`, `||`, `!` respectivamente.*

Además, vamos a mencionar otras 2 formas de alterar el flujo del programa: los operadores ternarios y los switches.

---
Los operadores ternarios son pequeñas expresiones `if-else` contenidas en una sola línea que se usan para asignaciones. Son de la forma `condición ? valor_si_cierto : valor_si_falso`. La mejor forma de enter como funcionan es ver un ejemplo:

```java
int numero = 87;
boolean es_par = numero % 2 == 0;
int valor_compuesto = es_par ? 100 - numero : 0;
```

¿Qué valor tiene `valor_compuesto` al final del programa? ¿Qué valor tendría si `numero` tuviera un valor de `88`?

---
Un switch es útil cuando una variable solo puede tener un número limitado de valores distintos. Por ejemplo, marchas en un coche:

```java
// Utilizamos comillas dobles "" para Strings y simples '' para caracteres.
char marcha = 'R';

switch (marcha) {
	case 'R':
		System.out.println("Marcha atrás"); break;
	case '5':
		System.out.println("Tokio Drift"); break;
	case '4':
		System.out.println("Lo adecuado... para calles peatonales"); break;
	default:
		System.out.println("🤓☝️")
}
```

Nos permite indicar acciones específicas para valores específicos y una acción genérica para cualquier otro caso.


[[JavaTipos|Lección anterior]] | [[Indice|Volver al índice]] | [[JavaBucles|Siguiente lección]]