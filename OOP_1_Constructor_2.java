class OOP_1_Constructor_2{

    String Saludo = "";

    //Constructor por defecton y sin parametros
    OOP_1_Constructor_2(){
        this.Saludo = "Hola mundo, mensaje por defecto";
    }

    //Constructor con parametros
    OOP_1_Constructor_2(String _Saludo){
        this.Saludo = _Saludo;
    }

    public static void main(String[] args) {
        OOP_1_Constructor_2 ConstructorSinParametros = new OOP_1_Constructor_2();
        System.out.println(ConstructorSinParametros.Saludo);

        OOP_1_Constructor_2 ConstructorParametros = new OOP_1_Constructor_2("Hola desde un parametro");
        System.out.println("\n" + ConstructorParametros.Saludo);
    }
}