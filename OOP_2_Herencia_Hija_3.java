public class OOP_2_Herencia_Hija_3 extends OOP_2_Herencia_Padre{
    private String Titulacion;
    private int AniosDeExperiencia;

    public OOP_2_Herencia_Hija_3(){
        super();
    }

    /**
     * @return the titulacion
     */
    public String getTitulacion() {
        return Titulacion;
    }

    /**
     * @param titulacion the titulacion to set
     */
    public void setTitulacion(String titulacion) {
        Titulacion = titulacion;
    }

    /**
     * @return the aniosDeExperiencia
     */
    public int getAniosDeExperiencia() {
        return AniosDeExperiencia;
    }

    /**
     * @param aniosDeExperiencia the aniosDeExperiencia to set
     */
    public void setAniosDeExperiencia(int aniosDeExperiencia) {
        AniosDeExperiencia = aniosDeExperiencia;
    }

    public void DarMasaje(){
        System.out.println("Dar masaje");
    }

    public OOP_2_Herencia_Hija_3(int id, String nombre, String apellido, int edad, String titulacion, int aniosExperiencia){
        super(id, nombre, apellido, edad);
        this.Titulacion = titulacion;
        this.AniosDeExperiencia = aniosExperiencia;
    }
}