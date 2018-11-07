public class OOP_2_Herencia_Hija_2 extends OOP_2_Herencia_Padre{
    private String idFederacion;
    
    public OOP_2_Herencia_Hija_2(){
        super();
    }

    /**
     * @return the idFederacion
     */
    public String getIdFederacion() {
        return idFederacion;
    }

    /**
     * @param idFederacion the idFederacion to set
     */
    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public void DirigirPartido(){
        System.out.println("Dirigiendo partido");
    }

    public void DirigirEntrenamiento(){
        System.out.println("Dirigir entrenamiento");
    }

    public OOP_2_Herencia_Hija_2(int id, String nombre, String apellido, int edad, String idFederaciom){
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederaciom;
    }
}