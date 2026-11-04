# Gestor de personas y ordenación

## Descripción

Ejercicio de Java centrado en la lectura de archivos CSV y la gestión de objetos mediante colecciones. Se trabaja con `BufferedReader` y `FileReader` para leer registros de un archivo, `ArrayList` para almacenar personas y `Comparator` para aplicar diferentes criterios de ordenación según el nombre, los apellidos y el DNI.

También se practica la organización de una aplicación mediante clases con responsabilidades diferenciadas, separando la lectura de archivos, la gestión de personas y la interacción con el usuario.

## 📌 Instrucciones del ejercicio

Desarrollar una aplicación Java que permita gestionar una colección de personas a partir de los datos almacenados en un archivo CSV.

El ejercicio consiste en:

- Leer los datos del archivo CSV y convertir cada registro en un objeto `Person`.
- Almacenar y gestionar las personas mediante una colección.
- Permitir introducir nuevas personas desde un menú interactivo.
- Mostrar la colección aplicando diferentes criterios de ordenación por nombre, apellidos y DNI, tanto en orden ascendente como descendente.

## ✨ Características

**Clase `Person`**

- Contiene los atributos privados `name`, `surnames` e `ID`.
- Utiliza un constructor para inicializar los datos de cada persona.
- Proporciona métodos getter para acceder a sus atributos.
- Sobrescribe `toString()` para mostrar la información de cada persona.

**Clase `CSVReader`**

- Recibe la ruta del archivo CSV mediante su constructor.
- Utiliza `FileReader` y `BufferedReader` para leer el archivo línea por línea.
- Utiliza `readLine()` para obtener cada registro y `split(",")` para separar sus tres campos.
- Crea un objeto `Person` por cada registro leído.
- Devuelve una lista con todas las personas.
- Utiliza `try-with-resources` para cerrar automáticamente el lector de archivos.
- Propaga las posibles excepciones `IOException` al método que realiza la llamada.

**Clase `PersonManager`**

- Utiliza una colección `ArrayList<Person>` para almacenar las personas.
- Recibe la lista inicial de personas mediante su constructor y la incorpora a su colección interna.
- Implementa `addPerson()` para añadir nuevas personas.
- Implementa `showListPerson()` para mostrar los elementos de una lista.
- Define tres comparadores mediante `Comparator<Person>`:
    - `comparatorByName`: compara por nombre.
    - `comparatorBySurnames`: compara por apellidos.
    - `comparatorById`: compara por DNI.
- Utiliza `compareToIgnoreCase()` para realizar comparaciones sin distinguir entre mayúsculas y minúsculas.
- Implementa seis métodos de ordenación, combinando los tres criterios con orden ascendente y descendente.
- Utiliza `reversed()` para invertir el criterio de ordenación.
- Crea una copia de la lista original antes de ordenarla, evitando modificar el orden de la colección interna.

**Clase `ConsoleUI`**

- Recibe un objeto `PersonManager` mediante su constructor.
- Implementa `showMenu()` para mostrar las opciones disponibles.
- Implementa `start()` para controlar el menú mediante un bucle y un `switch`.
- Utiliza `ConsoleReader` para solicitar los datos de las personas y recoger la opción elegida.
- Delega en `PersonManager` las operaciones de incorporación, ordenación y visualización de personas.
- Incluye una opción `default` para gestionar las opciones no válidas.
- Permite finalizar la aplicación mediante la opción 0.

**Clase `Main`**

- Crea un objeto `CSVReader` indicando la ruta del archivo CSV.
- Lee los registros iniciales y obtiene la lista de personas.
- Crea e inicializa `PersonManager` con los datos obtenidos.
- Crea `ConsoleUI` y le proporciona el gestor de personas.
- Inicia la aplicación mediante la llamada a `start()`.
- Gestiona las posibles excepciones `IOException` durante la lectura del archivo.

## 📚 Investigación: lectura de archivos CSV y ordenación de colecciones

### Archivos CSV

CSV (*Comma-Separated Values*) es un formato de archivo utilizado para almacenar datos estructurados en forma de tabla.

Cada línea representa un registro y sus campos se separan mediante un delimitador, que en este ejercicio es la coma.

En este ejercicio, cada registro contiene tres campos: nombre, apellidos y DNI.

### FileReader y BufferedReader

- `FileReader` permite leer el contenido de un archivo de texto.
- `BufferedReader` añade un búfer de lectura que permite obtener el contenido de forma más eficiente.
- `readLine()` lee el archivo línea por línea y devuelve `null` cuando se alcanza el final del archivo.
- `split(",")` divide una cadena de texto en un array utilizando la coma como separador.

### Try-with-resources

La estructura `try-with-resources` permite utilizar recursos que deben cerrarse al finalizar su uso.

En este ejercicio se utiliza para gestionar el `BufferedReader`, garantizando que el lector se cierre automáticamente al terminar la lectura, incluso si se produce una excepción.

### ArrayList y List

- `List` es una interfaz que define una colección ordenada de elementos.
- `ArrayList` es una implementación de `List` que permite almacenar elementos en una lista dinámica.
- Permite añadir elementos mediante `add()` y recorrerlos mediante un bucle `for-each`.

En este ejercicio se utiliza `ArrayList<Person>` para almacenar y gestionar las personas leídas del archivo CSV y las introducidas desde el menú.

### Comparator

La interfaz `Comparator` permite definir diferentes criterios de comparación para ordenar objetos.

A diferencia de `Comparable`, que establece un orden natural dentro de la propia clase, `Comparator` permite definir varios criterios de ordenación independientes.

En este ejercicio se utilizan tres comparadores para ordenar las personas por nombre, apellidos y DNI.

### Expresiones lambda

Se utilizan expresiones lambda para definir los comparadores de forma concisa, indicando qué atributos de Person se deben comparar.

Por ejemplo, (p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName()) compara los nombres de dos personas sin distinguir entre mayúsculas y minúsculas.

### compareToIgnoreCase()

El método `compareToIgnoreCase()` compara dos cadenas de texto alfabéticamente sin distinguir entre mayúsculas y minúsculas.

Devuelve:
- Un número negativo si la primera cadena debe ir antes que la segunda.
- Cero si ambas cadenas son equivalentes ignorando mayúsculas y minúsculas.
- Un número positivo si la primera cadena debe ir después que la segunda.

### sort() y reversed()

- `sort()` permite ordenar los elementos de una lista utilizando un comparador.
- `reversed()` devuelve un comparador que invierte el criterio de ordenación original.

En este ejercicio se combinan ambos métodos para implementar los órdenes ascendente y descendente de cada criterio.

### Copia de listas antes de ordenar

Al crear una nueva lista mediante `new ArrayList<>(people)`, se obtiene una colección independiente que contiene las mismas referencias a los objetos originales.

Esto permite ordenar la nueva lista sin modificar el orden de los elementos de la colección interna.

## Pruebas realizadas desde el menú

### Pasos de la prueba

1. Se inicia la aplicación y se comprueba que se leen correctamente las personas almacenadas en el archivo CSV.
2. Se selecciona la opción 1 para introducir una nueva persona y comprobar que se incorpora a la colección.
3. Se prueban las opciones de ordenación por nombre, apellidos y DNI, tanto en orden ascendente como descendente.
4. Se comprueba que las personas se muestran siguiendo el criterio de ordenación seleccionado.
5. Se introduce una opción no válida para comprobar el funcionamiento de `default`.
6. Se selecciona la opción 0 para finalizar la aplicación.

### Conclusión

Con este ejercicio he practicado la lectura de archivos CSV, el almacenamiento de objetos mediante colecciones y la ordenación dinámica utilizando `Comparator`. También he trabajado con diferentes criterios de comparación y he reforzado la separación de responsabilidades mediante una estructura modular de clases.