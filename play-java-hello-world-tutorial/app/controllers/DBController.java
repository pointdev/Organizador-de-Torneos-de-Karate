package controllers;

import java.util.List;
import play.mvc.*;
import views.html.organizador.*;
import java.util.Set;
import play.data.Form;
import play.data.FormFactory;
import models.*;
import javax.inject.Inject;
import com.sun.org.apache.regexp.internal.recompile;
import java.lang.*;
import java.lang.ProcessBuilder.Redirect;
import org.omg.CosNaming.NamingContextPackage.NotFound;


public class DBController extends Controller {
    @Inject
    FormFactory formFactory;


    //showing escuela al usuario 
    public Result indexEscuela(){
        Set<Escuela> escuelas = Escuela.allEscuelas();
        return ok(indexEscuela.render(escuelas));
    }
    //crear una Escuela
    public Result createEscuela(){
        Form<Escuela> escuelaForm =  formFactory.form(Escuela.class);
        return ok(createEscuela.render(escuelaForm));
        }

    //guardar una escuela
    public Result saveEscuela(){
        Form<Escuela> escuelaForm = formFactory.form(Escuela.class).bindFromRequest();
        Escuela escuela = escuelaForm.get();
        Escuela.add(escuela);
        return redirect(routes.DBController.indexEscuela());
    }

    //editar una escuela
    public Result editEscuela(Integer id){
        Escuela escuela = Escuela.findById(id);
        if(escuela == null){
            return notFound("Escuela no encontrado");
        }
        Form<Escuela> escuelaForm = formFactory.form(Escuela.class).fill(escuela);
        return ok(editEscuela.render(escuelaForm));
    }

    //update database
    public Result updateEscuela(){
        Form<Escuela> escuelaForm = formFactory.form(Escuela.class).bindFromRequest();
        Escuela escuela = escuelaForm.get();
        Escuela oldEscuela = Escuela.findById(escuela.id);
        if(oldEscuela == null){
            return notFound("Escuela no encontrado");
        }
        oldEscuela.instructorPrincipal = escuela.instructorPrincipal;
        oldEscuela.name = escuela.name;
        oldEscuela.pueblo = escuela.pueblo;
        oldEscuela.disciplina = escuela.disciplina;
        
        return redirect(routes.DBController.indexEscuela());
    }

    //enseñar database
    public Result showEscuela(Integer id){
        Escuela escuela = Escuela.findById(id);
        if(escuela == null){
            return notFound("Escuela no encontrado");
        }
        return ok(showEscuela.render(escuela));
    }

    //destroy database
    public Result deleteEscuela(Integer id){
        Escuela escuela = Escuela.findById(id);
        if(escuela == null){
            return notFound("Escuela no encontrado");
        }
        Escuela.remove(escuela);

        return redirect(routes.DBController.indexEscuela());
    }



    //==============================================================================

    //showing estudiante al usuario 
    public Result indexEstudiante(){
        Set<Estudiante> estudiantes = Estudiante.allEstudiantes();
        return ok(indexEstudiante.render(estudiantes));
    }

    //crear un estudiante
    public Result createEstudiante(){
        Form<Estudiante> estudianteForm =  formFactory.form(Estudiante.class);
        return ok(createEstudiante.render(estudianteForm));
    }

    //guardar un estudiante
    public Result saveEstudiante(){
        Form<Estudiante> estudianteForm = formFactory.form(Estudiante.class).bindFromRequest();
        Estudiante estudiante = estudianteForm.get();
        Estudiante.add(estudiante);
        return redirect(routes.DBController.indexEstudiante());
    }

    //editar un estudiante
    public Result editEstudiante(Integer id){
        Estudiante estudiante = Estudiante.findById(id);
        if(estudiante == null){
            return notFound("Estudiante no encontrado");
        }
        Form<Estudiante> estudianteForm = formFactory.form(Estudiante.class).fill(estudiante);
        return ok(editEstudiante.render(estudianteForm));
    }

    //update database
    public Result updateEstudiante(){
        Form<Estudiante> estudianteForm = formFactory.form(Estudiante.class).bindFromRequest();
        Estudiante estudiante = estudianteForm.get();
        Estudiante oldEstudiante = Estudiante.findById(estudiante.id);
        if(oldEstudiante == null){
            return notFound("Estudiante no encontrado");
        }
        
        oldEstudiante.fname = estudiante.fname;
        oldEstudiante.lname = estudiante.lname;
        oldEstudiante.lname2 = estudiante.lname2;
        oldEstudiante.cinta = estudiante.cinta;
        oldEstudiante.edad = estudiante.edad;
        oldEstudiante.escuela = estudiante.escuela;
        oldEstudiante.codigoParticipacion = estudiante.codigoParticipacion;

        return redirect(routes.DBController.indexEstudiante());
    }

    //enseñar estudiante
    public Result showEstudiante(Integer id){
        Estudiante estudiante = Estudiante.findById(id);
        if(estudiante == null){
            return notFound("Estudiante no encontrado");
        }
        return ok(showEstudiante.render(estudiante));
    }

    //destroy estudiante
    public Result deleteEstudiante(Integer id){
        Estudiante estudiante = Estudiante.findById(id);
        if(estudiante == null){
            return notFound("Estudiante no encontrado");
        }
        Estudiante.remove(estudiante);

        return redirect(routes.DBController.indexEstudiante());
    }
}