# Input / Output básico

Programar no sería muy util si no pudiéramos ver los resultados de aquello que estamos calculando. Estudiar todo el proceso de como un sistema operativo dibuja los pixeles en una pantalla que forman las letras y colores que nosotros vemos es un tema que se sale bastante del alcance de este curso, y que puede llegar a ser bastante complicado. Por ahora, vamos a asumir que cualquier programa que se este ejecutando asume que tiene un sitio (generalmente una terminal) donde mostrar sus resultados, y vamos a ver, brevemente, las herramientas que algunos lenguajes de programación nos dan para hacer justo eso.

La funcionalidad más básica que nos permite mostrar texto por pantalla, y que comparten casi todos los lenguajes de programación ya la hemos utilizado en las lecciones anteriores. Se suele conocer como 'print' y suele tener la forma de una función o una palabra especifica del lenguaje que nos permite escribir un texto en pantalla.

En [Nim](https://nim-lang.org/) que es el lenguaje en el que [[razonamiento-nim|están escritos la mayoría de ejemplos]] la función que nos permite escribir cosas en pantalla se llama `echo`, pero en otros lenguajes tiene otros nombres: en Python se llama `print`, en Java `System.out.print`, en Rust es una macro `println!`, etc. Pero no hace falta saber lo que es una macro, solo darse cuenta que la misma funcionalidad puede tener muchos nombres.

De manera similar, muchos lenguajes tienen utilidades para poder recibir input del usuario. Esto suele ser un poco más difícil, sobretodo dependiendo del lenguaje, pero no tiene por qué serlo, por ejemplo en Python, es una función que se llama `input`, en Nim, lo que hacemos es leer una linea de texto (`readLine`) de algo llamado 'input estándar' o `stdin`.

Veamos un ejemplo:

```nim
echo "¿Cual es tú nombre?"
var nombre: string = readLine(stdin)
echo "Hola " & nombre
```

> [!NOTE]
> De cara a mostrar texto, suele haber muchas opciones: cuantas cosas quieres mostrar, separadas o no, en distintas líneas o no, etc. Y la mayoría de lenguajes de programación modernos nos ofrecen herramientas ya preparadas para hacerlo todo, solo hay que saber como buscarlo o saber navegar [[Documentacion|la documentación oficial de un lenguaje]].

Con esto hemos terminado esta lección, lo importante **NO** es que tengas una comprensión completa de todo lo que hay en esta página, sino que entiendas que casi todos los lenguajes tienen una forma de _imprimir_ mensajes por pantalla y que conozcas los términos para buscarlo y aplicarlo a varios lenguajes. Además, ahora deberías entender lo que significa la palabra `echo` en los ejemplos.

[[razonamiento-nim|¿Por qué usar este lenguaje?]]
[[Strings|Lección anterior]] | [[Indice|Volver al índice]]  | [[Condiciones|Siguiente lección]]
