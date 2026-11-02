# 🎮 Tarea 3 - Java Collections: Capital Game

## 📝 Descripción

Ejercicio de Java para practicar el uso de colecciones mediante un juego de preguntas sobre las capitales del mundo. Se trabaja con `HashMap` para almacenar países y capitales, selección aleatoria de elementos y lectura y escritura de archivos.

## 📌 Instrucciones del ejercicio

- Leer el archivo `countries.txt` y almacenar los países y sus capitales en un `HashMap`.
- Solicitar el nombre del jugador.
- Realizar 10 preguntas seleccionando países aleatoriamente y sin repetirlos.
- Comprobar las respuestas y sumar un punto por cada acierto.
- Mostrar la puntuación final y guardar el nombre del jugador y su resultado en un archivo.

## ✨ Características

- **`HashMap`:** almacena los países como claves y sus capitales como valores.
- **Selección aleatoria:** utiliza `Collections.shuffle()` para mezclar los países y seleccionar 10 diferentes.
- **Comprobación de respuestas:** utiliza `equalsIgnoreCase()` para comparar las respuestas sin distinguir mayúsculas y minúsculas.
- **`FileManager`:** centraliza las operaciones de lectura de países y capitales y escritura de puntuaciones.
- **Gestión de archivos:** utiliza `BufferedReader` y `BufferedWriter` para leer y guardar información.
- **Persistencia de resultados:** añade las puntuaciones al archivo existente sin sobrescribir los resultados anteriores.
- **Gestión de excepciones:** controla los errores de lectura y escritura de archivos y muestra los mensajes de error al usuario.

## 📚 Investigación

### `HashMap`

`HashMap` es una colección que almacena elementos mediante pares clave-valor. Cada clave debe ser única y permite recuperar el valor asociado.

En este ejercicio se utiliza el nombre del país como clave y su capital como valor. Esto permite consultar directamente la capital de cada país mediante `get()`.

### Selección aleatoria y `Collections.shuffle()`

`Collections.shuffle()` permite mezclar aleatoriamente los elementos de una lista.

Para evitar repetir países, se obtiene una lista a partir de las claves del `HashMap`, se mezcla y se seleccionan los primeros 10 elementos. De esta manera, cada país aparece como máximo una vez durante la partida.

### Lectura de archivos

`BufferedReader` permite leer archivos de texto línea por línea mediante `readLine()`.

En este ejercicio se utiliza para recuperar los países y sus capitales desde `countries.txt` y almacenarlos en el `HashMap`. Se utiliza `split("\\s+")` para separar los datos de cada línea.

### Escritura de archivos y parámetro `append`

`BufferedWriter` permite escribir texto en un archivo mediante métodos como `write()` y `newLine()`.

Se utiliza junto con `FileWriter` y su parámetro `append` establecido en `true`, lo que permite añadir nuevas puntuaciones al final del archivo sin eliminar los resultados guardados anteriormente.

### Try-with-resources

Es una estructura de Java que permite cerrar automáticamente los recursos utilizados, como lectores y escritores de archivos, al finalizar el bloque `try`, incluso cuando se produce una excepción.

En este ejercicio se utiliza para gestionar los recursos de lectura y escritura de archivos de forma segura.

### Gestión de excepciones

Las operaciones de lectura y escritura pueden producir errores, por ejemplo, cuando un archivo no existe o no se puede acceder a él. Para gestionar estas situaciones se utiliza `IOException`.

En `CapitalGame`, las excepciones producidas durante la lectura y escritura se capturan y se convierten en excepciones `RuntimeException`. En `Main` se capturan estas excepciones para mostrar el mensaje de error al usuario.

También se realiza una validación para comprobar que existen al menos 10 países antes de comenzar la partida. Si no se cumple esta condición, se lanza una `IllegalArgumentException`.


## 🎯 Conclusión

Este ejercicio permite practicar el uso de `HashMap`, la selección aleatoria de elementos y el manejo de archivos en Java. También ayuda a comprender cómo almacenar información en memoria, recuperarla desde un archivo y conservar los resultados de una aplicación entre distintas ejecuciones. Además, permite trabajar con la gestión de excepciones y la separación de responsabilidades entre clases.