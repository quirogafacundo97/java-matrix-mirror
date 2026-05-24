# Java Matrix Mirror

Proyecto realizado en Java aplicando Programación Orientada a Objetos y manejo de matrices bidimensionales.

## Descripción

El programa permite crear una matriz de caracteres y generar su versión espejo invirtiendo el orden de las columnas.

Se trabaja con:

* Matrices bidimensionales (`char[][]`)
* Recorridos de matrices
* Transformación de índices
* Herencia
* Encapsulación
* Sobrescritura de `toString()`

## Funcionamiento

Dada una matriz original:

```text
A B C D
E F G H
```

El programa genera su matriz espejo:

```text
D C B A
H G F E
```

## Estructura del proyecto

### Clase `Matriz`

Contiene:

* La matriz bidimensional
* Métodos getters
* Métodos para asignar y obtener valores
* Método `toString()` para mostrar la matriz

### Clase `Espejo`

Hereda de `Matriz` e implementa la lógica para construir la matriz espejo.

## Tecnologías utilizadas

* Java
* Eclipse IDE

## Autor

Juan Facundo Quiroga
