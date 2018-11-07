import java.util.ArrayList;

public class OOP_2_Herencia_Main{

    public static ArrayList<OOP_2_Herencia_Padre> Personas = new ArrayList<OOP_2_Herencia_Padre>();

    public static void main(String[] args){
        OOP_2_Herencia_Hija_1 futbolista = new OOP_2_Herencia_Hija_1(1, "Vicente", "Fernandes", 15, 60, "284EZ89");
        OOP_2_Herencia_Hija_2 Trainer = new OOP_2_Herencia_Hija_2(2, "Perdon", "Paramo", 29, "testFed");
        OOP_2_Herencia_Hija_3 Masajista = new OOP_2_Herencia_Hija_3(3, "Masa", "Jista", 22, "Licenciada Fisioterapeuta", 3);

        Personas.add(futbolista);
        Personas.add(Trainer);
        Personas.add(Masajista);

        // CONCENTRACION
        System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo método)");
        
        for(OOP_2_Herencia_Padre persona : Personas){
            System.out.print(persona.getNombre() + " " + persona.getApellido() + " -> ");
            persona.Concentrarse();
        }

        // VIAJE
		System.out.println("\nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
		for (OOP_2_Herencia_Padre persona : Personas) {
			System.out.print(persona.getNombre() + " " + persona.getApellido() + " -> ");
			persona.Viajar();
		}

        //ENTRENAMIENTO
        System.out.println("\nEntrenamiento: Solamente el entrenador y el futbolista tiene metodos para entrenar:");
        System.out.print(Trainer.getNombre() + " " + Trainer.getApellido() +" -> ");
        Trainer.DirigirEntrenamiento();
        System.out.print(futbolista.getNombre() + " " + futbolista.getApellido() +" -> ");
        futbolista.Entrenar();

        // MASAJE
        System.out.println("\nMasaje: Solo el masajista tiene el método para dar un masaje:");
        System.out.print(Masajista.getNombre() + " " + Masajista.getApellido() +" -> ");
        Masajista.DarMasaje();

        // PARTIDO DE FUTBOL
        System.out.println("\nPartido de Fútbol: Solamente el entrenador y el futbolista tiene metodos para el partido de fútbol:");
        System.out.print(Trainer.getNombre() + " " + Trainer.getApellido() + " -> ");
        Trainer.DirigirPartido();
        System.out.print(futbolista.getNombre() + " " + futbolista.getApellido() + " -> ");
        futbolista.JugarPartido();

        System.out.println("\n\nDesde el main, fin del programa");
    }
}