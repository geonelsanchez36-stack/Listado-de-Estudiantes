- Listado de Estudiantes - Lista Simplemente Enlazada
- Descripción del Proyecto

Este proyecto implementa una Lista Simplemente Enlazada en Java para gestionar los datos de estudiantes del departamento de Informática. El sistema permite almacenar información como CI, nombre, apellido, sexo, año, si es militante de la UJC y si es becado, y ofrece funcionalidades para consultar cumpleaños, listar militantes ordenados por año y contar becados.

El proyecto responde a los requerimientos planteados en la actividad, donde se solicita implementar una lista simplemente enlazada con métodos específicos para el control de datos estudiantiles.
- Objetivos

    Implementar una Lista Simplemente Enlazada desde cero (sin usar colecciones de Java).

    Aplicar los principios de Programación Orientada a Objetos.

    Resolver los tres incisos planteados en la actividad:

        a) Listado de estudiantes que cumplen años en un mes determinado.

        b) Listado de militantes de la UJC ordenados por año de menor a mayor.

        c) Cantidad de estudiantes becados.

 -Estructura del Proyecto
text

📁 Listado-de-Estudiantes/
├── 📄 Estudiante.java
├── 📄 Nodo.java
├── 📄 ListInterface.java
├── 📄 LinkedList.java
├── 📄 Main.java
└── 📄 README.md

 Descripción de las Clases
1. Estudiante.java

Objetivo: Representar la entidad Estudiante con todos sus atributos y comportamientos.

Atributos:
Atributo	Tipo	Descripción
Ci	String	Carnet de identidad del estudiante
nombre	String	Nombre del estudiante
apellido	String	Apellido del estudiante
sexo	String	Sexo del estudiante
mesCumple	String	Mes de cumpleaños
año	int	Año académico que cursa
esMilitanteUJC	boolean	Indica si es militante de la UJC
esBecado	boolean	Indica si es becado

Métodos principales:

    Constructor con todos los parámetros.

    Getters y setters para cada atributo.

    toString(): Devuelve una representación en texto del estudiante.

2. Nodo.java

Objetivo: Representar un nodo de la lista simplemente enlazada, que contiene un dato y una referencia al siguiente nodo.

Atributos:
Atributo	Tipo	Descripción
dato	Estudiante	Información del estudiante almacenada
next	Nodo	Referencia al siguiente nodo de la lista

Métodos principales:

    Constructor que inicializa el dato y establece next como null.

    getDato() / setDato(): Acceso y modificación del dato.

    getNext() / setNext(): Acceso y modificación del siguiente nodo.

3. ListInterface.java

Objetivo: Definir el contrato (interfaz) que debe cumplir cualquier implementación de lista en el sistema.

Métodos declarados:
Método	Descripción
void add(Estudiante dato)	Añade un estudiante al final de la lista
boolean isEmpty()	Verifica si la lista está vacía
Estudiante get(int index)	Obtiene el estudiante en la posición indicada
Estudiante remove(int index)	Elimina y devuelve el estudiante en la posición indicada
4. LinkedList.java

Objetivo: Implementar la Lista Simplemente Enlazada y todos los métodos que responden a los incisos de la actividad.

Atributos:
Atributo	Tipo	Descripción
cabeza	Nodo	Primer nodo de la lista
size	int	Cantidad de elementos en la lista

Métodos de la interfaz implementados:

    add(Estudiante dato): Inserta un estudiante al final de la lista.

    isEmpty(): Retorna true si la lista no tiene elementos.

    get(int index): Devuelve el estudiante en la posición indicada (lanza excepción si el índice está fuera de rango).

    remove(int index): Elimina el estudiante en la posición indicada (lanza excepción si el índice está fuera de rango).

Métodos adicionales (resolución de los incisos):
 Inciso a) Cumpleaños(String mes)

Objetivo: Devolver un listado con los nombres de los estudiantes que cumplen años en un mes determinado.

Funcionamiento:

    Recorre la lista contando cuántos estudiantes cumplen años en el mes indicado.

    Si no hay ninguno, muestra un mensaje indicándolo.

    Si hay coincidencias, recorre nuevamente la lista y almacena los nombres en un arreglo.

    Imprime por pantalla el mes y los nombres de los estudiantes.

 Inciso b) CantMilitantes() (método privado auxiliar) y mostrarCantMilitantes()

Objetivo: Devolver un listado con la información de los estudiantes que son militantes de la UJC, ordenados por año de menor a mayor.

Funcionamiento:

    CantMilitantes(): Recorre la lista original y, por cada estudiante que sea militante de la UJC, lo inserta de forma ordenada por año en una nueva lista auxiliar.

    insertarOrdenadoPorAño(LinkedList destino, Estudiante e): Método auxiliar que inserta un estudiante en la posición correcta según su año (orden ascendente).

    mostrarCantMilitantes(): Muestra por pantalla la lista de militantes ordenados por año. Si la lista está vacía, lo indica.

    Nota: El método CantMilitantes() es privado y devuelve una nueva LinkedList con los militantes ordenados. mostrarCantMilitantes() se encarga de imprimir el resultado.

 Inciso c) CantBecados()

Objetivo: Devolver la cantidad de estudiantes becados.

Funcionamiento:

    Recorre toda la lista.

    Cuenta cuántos estudiantes tienen el atributo esBecado en true.

    Devuelve el total.

5. Main.java

Objetivo: Probar el funcionamiento de la lista y de todos los métodos implementados mediante casos de prueba.

Casos de prueba incluidos:

    Creación de 4 estudiantes con diferentes datos.

    Inserción de los estudiantes en la lista.

    Llamada a Cumpleaños("Septiembre") para listar los que cumplen en septiembre.

    Llamada a mostrarCantMilitantes() para mostrar los militantes ordenados por año.

    Llamada a CantBecados() para obtener el total de becados.

Ejemplo de salida esperada:

Estudiantes que cumplen años en Septiembre
Geonel
Edgar
Jorge
Estudiante{Ci='06091162386', nombre='Geonel', ...}
Estudiante{Ci='06010262386', nombre='Leonardo', ...}
Estudiante{Ci='06090562386', nombre='Edgar', ...}
Estudiante{Ci='06040362386', nombre='Jorge', ...}
Cantidad de estudiantes becados: 4


- Conclusiones

    Se implementó una Lista Simplemente Enlazada funcional con operaciones básicas (add, isEmpty, get, remove).

    Se resolvieron los tres incisos de la actividad utilizando recorridos sobre la lista y estructuras auxiliares.

    Se aplicaron conceptos de POO, genéricos implícitos (uso de Estudiante), y manejo de excepciones para índices fuera de rango.

    El código es modular, reutilizable y fácil de extender.

- Autor

Geonel Sánchez

    GitHub: @geonelsanchez36-stack
