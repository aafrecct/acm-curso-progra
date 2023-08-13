# Lenguaje ensamblador
> [!NOTE]
> El contenido de esta parte es una simplificación del contenido que se da en las asignaturas [[estru-arqui|Estructura de Computadores y Arquitectura de Computadores]] que son asignaturas de segundo. Sin embargo solo cogemos las partes básicas y más relevantes para entender qué estamos haciendo cuando programamos exactamente.

Es probable que en algún momento hayas escuchado una frase similar a _"Esta hecho en ensamblador"_ queriendo decir que un software, probablemente algún juego antiguo, fue muy difícil de programar o que es muy eficiente. Si nunca has oído hablar de lo que es ensamblador, no te preocupes.

Como hemos visto, los ordenadores solo entienden cadenas de 1s y 0s, pero lo que puede no ser tan obvio es que esas cadenas no se procesan de forma continua, un cero detrás de otro hasta el infinito. Los procesadores entienden 'instrucciones', esas instrucciones suelen incluir una operación y unos datos con los que hacer la operación. Además, suelen tener una longitud o tamaño definido, por ejemplo 16 bits. 1 bit es simplemente un `1` o un `0`.

Por lo tanto nos encontramos con que en vez de una cadena infinita de dígitos binarios, el ordenador en realidad lo que esta entendiendo es algo mas parecido a comandos del estilo:
- `sumar 9 11` (9 + 11)
- `mover resultado memoria#42069` (mover el resultado a una posición en memoria)

Donde cada operación tiene un código binario, por ejemplo 'sumar' puede ser `10101010` y 'mover' `11110000`.

Por tanto, podemos establecer un código que pueda ser traducido directamente a esos 1s y 0s pero que sea más legible. Así obtenemos los distintos lenguajes ensamblador. Ten en cuenta que no hay 1 lenguaje ensamblador, sino que cada tipo de procesador entiende una cantidad distinta de instrucciones en un formato ligeramente distinto, y por tanto cada arquitectura tiene un lenguaje ensamblador.

Tras este proceso terminamos con un código que se parece a esto:

```asm
add 09  11
mov res [42069]
```

Sigue siendo difícil de leer pero es significativamente más fácil que solo 1s y 0s. Aprenderás a programar así en [[estru-arqui|Estructura y Arqui]].

Si has llegado hasta aquí y nunca has programado en tu vida, puede que esto te asuste: ¿Cómo vamos a aprender a programar así en 4 meses? Pero no te preocupes la programación ha avanzado mucho desde los tiempos de programar en ensamblador, ahora solo es necesario para aplicaciones muy especializadas, como para hacer drivers y cosas similares.

Lo que vamos a ver en este curso se suele llamar "programación de alto nivel", es decir, vamos a programar en lenguajes que abstraen muchos conceptos y nos ofrecen la posibilidad de pensar en instrucciones más complejas, flujos de programa, funciones, etc.

Pero primero vamos a ver un poco sobre el proceso de crear esos lenguajes y traducirlos de vuelta a 1s y 0s. Ese proceso se llama [[compilar|Compilación]]

[[indice|Volver al índice]] | [[razonamiento-introduccion|¿Por qué es esto importante?]] | [[compilar|Siguiente lección]]