# Null
**None, Nil, etc**
> [!NOTE]
> Esta lección muestra la casi universalidad del valor nulo, que tiene distintos nombres en distintos lenguajes. En Java, se llama `null` lo puedes ver mencionado [[contenido/java/tipos|aquí]].

En programación, hay valores que, como son pequeños y manejables, se copian de un lado a otro cada vez que se quieren utilizar. Para el resto de valores, utilizamos 'referencias'. En el fondo, una referencia es un número que indica una posición en memoria donde están los datos.

En muchos lenguajes, las strings, de hecho, son 'referencias'. Lo podemos ver en C, donde una string simplemente es un `char *` (puntero a un carácter). Pero de alguna manera también se puede ver en Java, donde las strings son 'objetos' `String` (no te preocupes si no sabes lo que es un objeto).

Se cuenta que en 1965, Tony Hoare estaba desarrollando un lenguaje de programación cuando implementó una referencia nula. Es decir, una referencia que apuntaba a un espacio de memoria que era todo 0s. Esta idea se propagó por todo el mundo de la programación y ahora es raro ver un lenguaje que no tenga un valor `null`.

`null` es una referencia a nada. Se utiliza mucho para indicar que un procedimiento que tendría que haber terminado con una referencia a unos datos ha fallado en algún punto. En algunos lenguajes `null` tiene un valor parecido a `false`, y por tanto se puede comprobar de forma rápida si la referencia es válida o no.

¿Qué ocurre entonces? A grandes rasgos, que esa comprobación no se hace siempre, y si usamos datos no válidos pensando que son válidos, eso nos lleva a crear muchos problemas de seguridad en nuestro software.

La solución parece obvia entonces: comprobar siempre si las referencias son válidas antes de usarlas. Sin embargo, esto no es siempre tan fácil ya que el número de referencias con el que trabajaremos a veces es muy grande y olvidarse o equivocarse una vez no es tan complicado. Por lo tanto, en general, dentro de lo posible, no está mal intentar reducir nuestro uso de la referencia nula.

> [!NOTE]
> Algunos lenguajes modernos NO tienen una referencia nula, como Rust. La estrategia en estos lenguajes es conseguir que cualquier estado interno del programa que se consideraría un error sea irrepresentable. Esto se consigue a través del sistema de tipos, y es un tema muy interesante, pero se sale del ámbito de este curso.

[[contenido/programacion/tipos|Lección anterior]] | [[indice|Volver al índice]] | [[errores|Siguiente lección]]
