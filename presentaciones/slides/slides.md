---
theme: default
colorSchema: 'dark'
background: https://images.unsplash.com/photo-1615869442320-fd02a129c77c?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1334&q=80
highlighter: shiki
class: text-left
lineNumbers: true
info: |
  ## Introducción a Programación I (2023)
  Presentación del curso de programación I de ACM UPM 2023
drawings:
  persist: false
transition: slide-left
fonts:
    sans: Jost
    mono: mononoki, Source Code Pro
    local: mononoki
author: Borja Martinena
---

## [ACM]
# **Introdución a la programación**

¿Qué significa programar y cómo hacerlo bien?

Borja Martinena

<style>
    h1 {
      background-image: linear-gradient(to right bottom, #d48d8d, #de94a1, #e69db7, #e9a7ce, #e9b3e4);
      background-size: 100%;
      -webkit-background-clip: text;
      -moz-background-clip: text;
      -webkit-text-fill-color: transparent;
      -moz-text-fill-color: transparent;
  padding-bottom: 1rem;
    }
</style>
<!--
Introduccíon:
- ¿Qué es ACM?
- ¿Quien soy yo?
- ¿Qué vamos a dar en el curso?
-->
---
layout: center
class: text-center
---

# Material

<br>

https://github.com/aafrecct/acm-curso-progra

<br>

https://play.nim-lang.org/

---

# **Índice**

<v-clicks>

1. **¿Qué es programar?**
    - ¿Cómo funciona un ordenador? 
    - Ensamblador
    - ¿Qué es compilar?

2. **Elementos básicos de la programación imperativa**
    - Números
    - Strings
    - Condiciones
    - Bucles
    - Colecciones
    - Funciones

</v-clicks>

---

# **Índice**

<v-clicks>

3. **Otros conceptos importantes de programación**
    - Tipos
    - Null
    - Errores y excepciones

4. **Java** 
    - Estructura básica del código
    - Tipos
    - Control de flujo
    - Bucles
    - Funciones

</v-clicks>

---

### PARTE 1
# **¿Qué es programar?**

<br>

- **Transistores** a partir de material semiconductor.
- **Puertas lógicas** a partir de transistores.
- **Operaciones binarias** a partir de puertas lógicas.
- **Procesadores de instrucciones** combinando operaciones binarias.
- **Lenguajes simbólicos** para escribir instrucciones para un procesador.
- **Lenguajes de alto nivel** que se traducen a lenguajes ensamblador.

<!--
Mencionar asignaturas: Física, Sistemas Digitales, Estructura y Arquitectura y PDL.
-->

---
level: 2
---

# Programación en Ensamblador

<br>
<br>

### Binario

```
10101010 00001000 00100010
11001000 00000000 01001010
```

<br>
<br>

### Ensamblador

```
add 8 34
mov r0 #10
```
<span class="lang">assembly</span>

---

# Código de alto nivel

<br>
<br>

```nim
var 
    naranjas: int = 1000;
    limones: int = 2000;
    frutas: int = naranjas + limones;

echo "Hay un total de ", frutas, " frutas."
```
<span class="lang">nim</span>

---
layout: section
---

### PARTE 2
# **Aprendamos a programar**

---
layout: quote
---

### Números

```nim
var numero_naranjas = 2000
var nota_programacion_1 = 10
```
<span class="lang">nim</span>

---
layout: quote
---

### Números

```nim {all|1|2|3}
var a: int8 = 128
var b: int64 = 100000000
var c: float32 = 3.14
```
<span class="lang">nim</span>

---
layout: quote
---

### Números

```nim
var numero: int8 = 129
echo numero
```
<span class="lang">nim</span>

<br>

<v-click>

```
-127
```

</v-click>

---
layout: quote
---

### Números

```nim
var a: int = 32
var b: int = 8

# Prueba los siguientes operadores: + - * / mod
var resultado = a * b
echo resultado
```
<span class="lang">nim</span>

<br>

<v-click>

```
256
```

</v-click>

---
layout: quote
---

### Strings

```nim
var saludo: string = "hola mundo"
```
<span class="lang">nim</span>

---
layout: quote
---

### Strings

<div class="overflow-scroll ">

| Posición en mem. | Datos en mem.   | Letra representada |
|:----------------:|:----------------|:------------------:|
| 00               | `01101000` (104)| h                  |
| 01               | `01101111` (111)| o                  |
| 02               | `01101100` (108)| l                  |
| 03               | `01100001` (97) | a                  |
| 04               | `00100000` (32) | \<espacio\>        |
| 05               | `01101101` (109)| m                  |
| 06               | `01110101` (117)| u                  |
| 07               | `01101110` (110)| n                  |
| 08               | `01100100` (100)| d                  |
| 09               | `01101111` (111)| o                  |
| 10               | `00000000` (0)  | \<null\>           |

</div>

---
layout: quote
---

### Strings

```rust
let saludo: &str = "hola mundo";
let mut saludo_2: String = String::from("hola a todos");
```
<span class="lang">rust</span>

---
layout: quote
---

### Strings

```nim
var a: string = "Las cadenas son secuencias de "
var b: string = "caracteres"
var c: char   = 'a'

echo a & b
echo c in a
```
<span class="lang">nim</span>

<br>

<v-click>

```
Las cadenas son secuencias de caracteres
true
```

</v-click>

---
layout: quote
---

### Booleanos

```nim
var a: bool = true
```
<span class="lang">nim</span>

---
layout: quote
---

### Booleanos

``` nim
echo 2005 > 2001
echo 9 == 11
echo 't' in "torre"
```
<span class="lang">nim</span>

<br>

<v-click>

```
true
false
true
```

</v-click>

---
layout: quote
---

### Condiciones

```nim
var numero: int = 1945

if numero mod 2 == 0:
  echo "PAR"
else:
  echo "IMPAR"
```
<span class="lang">nim</span>

<br>

<v-click>

```
IMPAR
```

</v-click>

---
layout: quote
---
### Bucles

``` nim
var i: int = 0
var j: int = 1

echo i
echo j

i = i + j
echo i
j = j + i
echo j
i = i + j
echo i
j = j + i
echo j
i = i + j
echo i
j = j + i
echo j
i = i + j
echo i
j = j + i
echo j
i = i + j
echo i
j = j + i
echo j
i = i + j
echo i
j = j + i
echo j
i = i + j
echo i
j = j + i
echo j
i = i + j
echo i
j = j + i
echo j
i = i + j
echo i
j = j + i
echo j
i = i + j
echo i
j = j + i
echo j
i = i + j
echo i
j = j + i
echo j
i = i + j
echo i
j = j + i
echo j
...
```
<span class="lang">nim</span>

---
layout: quote
---

### Bucles FOR

``` nim
var i = 0
var j = 1
var k = 0

echo i
echo j

for c in 3..50:
	k = i + j
	i = j
	j = k
	echo k
```
<span class="lang">nim</span>

---
layout: quote
---

### Bucles WHILE

```nim
var i = 0
var j = 1
var k = 0
var c = 0

echo i
echo j

while k < 10000:
	k = i + j
	i = j
	j = k
	c = c + 1
	echo c & ": " & k
```
<span class="lang">nim</span>

---
layout: quote
---

### Colecciones

```nim
var notas_progra: array[8, int] = [1, 5, 2, 5, 7, 3, 6, 7]

echo notas_progra[3]

var suma: int = 0
var media: float

for nota in notas_progra:
  suma = suma + nota

media = suma / 8
echo media
```
<span class="lang">nim</span>

---
layout: quote
---

### Funciones

```nim {all|1|2-3|5-8|10-12|14|16}
proc mcd(num1: int, num2: int): int =
  var min: int
  var mcd: int
  
  if num1 < num2:
    min = num1
  else:
    min = num2
  
  for i in 1..min:
    if num1 mod i == 0 and num2 mod i == 0:
      mcd = i
  
  return mcd

echo mcd(15, 30)
```
<span class="lang">nim</span>

---
layout: quote
---

### Null, Nil, None...

```c
char * cadena = NULL;
```
<span class="lang">c</span>

```java
String cadena = null;
```
<span class="lang">java</span>

```python
cadena = None
```
<span class="lang">python</span>

---
layout: quote
---

### Alternativas

```rust
fn checked_division(dividend: i32, divisor: i32) -> Option<i32> {
    if divisor == 0 {
        None
    } else {
        Some(dividend / divisor)
    }
}
```
<span class="lang">rust</span>

---
layout: default
---

### Errores

<br>

<v-clicks>

<div>

#### <line-md-align-left /> **Errores de compilación:**

_Algo está mal y nuestro código no compila._

</div>
<div>

#### <line-md-alert-twotone /> **Errores de ejecución:**

_Hemos hecho algo raro y mientras nuestro programa se estaba ejecutando ha aparecido un error._

</div>
<div>

#### <line-md-coffee-twotone-loop/> **Bugs**:
    
_Nuestro programa funciona... Pero_

</div>
<div>

#### <line-md-loading-loop /> **Otros (errores de seguridad, performance...)**

</div>
</v-clicks>

---
layout: quote
---

### Excepciones

```java
int a = 0;
int b = 10;
int c;

try {
	c = b / a
} catch (ArithmeticException e) {
	System.out.println("División entre 0")
	c = 0
}
```
<span class="lang">java</span>

---
layout: quote
---

## Una pequeña nota sobre paradigmas de programación.
No hace falta memorizar esto, pero puede ayudarte a entender algunas cosas.

---
layout: section
---

### PARTE 4
## Programación imperativa en
# Java

---

### Estructura del código

```java {all|1|3,6|4|8,15|11-14}
public class Estructura {
    
    static double circunferencia (int radio){
        double tau = 6.28;
        return tau * radio;
    }

    public static void main (String[] args) {
        int radio = 2;

        System.out.println("Esto es el programa principal.");
        System.out.format("La circunferencia de radio %d mide %.2f\n",
                          radio,
                          circunferencia(radio));
    }
}
```

---

### Tipos

```java {all|3|4|5|6|8|9|11|12-13|14}
public class Tipos {
    public static void main (String[] args) {
        byte  b = 1;
        short s = 1000;
        int   i = 900000;
        long  l = 9999999999;
        
        float  f = 3.141592;
        double d = 6.283184;

        System.out.format("%d + %d = %d", i, 99999, i + 99999);
        System.out.println(i++);
        System.out.println(++i);
        System.out.println(i);
    }
}
```

---

### Tipos

```java {all|3|4|6|7|9|10}
public class Tipos {
    public static void main (String[] args) {
        char letra = 'c';
        boolean check = true;

        String saludo = "Hola mundo";
        String saludoPersonal = "Hola" + "Ferrero";

        byte[] notas = {3, 4, 5, 6, 2, 3, 5, 6};
        byte[] ceros = new byte[100];
    }
}
```

---

### Condiciones

```java {all|4|6|9|all}
public class IfElse {
    public static void main (String[] args) {
        int num_alumnos = 50
        if (num_alumnos > 150) {
            System.out.println("No puedes tener tantos alumnos en una clase.");
        } else if (num_alumnos > 80) {
            System.out.println("¿Como consigues que tantos alumnos" + 
                               "vayan a tu clase?");
        } else {
            System.out.println("Debes de dar alguna optativa...");
        }
    }
}
```

---

### Condiciones

```java {all|7-8}
public class IfElse {
    public static void main (String[] args) {
        int numero_ganador_1 = 23;
        int numero_ganador_2 = 68;
        int tu_numero = 23;

        // and (&&), or (||), not (!)
        if (tu_numero == numero_ganador_1 || tu_numero == numero_ganador_2) {
            System.out.println("¡Has ganado!")
        }
    }
}
```

---

### Otras condiciones

```java {all|4|5|7|8|10|all|14}
public class MatchCase {
    public static void main (String[] args) {
        int numero = 87;
        boolean es_par = numero % 2 == 0;
        int valor_compuesto = es_par ? 100 - numero : 0;

        match (valor_compuesto) {
            case 0:
                System.out.println("No era par :(");
                break;
            case 13:
                System.out.println("Era par :)");
                break;
            default:
                System.out.println("Alguien ha cambiado el valor de `numero`")
        }
    }
}
```

---

### Bucles FOR

```java {all|3-6|8-12}
public class ForLoops {
    public static void main (String[] args) {
        // FOR
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // FOR EACH
        char[] palabra = {'A', 'C', 'M', '4', 'E', 'V', 'E', 'R'}
        for (char c : palabra) {
            System.out.print(c);
        }
    }
}
```

---

### Bucles WHILE

```java {all|3-14}
public class WhileLoops {
    public static void main (String[] args) {
        // WHILE
        int i = 293840;

        while (true) {
            System.out.println(i);
            if (i == 1) {
                break;
            } else if (i % 2 == 0) {
                i = i / 2;
            } else {
                i = 3 * i + 1;
            }
        }
    }
}
```

---

### Bucles WHILE

```java {all|3-6|8-11}
public class WhileLoops {
    public static void main (String[] args) {
        hacer_algo();
        while (condición) {
            hacer_algo();
        }

        // DO WHILE
        do {
            hacer_algo();
        } while (condición)
    }
}
```

---

### Procedimientos

```java {all|3-6|8-11}
public class WhileLoops {

    void hacer_algo () {
        Thread.sleep(1000);
    }

    public static void main (String[] args) {
        hacer_algo();
    }
}
```

---
layout: section
---

# FIN
