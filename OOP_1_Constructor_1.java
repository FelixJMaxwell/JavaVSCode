class OOP_1_Constructor_1{

    String saludo = "";
    int Contador = 0;

    //Constructor simple, dentro del mismo se setea el valor del saludo, despues en el main usando la sintaxis
    //NombreConstructor nombreObjeto = new NombreConstructor es importante usar la palabra reservada new para crear nuevos
    //objetos, para mostrar el saludo dentro del constructor simple, se utiliza nombreObjeto.saludo y se asigna donde se usara
    OOP_1_Constructor_1(){
        this.saludo = "Hola";
    }
    
    public static void main(String[] args) {
        OOP_1_Constructor_1 ConstructorSimple = new OOP_1_Constructor_1();
        System.out.println(ConstructorSimple.saludo);
    }

}