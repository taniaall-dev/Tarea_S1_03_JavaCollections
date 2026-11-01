# 📚 Tarea 3 - Java Collections: Duplicados

## 📝 Descripción

Ejercicio de Java para practicar el uso de colecciones mediante una clase `Month` que representa los meses del año. Se trabaja con `ArrayList` y `HashSet` para observar sus diferencias y comprobar cómo se gestionan los elementos duplicados.

## 📌 Instrucciones del ejercicio

- Crear una clase `Month` con un atributo `name` que almacene el nombre del mes.
- Añadir 11 meses a un `ArrayList`, dejando fuera agosto.
- Insertar agosto en su posición correspondiente y comprobar que el orden de los meses es correcto.
- Convertir el `ArrayList` en un `HashSet` y verificar que no se permiten duplicados.
- Recorrer la colección mediante un bucle `for` y un `Iterator`.

## ✨ Características

- **Clase `Month`:** representa un mes y sobrescribe los métodos `equals()` y `hashCode()` utilizando el nombre del mes.
- **`ArrayList`:** almacena los 11 meses iniciales y permite insertar agosto en la posición correcta.
- **Pruebas de duplicados:** se añaden meses repetidos para observar el comportamiento de la lista y del conjunto.
- **`HashSet`:** permite comprobar cómo se identifican los objetos duplicados mediante `equals()` y `hashCode()`, incluso cuando son instancias diferentes.
- **Recorrido de colecciones:** se muestran los elementos mediante un bucle `for` mejorado y un `Iterator`.
- **Comprobaciones adicionales:** además de los requisitos del enunciado, se realizan pruebas para observar qué ocurre al añadir varias veces el mismo objeto, al intentar introducir en un `HashSet` dos objetos `Month` diferentes con el mismo nombre y al añadir un mes inventado al `ArrayList`.
- **Conversión a `HashSet`:** se crea a partir del `ArrayList` después de las pruebas adicionales. Por ello, recibe los elementos que contiene la lista en ese momento, incluidos el mes de agosto repetido y el mes inventado. Al construir el conjunto, los objetos que se consideran iguales según `equals()` y `hashCode()` no se mantienen como duplicados.


## 📚 Investigación

### `ArrayList` y `HashSet`

`ArrayList` es una lista que mantiene el orden de los elementos, permite acceder a ellos mediante su índice y admite duplicados. Por su parte, `HashSet` es un conjunto que no permite elementos duplicados y no garantiza un orden concreto.

### Los métodos `equals()` y `hashCode()`

El método `equals()` permite definir cuándo dos objetos se consideran iguales. En esta práctica, dos objetos `Month` se consideran iguales si tienen el mismo nombre.

El método `hashCode()` devuelve un valor hash que utilizan colecciones como `HashSet` para organizar sus elementos. Ambos métodos deben ser coherentes: si dos objetos son iguales según `equals()`, deben devolver el mismo valor mediante `hashCode()`.

### Gestión de elementos duplicados

`ArrayList` permite añadir varias veces el mismo objeto o distintos objetos con el mismo nombre. En cambio, `HashSet` utiliza `hashCode()` y `equals()` para detectar si un elemento ya está presente.

Gracias a la implementación de estos métodos en `Month`, dos objetos diferentes con el nombre `"August"` se consideran iguales y no se almacenan como elementos distintos dentro del conjunto.

### Comportamiento de las colecciones en las pruebas adicionales

Las pruebas permiten observar que `ArrayList` admite elementos repetidos, tanto si se añade varias veces el mismo objeto como si se añaden objetos diferentes con el mismo nombre.

Al crear un `HashSet` a partir de una lista que contiene elementos repetidos, el conjunto conserva un único elemento por cada grupo de objetos que se consideran iguales según `equals()` y `hashCode()`. Los demás elementos diferentes, como el mes inventado, se mantienen.

Estas comprobaciones ayudan a entender que el comportamiento de cada colección depende de cómo almacena los elementos y, en el caso de `HashSet`, de cómo se define la igualdad entre los objetos.

### Recorrido de colecciones

El bucle `for` permite recorrer directamente los elementos de una colección sin gestionar índices. El `Iterator`, por su parte, permite avanzar por los elementos mediante `hasNext()`, que comprueba si quedan elementos, y `next()`, que devuelve el siguiente.

## 🎯 Conclusión

Este ejercicio permite practicar el uso de colecciones en Java, conocer las diferencias entre `ArrayList` y `HashSet` y comprender la importancia de `equals()` y `hashCode()` para identificar objetos duplicados.