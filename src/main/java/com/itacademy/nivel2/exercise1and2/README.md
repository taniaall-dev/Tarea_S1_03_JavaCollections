# HashSet y ordenación de restaurantes

## Descripción

Ejercicio de Java centrado en el uso de colecciones para gestionar objetos sin duplicados y aplicar criterios de ordenación. Se trabaja con `HashSet`, los métodos `equals()` y `hashCode()`, y la interfaz `Comparable` para definir el orden natural de los restaurantes.

## 📌 Instrucciones del ejercicio

El ejercicio está dividido en dos apartados:

**Ejercicio 1: HashSet sin duplicados exactos**

- Crear una clase `Restaurant` con los atributos `nom` y `score`.
- Sobrescribir los métodos `equals()` y `hashCode()` para evitar restaurantes duplicados con el mismo nombre y puntuación.
- Crear un `HashSet` e introducir varios restaurantes, incluyendo algún duplicado.

**Ejercicio 2: Ordenación múltiple**

- Implementar la interfaz `Comparable` en la clase `Restaurant`.
- Definir un criterio de ordenación por nombre ascendente y, en caso de coincidir, por puntuación descendente.
- Mostrar los restaurantes antes y después de aplicar la ordenación.

## ✨ Características

**Clase `Restaurant`**

- Contiene los atributos privados `nom` y `score`.
- Implementa `Comparable<Restaurant>` para definir el orden natural de los restaurantes.
- Sobrescribe `toString()` para mostrar la información de cada restaurante.
- Sobrescribe `equals()` para comparar dos restaurantes por nombre y puntuación.
- Sobrescribe `hashCode()` utilizando los mismos atributos que `equals()`.

**Método `compareTo()`**

- Compara primero los nombres de los restaurantes en orden alfabético ascendente.
- Si los nombres coinciden, compara las puntuaciones en orden descendente.

**Clase `Main`**

- Crea un `HashSet` para almacenar los restaurantes sin duplicados exactos.
- Utiliza `Collections.addAll()` para añadir varios restaurantes.
- Muestra los restaurantes antes de ordenarlos.
- Utiliza `stream().sorted().toList()` para obtener una lista ordenada según el criterio definido en `compareTo()`.
- Muestra el resultado de la ordenación.

## 📚 Investigación: colecciones y ordenación

### HashSet

`HashSet` es una colección que almacena elementos sin permitir duplicados. No garantiza ningún orden en sus elementos.

Para determinar si un objeto ya existe, utiliza los métodos `hashCode()` y `equals()`.

### equals() y hashCode()

- `equals()` permite comparar dos objetos para determinar si son iguales según los atributos definidos.
- `hashCode()` devuelve un valor hash que ayuda a localizar los objetos dentro de la colección.

Cuando se sobrescribe `equals()`, también debe sobrescribirse `hashCode()` utilizando los mismos atributos para mantener el contrato entre ambos métodos.

### Comparable

La interfaz `Comparable` permite definir el orden natural de los objetos mediante el método `compareTo()`.

Este método devuelve:
- Un número negativo si el objeto actual debe ir antes que el objeto comparado.
- Cero si ambos objetos tienen el mismo criterio de ordenación.
- Un número positivo si el objeto actual debe ir después.

### HashSet y TreeSet

Ambas colecciones evitan elementos duplicados, pero funcionan de forma diferente:

- `HashSet` no garantiza el orden de los elementos y utiliza `equals()` y `hashCode()` para identificar duplicados.
- `TreeSet` mantiene los elementos ordenados según su orden natural o un `Comparator`. Utiliza el resultado de la comparación para determinar si dos elementos son duplicados.

### Streams y sorted()

Los Streams permiten procesar los elementos de una colección mediante operaciones encadenadas.

El método `sorted()` permite ordenar los elementos utilizando su orden natural si implementan `Comparable`.

En este ejercicio, `toList()` recoge el resultado en una nueva lista ordenada, sin modificar el `HashSet` original.

## Pruebas realizadas en el Main

### Pasos de la prueba

1. Se crea un `HashSet` y se añaden varios restaurantes, incluyendo dos con el mismo nombre y puntuación para comprobar que no se duplican.
2. Se muestran los restaurantes antes de ordenarlos.
3. Se utiliza `stream().sorted().toList()` para obtener una lista ordenada por nombre ascendente y puntuación descendente.
4. Se muestran los resultados ordenados para comprobar que se aplica correctamente el criterio de ordenación.

### Conclusión

Con este ejercicio he practicado el uso de `HashSet` para evitar elementos duplicados y he aprendido a definir el orden natural de los objetos mediante `Comparable`, además de ordenar una colección utilizando Streams.