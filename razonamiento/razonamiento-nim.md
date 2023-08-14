# ¿Por qué Nim?
## o ¿Cual es el mejor lenguaje para enseñar programación?

Para la mayoría de ejemplos del comienzo del curso, se utiliza un pequeño lenguaje de programación llamado [Nim](https://nim-lang.org/). Nim es un lenguaje de programación imperativo y compilado, con una sintaxis que se parece a Python.

Al empezar a programar, me parece que es importante no perderse en la sintaxis, acordarse de poner todos los puntos y comas y cerrar todas las llaves o el código directamente no compila puede ser un poco frustrante. Además, el uso de excesivos símbolos que encima no sean comunes en matemáticas, como `&&` o `||` puede entorpecer la comprensión del código. 

Idealmente, uno podría leer el código casi como si fuera lenguaje natural, porque lo interesante es entender el contenido: las instrucciones que se dan al computador. En esto Python es fantástico, de hecho, yo aprendí a programar en Python y lo que me enganchó fue el poder expresar cosas en un lenguaje que prácticamente ya entendía, y que se ejecutasen en el ordenador y mostrasen resultados.

Y justo esto último es otra de las claves. Hay quienes defienden que no hace falta decidir un lenguaje porque las bases de la programación deberían enseñarse con pseudocódigo. Y si bien esto es perfectamente cierto, cualquier curso de programación pierde parte de su atractivo cuando el estudiante no es capaz de probar y experimentar y ver los resultados de lo que escribe. Parte del interés de aprender programación es que lo que antes parecía una magia de los ordenadores, se revela poco a poco de forma que empiezas a poder usarla. Sin esa experiencia, la programación no es más que una forma de formalizar algoritmos.

Con estas razones pareciera que estoy defendiendo que Python, y no Nim, debería ser el lenguaje de los ejemplos de este curso. Sin embargo, en diversas conversaciones sobre este tema con personas de la facultad, algunas preocupaciones sobre enseñar programación con Python se me han hecho evidentes. Además, y de manera relacionada, la asignatura de Programación 1 se sigue impartiendo en Java, lo cual implica unas ciertas limitaciones para un curso que pretende servir de ayuda a estudiantes de dicha asignatura.

Las preocupaciones, según las entiendo son las siguientes: 
1. Python no es un lenguaje tipado y aprender de tipos es importante para un alumno de Ingeniería Informática.

> En un principio podría estar de acuerdo con esto, pero la asignatura actual de Programación 1 no enseña nada de valor alrededor de los tipos de datos y los distintos sistemas de tipos. El conocimiento con el que acaba un estudiante de Programación 1 al final del semestre es el de: "los tipos son las palabras que tengo que poner al crear variables y funciones".

2. Python es un lenguaje interpretado, en vez de compilado, y saber lo que es compilar es importante para un alumno de Ingeniería Informática.

> Este argumento me fastidia todavía más. No solo es cierto sobre la compilación lo mismo que he dicho sobre los tipos, hasta el punto que para muchos alumnos compilar no es más que darle a un botón del que no tienen que preocuparse por ahora. Sino que el funcionamiento de Java y Python es esencialmente el mismo: Los dos son lenguajes interpretados por máquinas virtuales. La única diferencia es que Python esconde por completo el paso de transpilación a bytecode que Java llama 'compilación' y hace más explicito. 

Aunque, como es evidente, no estoy particularmente de acuerdo con las preocupaciones, sí creo que hay valor en enseñar qué son los tipos y qué significa compilar a un estudiante de primero, porque le permite relacionarlo con los contenidos de asignaturas que cursará durante la carrera. Y eso es un poco lo que intenta hacer esta mini-wiki. Por tanto, he elegido un lenguaje con un tipado fuerte y compilado, pero con muchas de las ventajas de Python. Yo creo que leyendo el contenido del curso, el lenguaje se adecua mucho al contenido.

De todas formas, tengo que admitir que Nim tiene un gran problema como lenguaje para aprender a programar: su popularidad. Nim es un lenguaje pequeño que no va a conseguirle un trabajo a nadie, y para una escuela que quiere que sus alumnos prácticamente salgan con trabajo de la carrera, pues puede merecer la pena centrarse en un lenguaje más popular.