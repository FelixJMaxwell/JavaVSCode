public class OOP_2_Herencia_Hija_1 extends OOP_2_Herencia_Padre{
    private int Dorsal;
    private String Demarcacion;

    public OOP_2_Herencia_Hija_1(){
        super();
    }

    /**
     * @return the demarcacion
     */
    public String getDemarcacion() {
        return Demarcacion;
    }

    /**
     * @return the dorsal
     */
    public int getDorsal() {
        return Dorsal;
    }

    /**
     * @param demarcacion the demarcacion to set
     */
    public void setDemarcacion(String demarcacion) {
        Demarcacion = demarcacion;
    }

    /**
     * @param dorsal the dorsal to set
     */
    public void setDorsal(int dorsal) {
        Dorsal = dorsal;
    }

    public void JugarPartido(){
        System.out.println("Jugando partido");
    }

    public void Entrenar(){
        System.out.println("Entrenando");
    }

    public OOP_2_Herencia_Hija_1(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
		super(id, nombre, apellidos, edad);
		this.Dorsal = dorsal;
		this.Demarcacion = demarcacion;
	}
}