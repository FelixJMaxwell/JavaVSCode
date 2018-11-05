# JavaVSCode
>Esto esta escrito para ser compilado en Visual Studio Code, se puede utilizar Netbeans o Eclipse sin problemas (no probado), para compilar y correr se deben ejecutar los tareas del archivo tasks.json, en la carpeta .vscode ~~Los comentarios tachados de esta forma son mera opinion personal, no es necesario estar de acuerdo, cada quien tiene su forma de ver o hacer las cosas, si tienes alguna sugerencia para mejorar lo aqui expuesto hasmelo saber~~

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

~~(Tengo que agregar mas cosas referentes al tipo _static_ pero realmente me es complicado de entender la teoria sobre esta parte, en general, se podria decir que static da cierto grado de libertad para poder usar los metodos, clases y variables, sin tener que crear algun objeto que haga referencia a la clase que los contiene)~~

### Herencia
>[Ejemplos extraidos de aqui](https://jarroba.com/herencia-en-la-programacion-orientada-a-objetos-ejemplo-en-java/)

> La Herencia es uno de los _cuatro_ pilares de la programación orientada a objetos (POO) junto con la _**Abstracción**, **Encapsulación** y **Polimorfismo**_.

Definiciones: 
> - **La herencia es un mecanismo que permite la definición de una clase a partir de la definición de otra ya existente.**  
> - **La herencia permite compartir automáticamente métodos y datos entre clases, subclases y objetos.**
> - **la herencia es permitir la creación de  nuevas clases basadas en clases existentes.**

_Tomando en cuenta las definiciones anteriores debemos crear una clase **Padre o Superclase** que contendra **atributos**, **variables** y **metodos**, a su ves crearemos clases denominadas como "hijas" que heredan de la clase padre todo lo mencionado anteriormente, sin embargo las clases hijas no heredan metodos o atributos privados_

#### Ejemplo

Teniendo las siguientes clases:  
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
![imagen](\SinPOO.png)

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
![imagen](\ConPOO.png)