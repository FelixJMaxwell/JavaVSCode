# JavaVSCode
>Esto esta escrito para ser compilado en Visual Studio Code, se puede utilizar Netbeans o Eclipse sin problemas (no probado), para compilar y correr se deben ejecutar los tareas del archivo tasks.json, en la carpeta .vscode

>[Base para este repositorio](https://beginnersbook.com/java-tutorial-for-beginners-with-examples/)

Ejemplos de basico hasta avanzado con Java en VSCode

Los primeros 7 ejemplos, son la sintaxis de Java, ciclos, input del usuario, como mostrar mensajes en consola, condicionales etc. (Faltan varios mas pero mayormente con estos basta para iniciar a un nivel basico para entender el lenguaje, casi todos los cursos basicos sobre diferentes lenguajes muestran estos ejempls o parecidos)

## Programación orientada a Objetos

### Constructores
Se revisa primero el tema de constructores:
    Caracteristicas:
1. Tienen el mismo nombre de la clase
1. No puede ser heredado
1. No retornan valores
1. Deben declararse como public

Otra difinicion:  
> Un constructor se utiliza en la creación de un objeto que es una instancia de una clase. Generalmente lleva a cabo las operaciones requeridas para inicializar la clase antes de que los métodos sean invocados o se acceda a los campos. Los constructores nunca son heredados.

- En java un constructor es una especie de método que te permite inicializar los atributos de una clase.
- Existen varios tipos de constructores: 
    - Constructores sin parametros, con parametros

Ejemplo
```java
public class Persona {

    private String nombre;
    private String apellido;

    //Constructor sin parametros
    public Persona(){

    }

    //Constructor con parametros
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Getters y Setters irían aquí abajo ...
}

//Clase Main
public class Main {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.setNombre("Enrique");
        persona1.setApellido("Enrique");

        Persona persona2 = new Persona("Beto", "Beto");

        System.out.println(persona1.getNombre());
        System.out.println(persona2.getNombre());
    }
}
```

    Salida:
        Enrique
        Beto

- En una clase puedes tener cuantos constructores quieras siempre y cuando los parámetros que reciban sean diferentes a los de otros constructores, ya sea en cantidad o tipo

```java
public Persona(String nombre){
    // Código
}

public Persona(String apellido, int cualquierVariable){
    // Código
}

public Persona (Boolean cualquierOtraVariable) {
   // Código
}
```

### Palabra reservada: _Static_
Se puede utilizar con _clases, variables, metodos y bloques_, todo lo que sea declarado como _static_ pertenece a la clase y no a la instancia del objeto, por lo que se puede acceder a dichos miembros sin tener un objeto.

#### Static block
> Son usados para inicializar variables, se ejecutan en el momento en que la clase es cargada en memoria. Una clase puede tener multiples bloques estaticos y se ejecutan en el orden en que estan declarados.

Ejemplos:

###### bloque estatico simple
```java
class JavaExample{
   static int num;
   static String mystr;
   static{
      num = 97;
      mystr = "Static keyword in Java";
   }
   public static void main(String args[])
   {
      System.out.println("Value of num: "+num);
      System.out.println("Value of mystr: "+mystr);
   }
}

```

    Salida en consola:
        Value of num: 97
        Value of mystr: Static keyword in Java

###### bloque estatico multiple
```java
class JavaExample2{
   static int num;
   static String mystr;
   //First Static block
   static{
      System.out.println("Static Block 1");
      num = 68;
      mystr = "Block1";
  } 
  //Second static block
  static{
      System.out.println("Static Block 2");
      num = 98;
      mystr = "Block2";
  }
  public static void main(String args[])
  {
      System.out.println("Value of num: "+num);
      System.out.println("Value of mystr: "+mystr);
   }
}
```

    Salida:
        Static Block 1
        Static Block 2
        Value of num: 98
        Value of mystr: Block2

#### Variables Static


- Una variable estatic es comun entre todas las instancias existentes de la clase a la que pertenece, se entienda que: Solo existe una variable para que se comparte entre todas las instancias de la clase. 

> Ejemplo: si tenemos una _Class Persona_, una variable Static Apellido y tres objetos de la clase persona; persona1, persona2, persona3, los tres objetos persona compartiran el Apellido  
Si Apellido = "Diaz"  
persona1, persona2, persona3 pueden tener diferentes nombres pero mismo Apellido  
Si se cambia el valor de apellido, sera el mismo para todos los objetos de la clase Persona

- Las variables estaticas pueden ser accedidas desde metodos no estaticos como estaticos

###### Metodos Static y Clases Static
- De igual que las variables pueden ser accedidos desde estaticos y no estaticos
    - No se puede hacer Override de metodos estaticos

- Las clases solo pueden ser estaticas si son declaradas dentro de otra clase no estatica

| _Resumen / Opinion Personal_ |
|--|
| (Tengo que agregar mas cosas referentes al tipo _static_ pero realmente me es complicado de entender la teoria sobre esta parte, en general, se podria decir que static da cierto grado de libertad para poder usar los metodos, clases y variables, sin tener que crear algun objeto que haga referencia a la clase que los contiene, **Ahora de acuerdo a todos los tutoriales que dictan "Programacion basica", lo anterior una ves comprendido en un lenguaje se puede aplicar a todos los lenguajes, mas que aprender lo anterior es importante conseguir una buena logica**) |


### Herencia
>[Ejemplos extraidos de aqui](https://jarroba.com/herencia-en-la-programacion-orientada-a-objetos-ejemplo-en-java/)

> La Herencia es uno de los _cuatro_ pilares de la programación orientada a objetos (POO) junto con la _**Abstracción**, **Encapsulación** y **Polimorfismo**_.

Definiciones: 
> - **La herencia es un mecanismo que permite la definición de una clase a partir de la definición de otra ya existente.**  
> - **La herencia permite compartir automáticamente métodos y datos entre clases, subclases y objetos.**
> - **la herencia es permitir la creación de  nuevas clases basadas en clases existentes.**

_Tomando en cuenta las definiciones anteriores debemos crear una clase **Padre o Superclase** que contendra **atributos**, **variables** y **metodos**, a su ves crearemos clases denominadas como "hijas" que heredan de la clase padre todo lo mencionado anteriormente, sin embargo las clases hijas no heredan metodos o atributos privados_

#### Ejemplo

| Futbolista | Entrenador | Masajista |
|:-:|:-:|:-:|
| **Variables** | **Variables** | **Variables** |
| id: Integer | id: Integer | id: Integer |
| Nombre: String | Nombre: String | Nombre: String |
| Apellidos: String | Apellidos: String | Apellidos: String |
| Edad: Integer | Edad: Integer | Edad: Integer |
| Dorsal: Integer | idFederacion: String | Titulacion: String |
| **Metodos** | **Metodos** | **Metodos** |
| Demarcacion: String | Concentracion(): void | Concentracion(): void |
| Concentracion(): void | Viajar(): void | Viajar(): void |
| Viajar(): void | dirigirPartido(): void | darMasaje(): void |
| JugarPartido(): void | dirigirEntrenamiento(): void |
| Entrenar(): void |

Si pasamos lo anterior a codigo, tendriamos que repetir las variables y metodos que tienen en comun varias veces. Si tomamos en cuenta dichos valores repetidos en cada clase, podemos crear una clase padre y darle los valores que se repiten para solamente crear clases hijos y extender la clase padre.

Codigo de ejemplo, sin POO:
![imagen](https://raw.githubusercontent.com/FelixJMaxwell/JavaVSCode/master/SinPOO.png)

### Clase padre o Superclase
|Persona|
|:-:|
|**Variables**|
|id: Integer|
|Nombre: String|
|Apellidos: String|
|Edad: Integer|
|**Metodos**|
|Concentrarse(): void|
|Viajar(): void|

#### Clases hijas
|Futbolista|Entrenador|Masajista|
|:-:|:-:|:-:|
|**Variables**|**Variables**|**Variables**|
|dorsal: Integer|idFederacion(): String|titulacion: String|
|demarcacion: String||añosExperiencia: integer|
|**Metodos**|**Metodos**|**Metodos**|
|jugarPartido(): void|dirigirPartido(): void|darMasaje(): void|
|entrenar(): void|dirigirEntrenamiento(): void|

Codigo de ejemplo, con POO:
![imagen](https://raw.githubusercontent.com/FelixJMaxwell/JavaVSCode/master/ConPOO.png)

Ejemplos de codigo son los archivos:
- OOP_2_Herencia_Padre
    - Contiene las variables, metodos, etc, que se considera son "comunes" entre varios elementos u objetos
- OOP_2_Herencia_main  
    - Desde aqui se ejecuta el programa, se crean los objetos y las referencias a las distintas clases padre o hijas
- OOP_2_Herencia_Hja_**n**
    - Desde aca se extiende la clase padre, si el objeto a crear finalmente tiene alguna relacion con los daatos albergados en la clase padre

_Anotacion importante_
Los **Nombres** usados en los archivos son meramente como "ejemplo" (uno muy malo), la clase padre debe tener variables o metodos que servirian como **"comun denominador"** de todos los objetos; en este ejemplo deberia llamarse "Persona", puesto que todas las personas tienen en comun, nombre, apellido, genero, edad mas no todas tienen en comun, profesiones, educacion, etc.  

Por lo tanto se debe extender la clase Padre (Persona) en diferentes clases por ejemplo:
- clase hija: Jugadores
    - A la que se le pueden agregar mas variables como: "TipoJugador" o "TipoJuego"
- clase hija: Profesionista
    - A la que se le pueden agregar mas variables como: "EstudiosRealizados", "GradoAcademico"

De igual forma se puede construir una clase Padre: Mascota, con sus respectivas clases hijas.

| _Resumen / Opinion Personal_ |
|--|
| No se me da algo de hueva la POO/OOP (Demasiados archivos para crear) aunque supongo que debo tener en **consideracion** el hecho de los nombres de los mismos archivos (xD) que mi ejemplo es un desmadre de nombres raros, largos y nada que ver con lo que representan |

> Siguiendo con teoria de POO

### Sobrecarga de metodos (Method Overloading)

 - Permite a una clase tener mas de un metodo con el mismo nombre si sus argumentos/parametros son diferentes, es similar a la sobrecarga del constructor.

##### Ejemplo: Diferente numero de parametros

```Java
class Sobrecarga{
    public void hello(char c){
        System.out.println(c);
    }

    public void hello(char c, int num){
        System.out.println(c + " " + num);
    }
}

class Ejemplo{
    public static void main(String args[]){
        Sobrecarga obj = new Sobrecarga();
        obj.hello("a");
        obj.hello("a", 10);
    }
}
 ```

    Salida:
        a
        a 10

##### Ejemplo: Misma cantidad de parametros con diferentes tipos

```java
class SobrecargaDos{
    public void World(char c){
        System.out.println(c);
    }

    public void World(int c){
        System.out.println(c);
    }
}

class EjemploDos{
    public static void main (String args[]){
        SobrecargaDos obj = new SobrecargaDos();
        obj.World("a");
        obj.World(10);
    }
}
```

    Salida:
        a
        10

##### Ejemplo: Misma cantidad de parametros diferente orden

```java
class SobrecargaTres{
    public void Something(char c, int num){
        System.out.println("first test for overloading");
    }

    public void Something(int num, char c){
        System.out.println("Second test for overloading");
    }
}

class EjemploTres{
    SobrecargaTres obj = new SobrecargaTres();
    obj.Something("a", 10);
    obj.Something(11, "b");
}
```

    Salida:
        first test for overloading
        Second test for overloading

### Anulacion de metodos (Method Override)

> Extra: Lo dejare como anulacion, creo que tambien puede ser sobre escritura pero ni el traductor de google me da la razon.

Definiciones:
>- Declarar un metodo en una **clase hija** cuando este metodo ya esta presente en la **clase Padre** es conocido como anulacion (override)  
>- La anulacion es util o es usada para que la clase hija pueda tener su propia implementacion.

###### ~~Estupida classpath~~

Reglas de la anulacion de metodos
>- Los parametros o argumentos del metodo que sera sobreescrito deben ser del mismo tipo y tener la misma cantidad de parametros asi como la secuencia en que estan declarados los mismos.
>- Solo se pueden anular los metodos publicos
>- No se pueden anular metodos de tipo _final_, _privados_ o _static_, estos son especificos de la clase **Padre**.

Codigo de ejemplo:
```java
Clase Human:

class OOP_3_Human{
    public void eat(){
        System.out.println("Human is eating");
    }
}
```

```java
Clase Boy:

class OOP_3_Boy{
    public void eat(){
        System.out.println("Boy is eating");
    }

    public static void main(String[] args){
        OOP_3_Boy obj = new OOP_3_Boy();
        obj.eat();
    }
}
```

    Lo anterior da como resultado:
        "Boy is eating"

>Ventajas de la anulacion de metodos:  
>- Una clase puede dar su propia implementacion de un metodo sin modificar la implementacion de la clase padre.
>- Si una clase tiene diferentes **Hijos** de una misma clase **Padre**, los _hijos_ pueden usar la implementacion de la clase **PERO** en caso de necesitar una implementacion diferente del mismo metodo se puede sobreescribir sin modificar la implementacion de la clase padre.

&nbsp;

|Resumen / Opinion Personal|
|:-:|
|No agregue codigos de ejemplo para la primera parte: Sobrecarga, Es bastante sencillo de la teoria detras de esta parte debido a que como lo mencione arriba es parecida a los constructores con diferentes parametros e implementaciones.
No he terminado de entender completamente la funcion o teoria detras de la anulacion de metodos pero una forma sencilla de decirlo es el segundo punto de las ventajas citadas arriba.|
|**Hace falta revisar la parte de polimorfismo en tiempo de ejecución** ~~Por si lo anterior no habia terminado de entenderlo~~|

Ejemplo de _Polimorfismo en tiempo de ejecución_

```java
class ABC{
   //Overridden method
   public void disp()
   {
	System.out.println("disp() method of parent class");
   }	   
}
class Demo extends ABC{
   //Overriding method
   public void disp(){
	System.out.println("disp() method of Child class");
   }
   public void newMethod(){
	System.out.println("new method of child class");
   }
   public static void main( String args[]) {
	/* When Parent class reference refers to the parent class object
	 * then in this case overridden method (the method of parent class)
	 *  is called.
	 */
	ABC obj = new ABC();
	obj.disp();

	/* When parent class reference refers to the child class object
	 * then the overriding method (method of child class) is called.
	 * This is called dynamic method dispatch and runtime polymorphism
	 */
	ABC obj2 = new Demo();
	obj2.disp();
   }
}
```

## Uso de la libreria IO

|Resumen / Opinion personal|
|:-:|
|Tema algo aparte, se revisa la libreria IO para creacion, lectura, escritura y eliminación de archivos, se trabaja unicamente con archivos de texto plano (txt)
Siguiendo un poco por el hecho de que considero esto como un repaso del lenguaje Java, igual continuare agregando otras secciones mas adelante|

### Archivos para estos ejercicios:
- IO_1.java
    - Creacion de archivos
- IO_2.java
    - Lectura de archivos, mostrar texto del archivo en consola
- IO_3.java
    - Escritura de archivos borrando el contenido previo
- IO_4.java
    - Escritura de archivos sin borrar el contenido del mismo (append)
- IO_5.java
    - Borrado de archivos dada una direccion


&nbsp;
    
> No pongo el codigo de los archivos como snipet porque haria mas grande todo esto, ademas el mismo puede ser consultado arriba