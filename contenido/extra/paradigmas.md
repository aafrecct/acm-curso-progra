# Paradigmas de programación 

Durante el curso hemos mencionado alguna vez el concepto de 'objetos' o de funciones como base de un paradigma. Pero no nos hemos parado a explicar: ¿qué es un paradigma de programación? 

La programación de alto nivel es una abstracción. Es decir, una herramienta que nos permite pensar en conceptos más complejos que luego se traducen a instrucciones más básicas. En realidad, gran parte de la informática es una pirámide de abstracciones que nos permiten construir cosas más complejas: 
- **Transistores** a partir de **material semiconductor**. 
- **Puertas lógicas** a partir de **transistores**. 
- **Operaciones binarias** a partir de **puertas lógicas**. 
- **Procesadores de instrucciones** combinando **operaciones binarias**. 
- **Lenguajes simbólicos** para escribir **instrucciones para un procesador**. 
- **Lenguajes de alto nivel** que se traducen a **lenguajes ensamblador**. 

En esta lección vamos a hablar del último nivel de abstracción. Hay varias direcciones que podemos tomar al abstraer las operaciones que puede hacer un computador. Por ahora solo vamos a ver algunas de las básicas, pero hay muchísimos paradigmas y sub-paradigmas. 

La forma que nos puede parecer más obvia de abstraer las operaciones de un computador es simplemente definir una serie de operaciones más complejas, una forma de tomar decisiones dependiendo de nuestros datos y alguna estructura para poder ejecutar código de forma repetida. 

Conceptualmente, lo que estaríamos haciendo es lo mismo que al programar en ensamblador: Dar instrucciones al computador sobre cómo producir un resultado. A esto lo llamamos **programación imperativa**. 

La programación imperativa es el tipo de programación más común a día de hoy. Dentro de la programación imperativa, existe la programación procedural, que simplemente quiere decir que se basa en procedimientos (podemos llamarlo funciones, pero la diferencia es que definimos los pasos que tiene que tomar la máquina para llegar al estado final). C es un lenguaje de programación procedural. 

### Orientación a objetos 
Más recientemente se ha vuelto muy popular la programación orientada a objetos. Java por ejemplo, es un lenguaje orientado a objetos. ¿Qué significa esto? La programación orientada a objetos combina los datos y las funciones en "cosas" con significado, que llamamos objetos. Esto, dicho así, es muy confuso, así que vamos a ver un ejemplo. 

Si quiero hacer un programa para manejar mi clase de alumnos, con lo que sabemos por ahora, podríamos tener un array con las notas, un array con los nombres, etc. Y funciones para imprimir los datos o calcular las medias. 

En un lenguaje orientado a objetos, tendríamos un tipo de datos especial llamado "Alumno" que tendía los datos sobre su nombre, sus notas y funciones propias para calcular su media. En Programación I no vamos a aprender a utilizar objetos, eso es temario de [[progra2| Programación 2]]. Pero Java está muy enfocado a objetos, por lo que no podemos ignorarlo por completo, y va a tener algunas consecuencias en como programamos, como veremos dentro de poco. 

### Programación declarativa 
Sin embargo, la programación imperativa no es la única forma de abstraer las operaciones de un computador. Una manera más matemática es la programación declarativa. 

En programación declarativa, lo que hacemos es describir el estado final de la máquina, normalmente de manera matemática, en vez de dar las instrucciones, paso a paso, de como llegar a ese estado. En la carrera se pueden llegar a ver dos tipos de programación declarativa: la programación lógica con [[prolog|Prolog]] y la más común programación funcional. 

En la programación funcional, todo son funciones. Nuevas funciones se pueden definir a partir de otras funciones primitivas. Los programas funcionales son mucho más fáciles de analizar estáticamente, hasta el punto que algunos lenguajes, como Elm, aseguran que el código final generado estará libre de errores de ejecución. Sin embargo, puede ser un poco complicado adaptarse a esta forma de programar.

[[comentarios|Lección anterior]] | [[indice|Volver al índice]] | [[estructura|Siguiente parte]]
