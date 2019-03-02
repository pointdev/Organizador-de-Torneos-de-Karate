package models;
import java.util.Set;
import java.util.HashSet;

//Estudiante(numero, nombre, apellido1, apellido2, cinta, edad, escuela, codigo_participacion)

public class Estudiante  {
    public Integer id;
    public String fname, lname, lname2, cinta, escuela;
    public Integer edad, codigoParticipacion;

    public Estudiante(){} //default constructor

    public Estudiante(Integer id, String fname, String lname, String lname2, String cinta, Integer edad, String escuela, Integer codigoParticipacion){
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.lname2 = lname2;
        this.cinta = cinta;
        this.edad = edad;
        this.escuela = escuela;
        this.codigoParticipacion = codigoParticipacion;
    }

    //used temporary template to store estudiante
    private static Set<Estudiante> estudiantes;
    static{
        estudiantes = new HashSet<>();
        estudiantes.add(new Estudiante(1, juan, crespo, villanueva, roja, 21, hawaiankenpo, 1001));
        estudiantes.add(new Estudiante(2, annamary, cartagena, velez, azul, 21, mortalkombat, 0101));

    }
    public static Set<Estudiante> allEstudiantes(){ //enseñar todas las estudiantes
        return estudiantes;
    }
    public static Estudiante findById(Integer id){ //buscar estudiantes por id
        for(Estudiante estudiante : estudiantes){
            if(id.equals(estudiante.id)){ //if find estudiante we looking for
                return estudiante; 
            }
        }
        return null; //if book not found;
    }
    public static void add(Estudiante estudiante){
        estudiante.add(estudiante);
    }
    public static boolean remove(Estudiante estudiante){
        return estudiante.remove(estudiante);
    }
}
