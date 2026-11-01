# ListIterator: recorrido inverso de una lista

**Descripción**: Ejercicio de Java centrado en la manipulación de listas y el uso de `ListIterator` para recorrer una colección en orden inverso y almacenar sus elementos en una segunda lista.

## 📌 Instrucciones del ejercicio

Desarrollar un programa Java que cree una lista de números enteros y utilice `ListIterator` para recorrer sus elementos en orden inverso y añadirlos a una segunda lista.

**Objetivos del ejercicio:**

- Crear y rellenar una lista de tipo `List<Integer>`.
- Crear una segunda lista con los mismos elementos en orden inverso.
- Utilizar `ListIterator` para recorrer una lista desde el final hasta el principio.
- Comprender el funcionamiento de `hasPrevious()` y `previous()`.

## ✨ Características

- **Creación de listas:** utilización de `ArrayList<Integer>` para almacenar los números originales y los números en orden inverso.
- **Rellenado de la lista original:** implementación del método `fillNumbers()`, que añade los números del 1 al 10 mediante `addAll()` y `List.of()`.
- **Recorrido inverso:** implementación del método `invertElements()`, que crea un `ListIterator` situado al final de la lista original.
- **Uso de ListIterator:** utilización de `hasPrevious()` para comprobar si quedan elementos anteriores y de `previous()` para obtenerlos en orden inverso.
- **Construcción de la segunda lista:** incorporación de los elementos obtenidos a `reverseNumbers` mediante `add()`.
- **Control de duplicados:** utilización de `clear()` al inicio de los métodos de relleno e inversión para evitar que se acumulen elementos si se ejecutan varias veces.
- **Comprobación del resultado:** impresión de ambas listas por consola desde la clase `Main`.

## 📚 Investigación: uso de ListIterator en Java

En Java, `ListIterator` es un iterador específico para listas que permite recorrer sus elementos en ambas direcciones: hacia delante y hacia atrás. A diferencia de `Iterator`, también permite añadir, modificar y eliminar elementos durante la iteración mediante sus métodos correspondientes.

Para recorrer una lista hacia delante se utilizan los métodos `hasNext()` y `next()`. El primero comprueba si existe un elemento siguiente y el segundo lo devuelve, avanzando la posición del iterador.

Para recorrer una lista hacia atrás se utilizan `hasPrevious()` y `previous()`. El primero comprueba si existe un elemento anterior y el segundo lo devuelve, retrocediendo la posición del iterador.

El método `listIterator()` crea un iterador al principio de la lista. Sin embargo, también se puede indicar la posición inicial mediante `listIterator(int index)`. En este ejercicio se utiliza `listIterator(numbers.size())` para situar el iterador al final de la lista y poder recorrer todos sus elementos en orden inverso.

Al obtener cada elemento con `previous()`, se añade a la segunda lista mediante `add()`. De esta manera, los elementos se incorporan directamente en el orden inverso, sin necesidad de utilizar índices ni modificar la lista original.

## 🧪 Pruebas realizadas en Main

### Pasos de la prueba

**1. Creación del objeto y preparación de los datos**

Se crea una instancia de `IteratorExercise` y se llama al método `fillNumbers()` para rellenar la lista original con los números del 1 al 10.

**2. Recorrido inverso de la lista**

Se llama al método `invertElements()`, que crea un `ListIterator` en la posición final de `numbers` y recorre sus elementos hacia atrás mediante un bucle `while`.

**3. Comprobación de las listas**

Se muestran por consola las dos listas para comprobar que la primera conserva su orden original y que la segunda contiene los mismos elementos en orden inverso.

### Resultado esperado

```text
Original list: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Reversed list: [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
```

## Conclusión

Con este ejercicio he aprendido a utilizar `ListIterator` para recorrer una lista en orden inverso y construir una segunda lista con sus elementos en ese orden. También he practicado el uso de `hasPrevious()` y `previous()`, así como la incorporación de elementos a una lista mediante `add()` y `addAll()`.

La práctica me ha permitido comprender cómo posicionar un iterador al final de una lista y recorrer sus elementos sin utilizar índices.