# Ejecución de programas

Si no estamos acostumbrados a programar, ejecutar un programa siempre ha sido darle doble click a un icono en algún punto de nuestro sistema operativo y esperar a que se abra una ventana.

Una vez empezamos a programar, sobretodo si utilizamos alguna herramienta como DrJava (no lo hagáis), Eclipse o IntelliJ IDEA, ejecutar un programa pasa a ser darle a un botón o una combinación de teclado.

Cuando aprendemos a utilizar una terminal, algo muy útil a lo largo de la carrera, obtenemos algo más de información. Los programas, generalmente, son archivos. Sin embargo no todos los programas son iguales.

Cuando compilamos un programa hecho en C, el compilador produce un archivo binario adaptado a la plataforma en la que se ha compilado. Nuestro ordenador es capaz de leer ese archivo binario como instrucciones, que es lo que ocurre cuando lo ejecutamos.

Cuando compilamos un programa de Java, sin embargo, el compilador produce un archivo que será igual independiente de la máquina en la que se compile. Esto es porque Java tiene una máquina virtual que permite que el mismo código se ejecute en cualquier máquina, solo hay que adaptar la máquina virtual.

Esto hace que la forma de ejecutar un programa escrito en C y la forma de ejecutar uno hecho en Java sean ligeramente distintas.

```bash
# Primero compilamos
gcc -o programa programa.c
# Luego ejecutamos
./programa
```
```bash
# Primero compilamos
javac Programa.java
# Luego ejecutamos la máquina virtual 
# y le damos el nombre de nuestro programa.
java Programa
```

Los compiladores y la máquina virtual de Java son programas igual que los que podríamos producir nosotros. Estos programas reciben como argumentos nuestro programa y lo traducen. 

Esta forma de trabajar: con programas que reciben argumentos y hacen cosas con ellos es tan común que muchos lenguajes tienen prácticamente integrada la lectura de estos argumentos. Uno de estos lenguajes es Java.

¿Recuerdas la forma que tenía la función `main` en Java?

```java
public static void main (String[] args) {}
```

El array de Strings llamado `args` se llena al ejecutar un programa con los argumentos que se le pasan por consola. Prueba el siguiente ejemplo a ver que resultado produce:

```java
public static void main (String[] args) {
	for (String name : args) {
		System.out.format("Hola %s!\n", name);
	}
}
```
Recuerda como compilar y ejecutar un programa desde una terminal:
```bash
javac NombreDelPrograma.java
java NombreDelPrograma Nombre1 Nombre2 Nombre3
```

> [!NOTE]
> Si no sabes como usar una terminal o como abrirla, en Mac es bastante sencillo, solo hay que buscar "Terminal". En Windows es un poco más complicado, pero desde la carpeta en la que está nuestro programa generalmente se debería poder hacer `shift + click_derecho` y seleccionar "Abrir powershell aquí" o algo similar. Sin embargo, no te frustres si no lo consigues, Windows es un sistema operativo raro y a veces esto no funciona, o java no se puede ejecutar de la terminal sin hacer antes algunos cambios.

[[JavaFunciones|Lección anterior]] | [[Indice|Volver al índice]] | [[Documentacion|Siguiente lección]]