package models;
import java.util.Set;
import java.util.HashSet;

//Escuela(nombre,disciplina, instructor_principal, pueblo, cantidad_estudiantes)

public class Escuela  {
    public Integer id;
    public String name, disciplina, instructorPrincipal, pueblo;

    public Escuela(){} //default contructor

    public Escuela(Integer id, String name, String disciplina, String instructorPrincipal, String pueblo){
        this.id = id;
        this.name = name;
        this.disciplina = disciplina;
        this.instructorPrincipal = instructorPrincipal;
        this.pueblo = pueblo;
    }

    //used temporary template to store escuela
    private static Set<Escuela> escuelas;
    static{
        escuelas = new HashSet<>();
        escuelas.add(new Escuela(1, "nombredeescula", "hawaiankenpo", "senseiwillie", "mayaguez"));
        escuelas.add(new Escuela(2, "nombredeescula2", "haiku", "mortalkombat", "japan"));

    }
    public static Set<Escuela> allEscuelas(){ //enseñar todas las escuelas
        return escuelas;
    }
    public static Escuela findById(Integer id){ //buscar escuelas por id
        for(Escuela escuela : escuelas){
            if(id.equals(escuela.id)){ //if find escuela we looking for
                return escuela; 
            }
        }
        return null; //if book not found;
    }
    public static void add(Escuela escuela){
        escuela.add(escuela);
    }
    public static boolean remove(Escuela escuela){
        return escuela.remove(escuela);
    }

}
