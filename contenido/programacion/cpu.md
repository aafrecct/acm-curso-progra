# ¿Cómo funciona un ordenador?
> [!NOTE]
> El contenido de esta parte es una simplificación del contenido que se da en las asignaturas 'Estructura de Computadores' y 'Arquitectura de Computadores' que son asignaturas de segundo. Sin embargo solo cogemos las partes básicas y más relevantes para entender qué estamos haciendo cuando programamos exactamente.

---

Un computador según [Von Newmann](https://en.wikipedia.org/wiki/John_von_Neumann) se compone de 3 partes:

```mermaid
flowchart LR
A( CPU ) --- B( Memoria ) --- C(I / O)
A --- C
```

Para esta pequeña introducción, sin embargo, solo nos interesa la CPU (Unidad de Procesamiento Central). La CPU es un complejo circuito de transistores que forman puertas lógicas que juntas pueden calcular ciertas operaciones. La CPU por tanto es capaz de interpretar cadenas binarias (en la forma de impulsos eléctricos) y producir un resultado.

En el fondo las instrucciones que le damos a un ordenador son cadenas de 1s y 0s que codifican una información. Esa información suele estar en la forma:

```
[ 1010 1010 ] [ 0000 0001 ] [ 0000 0010 ]
[ Operación ] [ Operando1 ] [ Operando2 ]
```

Como es obvio, es muy complicado entender qué estamos haciendo cuando solo podemos leer 1s y 0s, por tanto existen 'proto-lenguajes' que hacen que estas lineas de binario sean más fáciles de entender. Estos lenguajes son lo que llamamos [[ensamblador]].




[[indice|Volver al índice]] | [[razonamiento-introduccion|¿Por qué es esto importante?]] | [[ensamblador|Siguiente lección]]